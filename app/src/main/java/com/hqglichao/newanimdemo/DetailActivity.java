package com.hqglichao.newanimdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.view.View;

/**
 * @author beyond
 * @date 19-4-20
 */
public class DetailActivity extends Activity {
    public final static String VIEW_TITLE_LAYOUT = "detail:title-layout";
    public final static String VIEW_TITLE_NAME = "detail:title-name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity_layout);
        View titleLayout = findViewById(R.id.appLayout);
        View titleText = findViewById(R.id.toolBar);
        ViewCompat.setTransitionName(titleLayout, VIEW_TITLE_LAYOUT);
        ViewCompat.setTransitionName(titleText, VIEW_TITLE_NAME);
    }
}
