
package com.example.pianokids;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final int NR_OF_MAXSTREAM = 12;
    private int mBSoundId;
    private int mHSoundId;
    private int mNSoundId;
    private int mJSoundId;
    private int mMSoundId;
    private int mQSoundId;
    private int m2SoundId;
    private int mWSoundId;
    private int m3SoundId;
    private int mESoundId;
    private int mRSoundId;
    private int m5SoundId;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    SoundPool mSoundPool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mSoundPool = new SoundPool(NR_OF_MAXSTREAM, AudioManager.STREAM_MUSIC,1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBSoundId = mSoundPool.load(this,R.raw.pb,1);
        mHSoundId = mSoundPool.load(this,R.raw.ph,1);
        mNSoundId = mSoundPool.load(this,R.raw.pn,1);
        mJSoundId = mSoundPool.load(this,R.raw.pj,1);
        mMSoundId = mSoundPool.load(this,R.raw.pm,1);
        mQSoundId = mSoundPool.load(this,R.raw.pq,1);
        m2SoundId = mSoundPool.load(this,R.raw.p2,1);
        mWSoundId = mSoundPool.load(this,R.raw.pw,1);
        m3SoundId = mSoundPool.load(this,R.raw.p3,1);
        mESoundId = mSoundPool.load(this,R.raw.pe,1);
        mRSoundId = mSoundPool.load(this,R.raw.pr,1);
        m5SoundId = mSoundPool.load(this,R.raw.p5,1);
    }
    public void playB(View view){mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
    public void playH(View view){mSoundPool.play(mHSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
    public void playN(View view){mSoundPool.play(mNSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
    public void playJ(View view){mSoundPool.play(mJSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
    public void playM(View view){mSoundPool.play(mMSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
    public void playQ(View view){mSoundPool.play(mQSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
    public void play2(View view){mSoundPool.play(m2SoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
    public void playW(View view){mSoundPool.play(mWSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
    public void play3(View view){mSoundPool.play(m3SoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
    public void playE(View view){mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
    public void playR(View view){mSoundPool.play(mRSoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
    public void play5(View view){mSoundPool.play(m5SoundId,LEFT_VOLUME,RIGHT_VOLUME,0,0,1);}
}
