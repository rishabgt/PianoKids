
package com.example.pianokids;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final int NR_OF_MAXSTREAM = 12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SoundPool mSoundPool = new SoundPool(NR_OF_MAXSTREAM, AudioManager.STREAM_MUSIC,1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
