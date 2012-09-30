package fr.xebia.android.agiletools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import fr.xebia.android.agiletools.chronometer.ChronometerActivity;
import fr.xebia.android.agiletools.planingpocker.PockerCardsActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pockerPlanningBtn = (Button) findViewById(R.id.pockerplanningBtn);
        pockerPlanningBtn.setOnClickListener(this);

        Button chronometerBtn = (Button) findViewById(R.id.chronometerBtn);
        chronometerBtn.setOnClickListener(this);

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
            case R.id.pockerplanningBtn:
                intent = new Intent(getApplicationContext(), PockerCardsActivity.class);
                startActivity(intent);
                break;
            case R.id.chronometerBtn:
                intent = new Intent(getApplicationContext(), ChronometerActivity.class);
                startActivity(intent);
                break;

        }
    }
}
