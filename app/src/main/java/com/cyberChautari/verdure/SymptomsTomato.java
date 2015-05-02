package com.cyberChautari.verdure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SymptomsTomato extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptoms_tomato);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Button seeDisease = (Button) findViewById(R.id.seeDisease);

        final CheckBox diseaseCheck[] = new CheckBox[13];

        diseaseCheck[0] = (CheckBox) findViewById(R.id.checkBox1);
        diseaseCheck[1] = (CheckBox) findViewById(R.id.checkBox2);
        diseaseCheck[2] = (CheckBox) findViewById(R.id.checkBox3);
        diseaseCheck[3] = (CheckBox) findViewById(R.id.checkBox4);
        diseaseCheck[4] = (CheckBox) findViewById(R.id.checkBox5);
        diseaseCheck[5] = (CheckBox) findViewById(R.id.checkBox6);
        diseaseCheck[6] = (CheckBox) findViewById(R.id.checkBox7);
        diseaseCheck[7] = (CheckBox) findViewById(R.id.checkBox8);
        diseaseCheck[8] = (CheckBox) findViewById(R.id.checkBox9);
        diseaseCheck[9] = (CheckBox) findViewById(R.id.checkBox10);
        diseaseCheck[10] = (CheckBox) findViewById(R.id.checkBox11);
        diseaseCheck[11] = (CheckBox) findViewById(R.id.checkBox12);
        diseaseCheck[12] = (CheckBox) findViewById(R.id.checkBox13);


        seeDisease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // early blight
                if (diseaseCheck[1].isChecked() || diseaseCheck[2].isChecked() || diseaseCheck[5].isChecked()) {
                    Intent intent = new Intent(v.getContext(), DiseaseBlackLeg.class);
                    startActivityForResult(intent, 0);
                }
                //gray mold
                else if (diseaseCheck[8].isChecked() || diseaseCheck[9].isChecked() || diseaseCheck[10].isChecked()) {
                    Intent intent = new Intent(v.getContext(), DiseaseDownyMildew.class);
                    startActivityForResult(intent, 0);
                }
                //Fusarium wilt
                else if (diseaseCheck[0].isChecked() || diseaseCheck[3].isChecked() || diseaseCheck[4].isChecked()) {
                    Intent intent = new Intent(v.getContext(), DiseaseDampingOff.class);
                    startActivityForResult(intent, 0);
                }
                //bacterial wilt
                else if (diseaseCheck[4].isChecked() || diseaseCheck[11].isChecked() || diseaseCheck[12].isChecked()) {
                    Intent intent = new Intent(v.getContext(), DiseaseDampingOff.class);
                    startActivityForResult(intent, 0);
                }
                //................................................................
/*
                //bacterial wilt
                else if (diseaseCheck[4].isChecked() || diseaseCheck[11].isChecked() || diseaseCheck[12].isChecked()) {
                    Intent intent = new Intent(v.getContext(), DiseaseDampingOff.class);
                    startActivityForResult(intent, 0);
                }
                //bacterial wilt
                else if (diseaseCheck[4].isChecked() || diseaseCheck[11].isChecked() || diseaseCheck[12].isChecked()) {
                    Intent intent = new Intent(v.getContext(), DiseaseDampingOff.class);
                    startActivityForResult(intent, 0);
                }
                //bacterial wilt
                else if (diseaseCheck[4].isChecked() || diseaseCheck[11].isChecked() || diseaseCheck[12].isChecked()) {
                    Intent intent = new Intent(v.getContext(), DiseaseDampingOff.class);
                    startActivityForResult(intent, 0);
                } */
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Select some Symptoms!!", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}