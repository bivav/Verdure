package com.cyberChautari.verdure;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class DetailsRadish extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_radish);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
