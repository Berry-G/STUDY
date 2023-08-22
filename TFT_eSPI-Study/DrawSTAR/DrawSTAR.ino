#include "rm67162.h"
#include "TFT_eSPI.h"

#define LCD_WIDTH       240
#define LCD_HEIGHT      536
#define PORTRAIT        0
#define LANDSCAPE       1

//TFT라이브러리 객체 생성
TFT_eSPI tft = TFT_eSPI();
TFT_eSprite sprite = TFT_eSprite(&tft);

void setup()
{
  rm67162_init();  // amoled lcd initialization
  lcd_setRotation(PORTRAIT);
  sprite.createSprite(LCD_WIDTH, LCD_HEIGHT);
  sprite.setSwapBytes(1);

  pinMode(PIN_BUTTON_1, INPUT_PULLUP);
  pinMode(PIN_BUTTON_2, INPUT_PULLUP);
  Serial.begin(9600);
}

#define MAX_PAGE   6
int8_t draw_page_cnt=0;

void draw()
{
  sprite.fillSprite(TFT_BLACK);

  //overflow & underflow 방지
  if(draw_page_cnt < 0)
    draw_page_cnt = MAX_PAGE;
  else if(draw_page_cnt > MAX_PAGE)
    draw_page_cnt = 0;



  lcd_PushColors(0, 0, LCD_WIDTH, LCD_HEIGHT, (uint16_t*)sprite.getPointer());
}

uint8_t key_state = HIGH;            // 채터링 방지
const uint8_t debounce_delay = 900;  // 디바운싱 대기 시간 (900ms / 800 중복입력 발생)

void loop()
{
  uint8_t key = digitalRead(PIN_BUTTON_1);

  if (key == LOW)
  {
    // 버튼이 눌린 경우
    if (key_state == HIGH)
    {
      draw_page_cnt--;
      key_state = LOW;
      delay(debounce_delay);  // 디바운싱 대기
    }
  }
  else
  {
    // 버튼이 눌리지 않은 경우
    key_state = HIGH;
  }

  key = digitalRead(PIN_BUTTON_2);

  if (key == LOW)
  {
    // 버튼이 눌린 경우
    if (key_state == HIGH)
    {
      draw_page_cnt++;
      key_state = LOW;
      delay(debounce_delay);  // 디바운싱 대기
    }
  }
  else
  {
    // 버튼이 눌리지 않은 경우
    key_state = HIGH;
  }

  draw();
  delay(50);
}