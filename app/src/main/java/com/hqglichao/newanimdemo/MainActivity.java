package com.hqglichao.newanimdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.llTextLayout:
                launchActivity();
                break;
                default:
                    break;
        }
    }

    private void launchActivity() {
        Intent intent = new Intent(this, DetailActivity.class);
        ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                new Pair<View, String>(findViewById(R.id.vView), DetailActivity.VIEW_TITLE_NAME),
                new Pair<View, String>(findViewById(R.id.llTextLayout), DetailActivity.VIEW_TITLE_LAYOUT)
        );
        ActivityCompat.startActivity(this, intent, activityOptionsCompat.toBundle());
    }
}
