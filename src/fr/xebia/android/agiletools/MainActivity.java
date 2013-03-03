package fr.xebia.android.agiletools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import fr.xebia.android.agiletools.chronometer.ChronometerActivity;
import fr.xebia.android.agiletools.moobox.MooBoxActivity;
import fr.xebia.android.agiletools.planningpoker.PokerCardsActivity;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button pokerPlanningBtn;
    private Button chronometerBtn;
    private Button mooBoxBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        pokerPlanningBtn = (Button) findViewById(R.id.pokerplanningBtn);
        pokerPlanningBtn.setOnClickListener(this);

        chronometerBtn = (Button) findViewById(R.id.chronometerBtn);
        chronometerBtn.setOnClickListener(this);

        mooBoxBtn = (Button) findViewById(R.id.mooboxBtn);
        mooBoxBtn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.pokerplanningBtn:
                intent = new Intent(getApplicationContext(), PokerCardsActivity.class);
                startActivity(intent);
                break;
            case R.id.chronometerBtn:
                intent = new Intent(getApplicationContext(), ChronometerActivity.class);
                startActivity(intent);
                break;
            case R.id.mooboxBtn:
                intent = new Intent(getApplicationContext(), MooBoxActivity.class);
                startActivity(intent);
                break;
        }
    }

}
