package fr.xebia.android.agiletools.moobox;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import fr.xebia.android.agiletools.R;

public class MooBoxActivity extends Activity implements View.OnClickListener {
    private Button saymooBtn;

    private SoundPool soundPool;
    private int mooSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moobox);

        initComponents();
    }

    private void initComponents() {
        saymooBtn = (Button) findViewById(R.id.saymooBtn);
        saymooBtn.setOnClickListener(this);

        soundPool = new SoundPool(16, AudioManager.STREAM_MUSIC, 100);
        mooSound = soundPool.load(getApplicationContext(), R.raw.cow_sound, 1);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.saymooBtn:
                soundPool.play(mooSound, getVolume(), getVolume(), 1, 0, 1f);
                break;
        }
    }

    private float getVolume() {
        AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        float actualVolume = (float) audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        float maxVolume = (float) audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        return actualVolume / maxVolume;
    }
}


