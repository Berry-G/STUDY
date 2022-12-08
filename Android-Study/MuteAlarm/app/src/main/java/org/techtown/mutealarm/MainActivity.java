package org.techtown.mutealarm;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AudioManager audioManager = (AudioManager)context.getSystemService(Context.AUDIO_SERVICE);
        String message = null;
        switch (audioManager.getRingerMode()) {
            case AudioManager.RINGER_MODE_NORMAL:
                message = "벨소리 모드입니다";
                break;
            case AudioManager.RINGER_MODE_SILENT:
                message = "무음 모드입니다";
                break;
            case AudioManager.RINGER_MODE_VIBRATE:
                message = "진동 모드입니다";
                break;
        }
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
