package fr.xebia.android.agiletools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: dahlia
 * Date: 06/08/12
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 */
public class PockerCardsActivity extends Activity  implements View.OnClickListener {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.pocker_cards);

            ImageView card1 = (ImageView) findViewById(R.id.card1);
            card1.setOnClickListener(this);
            ImageView card2 = (ImageView) findViewById(R.id.card2);
            card2.setOnClickListener(this);
            ImageView card3 = (ImageView) findViewById(R.id.card3);
            card3.setOnClickListener(this);
            ImageView card4 = (ImageView) findViewById(R.id.card4);
            card4.setOnClickListener(this);
            ImageView card5 = (ImageView) findViewById(R.id.card5);
            card1.setOnClickListener(this);
            ImageView card6 = (ImageView) findViewById(R.id.card6);
            card5.setOnClickListener(this);
            ImageView card7 = (ImageView) findViewById(R.id.card7);
            card6.setOnClickListener(this);

        }

    @Override
    public void onClick(View view) {
        Intent intent;
        intent = new Intent(getApplicationContext(), ShowCardActivity.class);
        //intent.putExtra("number", view.getValue());
        //startActivity(intent);

        Toast.makeText(this, getString(view.getId()),Toast.LENGTH_SHORT).show();
    }
}
