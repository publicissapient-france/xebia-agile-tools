package fr.xebia.android.agiletools;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class ShowCardActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_pocker_card);

        int resId = getIntent().getExtras().getInt("id");

        ImageView imageView = (ImageView) findViewById(R.id.imageview);
        imageView.setImageResource(resId);
    }
}
