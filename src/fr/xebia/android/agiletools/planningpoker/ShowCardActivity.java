package fr.xebia.android.agiletools.planningpoker;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import fr.xebia.android.agiletools.R;

public class ShowCardActivity extends FragmentActivity {
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_show_card);
        
        PokerCardShowFragment fragment = (PokerCardShowFragment) getSupportFragmentManager().findFragmentById(R.id.pokerCardShow);
        fragment.show(getIntent().getExtras().getInt("resId"));
	}
    
}
