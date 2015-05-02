package com.cyberChautari.verdure;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Bishruti on 1/15/2015.
 */
public class DetailsOnion extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_onion);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
