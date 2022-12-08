package org.techtown.muter;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.media.AudioManager;

public class MainActivity extends AppCompatActivity {

    private AudioManager mAudioManager;
    private BottomNavigationView bottomNavigationView;

    Button btn_normal;
    Button btn_vibe;
    Button btn_silent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //무음모드에 필요한 권한들. 없다면 창 띄우기
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (!notificationManager.isNotificationPolicyAccessGranted()) {

            startActivity(new Intent(android.provider.Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS));
        }


        //오디오 매니저
        mAudioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        btn_normal = findViewById(R.id.btn_normal);
        btn_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //버튼눌렀을때 동작
                mAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                Toast.makeText(getApplicationContext(), "버튼을 눌렀습니다", Toast.LENGTH_LONG).show();
            }
        });

        btn_vibe = findViewById(R.id.btn_vibe);
        btn_vibe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //버튼눌렀을때 동작
                mAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                Toast.makeText(getApplicationContext(), "버튼을 눌렀습니다", Toast.LENGTH_LONG).show();
            }
        });
        btn_silent = findViewById(R.id.btn_silent);
        btn_silent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //버튼눌렀을때 동작
                mAudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
                Toast.makeText(getApplicationContext(), "버튼을 눌렀습니다", Toast.LENGTH_LONG).show();
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                                                          //플로팅 액션 버튼 눌렀을 때 동작
                Intent intent = new Intent(MainActivity.this, AddPage.class);       //추가 화면으로 이동
                startActivity(intent);
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_SHORT)
//                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
