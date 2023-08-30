#include "rm67162.h"
#include <TFT_eSPI.h>

#define LCD_WIDTH       240
#define LCD_HEIGHT      536
#define PORTRAIT        0
#define LANDSCAPE       1

#define RADIUS_X        (120-60)
#define RADIUS_Y        (120-60)

#define CENTER_X1       120
#define CENTER_Y1       (120)
#define CENTER_X2       120
#define CENTER_Y2       (370)

#define AXIS_LEFT       90
#define AXIS_WIDTH      130
#define AXIS_RIGHT      (AXIS_LEFT+AXIS_WIDTH)
#define AXIS_TOP        85
#define AXIS_HEIGHT     180
#define AXIS_BOTTOM     (AXIS_TOP+AXIS_HEIGHT)
#define CHANNEL_OFFSET  220
#define PIXEL_PER_SCALE (AXIS_HEIGHT/10)
#define SCALE_WIDTH     15

#define TRIANGLE        18

#define BAR_WIDTH       70
#define BAR_LEFT        (AXIS_LEFT+(AXIS_WIDTH-BAR_WIDTH)/2)
#define BAR_BOTTOM      (AXIS_TOP+AXIS_HEIGHT)

TFT_eSPI tft = TFT_eSPI();
TFT_eSprite sprite = TFT_eSprite(&tft);

void setup()
{
  rm67162_init();  // amoled lcd initialization
  lcd_setRotation(PORTRAIT);
  sprite.createSprite(LCD_WIDTH, LCD_HEIGHT);
  sprite.setSwapBytes(1);
}

/***************************************************************************************
** Function name:           drawCircle
** Description:             주어진 x, y 좌표로부터 반지름 r의 원을 그림
***************************************************************************************/
void exercise_drawCircle()
{
  sprite.drawCircle(LCD_WIDTH / 2, LCD_HEIGHT / 2, 119, TFT_WHITE);
//  sprite.drawCircle(x, y, r, color);
}



/***************************************************************************************
** Function name:           drawCircleHelper
** param:                   (int32_t x0, int32_t y0, int32_t rr, uint8_t cornername, uint32_t color)
** Description:             주어진 x, y 좌표로부터 반지름 r의 원을 시계방향으로 사분면에 그림
                            사분면 3 4 1 2 사분면 순으로 그려짐.
                                0b 0 0 0 1  (2진수)
***************************************************************************************/
void exercise_drawCircleHelper()
{
  // sprite.drawCircleHelper(LCD_WIDTH / 2, LCD_HEIGHT / 2, 50, i, TFT_RED+i);
  sprite.drawCircleHelper(LCD_WIDTH / 2, LCD_HEIGHT / 2, 50, 0b0001, TFT_RED);
  sprite.drawCircleHelper(LCD_WIDTH / 2, LCD_HEIGHT / 2, 70, 0b0010, TFT_GREEN);
  sprite.drawCircleHelper(LCD_WIDTH / 2, LCD_HEIGHT / 2, 100, 0b0100, TFT_BLUE);
  sprite.drawCircleHelper(LCD_WIDTH / 2, LCD_HEIGHT / 2, 120, 0b1000, TFT_YELLOW);
  sprite.drawCircleHelper(LCD_WIDTH / 2, LCD_HEIGHT / 2, 30, 0b1010, TFT_PURPLE);
}

/***************************************************************************************
** Function name:           fillRectVGradient, fillRectHGradient
** param:                   (int16_t x, int16_t y, int16_t w, int16_t h, uint32_t color1, uint32_t color2)
** Description:             주어진 x, y 좌표가 좌상단 꼭짓점 좌표인 사각형을 가로w(우), 세로h(하) 만큼 그리고
                            color1 부터 color2 까지의 색으로 채움
                            fillRectVGradient : 세로방향(상color1 → 하color2)
                            fillRectHGradient : 가로방향(좌color1 → 우color2)
***************************************************************************************/
void exercise_gradientFill()
{
  sprite.fillRectVGradient(0, 0, LCD_WIDTH, LCD_HEIGHT, TFT_WHITE, TFT_RED);
  sprite.fillRectHGradient(LCD_WIDTH/2, LCD_HEIGHT/2, LCD_WIDTH, LCD_HEIGHT, TFT_BLACK, TFT_YELLOW);
}

// 좌표평면 그래프 틀 그리기
void drawAxis()
{
  sprite.drawRect(0, 0, LCD_WIDTH, LCD_HEIGHT, TFT_OLIVE);
  sprite.drawFastVLine(LCD_WIDTH / 2, 0, LCD_HEIGHT, TFT_OLIVE);
  sprite.drawFastHLine(0, LCD_HEIGHT / 2, LCD_HEIGHT, TFT_OLIVE);
}

void draw()
{
  sprite.fillSprite(TFT_BLACK);

  drawAxis();
  exercise_drawCircleHelper();


  // char i_str[10]; // 충분한 길이의 문자열 버퍼
  // itoa(i, i_str, 10);
  // sprite.drawCentreString(i_str, LCD_WIDTH / 2, 30, 6);


  lcd_PushColors(0, 0, 240, 536, (uint16_t*)sprite.getPointer());

}


void loop()
{
  draw();
  delay(50);

}





