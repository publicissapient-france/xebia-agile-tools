package fr.xebia.android.agiletools.chronometer;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import fr.xebia.android.agiletools.R;


public class ChronometerActivity extends Activity {
    private Chronometer mChronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chronometer);


        mChronometer = (Chronometer) findViewById(R.id.chronometer);
        Button startBtn = (Button) findViewById(R.id.startbtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mChronometer.start();
            }
        });


        Button stopBtn = (Button) findViewById(R.id.stopbtn);
        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mChronometer.stop();
            }
        });


        Button resetBtn = (Button) findViewById(R.id.resetbtn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mChronometer.setBase(SystemClock.elapsedRealtime());
            }
        });


    }


/*
        View.OnClickListener mSetFormatListener = new OnClickListener() {
            public void onClick(View v) {
                mChronometer.setFormat("Formatted time (%s)");
            }
        };

        View.OnClickListener mClearFormatListener = new OnClickListener() {
            public void onClick(View v) {
                mChronometer.setFormat(null);
            }
        };
*/
}


