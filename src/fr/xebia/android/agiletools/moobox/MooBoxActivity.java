package fr.xebia.android.agiletools.moobox;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import fr.xebia.android.agiletools.R;

public class MooBoxActivity extends Activity implements View.OnClickListener {
    private Button saymooBtn;

    private SoundManager snd;
    private int moo;

    public MooBoxActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moobox);

        initComponents();
    }

    private void initComponents() {
        saymooBtn = (Button) findViewById(R.id.saymooBtn);
        saymooBtn.setOnClickListener(this);

        snd = new SoundManager(getApplicationContext());
        moo = snd.load(R.raw.cow_sound);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.saymooBtn:
                snd.play(moo);
                break;
        }
    }
}


