package fr.xebia.android.agiletools.planingpocker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import fr.xebia.android.agiletools.R;

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
