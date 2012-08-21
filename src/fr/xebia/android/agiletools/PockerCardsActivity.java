package fr.xebia.android.agiletools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class PockerCardsActivity extends Activity {

    private GridView mGridView = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gridview_layout);

        mGridView = (GridView) findViewById(R.id.grid_view);
        mGridView.setAdapter(new ImageAdapter(this));
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                showCard(position);
            }
        });
    }

    private void showCard(int position) {
        Integer resId = (Integer) mGridView.getAdapter().getItem(position);
        Toast.makeText(this, resId, Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, ShowCardActivity.class);
        intent.putExtra("id", resId);
        startActivity(intent);

    }

}
