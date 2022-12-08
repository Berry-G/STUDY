package org.techtown.helloapk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)          //시작 지점
    {
        super.onCreate(savedInstanceState);                     //super : 상속받은 클래스에서 부모를 가르킬 때
        setContentView(R.layout.activity_main);                 //setContentView : 화면에 무엇을 보여줄 지 설정
    }

    public void onButton1Clicked(View v)
    {
        Toast.makeText(this, "예림아 사랑해!!!!!!", Toast.LENGTH_LONG).show();
    }
}
