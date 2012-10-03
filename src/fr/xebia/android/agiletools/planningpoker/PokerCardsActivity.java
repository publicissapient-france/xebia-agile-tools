package fr.xebia.android.agiletools.planningpoker;

import static android.widget.Toast.LENGTH_LONG;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import fr.xebia.android.agiletools.R;
import fr.xebia.android.agiletools.planningpoker.PokerCardListFragment.OnPockerCardSelectedListener;


public class PokerCardsActivity extends FragmentActivity implements OnPockerCardSelectedListener {


	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poker_cards);
    }

	@Override
	public void onPockerCardSelected(int resId) {
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
