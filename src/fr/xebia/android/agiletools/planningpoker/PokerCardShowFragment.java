package fr.xebia.android.agiletools.planningpoker;

import fr.xebia.android.agiletools.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PokerCardShowFragment extends Fragment {

	private ImageView mImageView;
	private int mResId;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_poker_card_show, container, false);
		mImageView = (ImageView) view.findViewById(R.id.imageview);
		
		if (savedInstanceState != null) {
			mResId = savedInstanceState.getInt("resId");
			show(mResId);
		}
		
		return view;
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("resId", mResId);
	}

	public void show(int resId) {
		mResId = resId;
		mImageView.setImageResource(resId);
	}
	
}
