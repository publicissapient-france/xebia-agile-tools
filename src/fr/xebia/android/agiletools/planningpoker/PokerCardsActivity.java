package fr.xebia.android.agiletools.planningpoker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import fr.xebia.android.agiletools.R;

import static android.widget.Toast.LENGTH_LONG;

public class PokerCardsActivity extends FragmentActivity implements PokerCardListFragment.OnPokerCardSelectedListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poker_cards);
    }

    @Override
    public void onPokerCardSelected(int resId) {
        Toast.makeText(this, resId, LENGTH_LONG).show();
        PokerCardShowFragment fragment = (PokerCardShowFragment) getSupportFragmentManager().findFragmentById(R.id.pokerCardShow);
        if (fragment == null) { // handset layout
            Intent intent = new Intent(this, ShowCardActivity.class);
            intent.putExtra("resId", resId);
            startActivity(intent);
        } else { // tablet layout
            fragment.show(resId);
        }
    }

}
