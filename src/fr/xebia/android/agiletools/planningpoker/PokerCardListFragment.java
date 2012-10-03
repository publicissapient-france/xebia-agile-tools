package fr.xebia.android.agiletools.planningpoker;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import fr.xebia.android.agiletools.R;

public class PokerCardListFragment extends Fragment {

	private OnPockerCardSelectedListener mListener;
	private GridView mGridView;
	
	
	public interface OnPockerCardSelectedListener {
		void onPockerCardSelected(int resId);
	}
	
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		
		try {
			mListener = (OnPockerCardSelectedListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString() + " must implement OnPockerCardSelectedListener");
		}
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_poker_card_list, container, false);
		
		mGridView = (GridView) view.findViewById(R.id.grid_view);
		mGridView.setAdapter(new ImageAdapter(getActivity()));
		
		mGridView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
				Integer resId = (Integer) mGridView.getAdapter().getItem(position);
				mListener.onPockerCardSelected(resId);
			}
		});
		
		return view;
	}

}
