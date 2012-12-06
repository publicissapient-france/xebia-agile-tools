package fr.xebia.android.agiletools.chronometer;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import fr.xebia.android.agiletools.R;

public class ChronometerActivity extends Activity implements View.OnClickListener {
    private Chronometer mChronometer;
    private Button startBtn;
    private Button stopBtn;
    private Button resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chronometer);

        initComponents();
    }

    private void initComponents() {
        mChronometer = (Chronometer) findViewById(R.id.chronometer);

        startBtn = (Button) findViewById(R.id.startBtn);
        startBtn.setOnClickListener(this);

        stopBtn = (Button) findViewById(R.id.stopBtn);
        stopBtn.setOnClickListener(this);

        resetBtn = (Button) findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.startBtn:
                mChronometer.start();
                startBtn.setVisibility(View.GONE);
                stopBtn.setVisibility(View.VISIBLE);
                break;
            case R.id.stopBtn:
                stopBtn.setVisibility(View.GONE);
                startBtn.setVisibility(View.VISIBLE);
                mChronometer.stop();
                break;
            case R.id.resetBtn:
                mChronometer.setBase(SystemClock.elapsedRealtime());
                break;
        }
    }
}


