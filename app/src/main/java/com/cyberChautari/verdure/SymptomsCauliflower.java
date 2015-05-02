package com.cyberChautari.verdure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SymptomsCauliflower extends ActionBarActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptoms_cauliflower);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int lengthBox = 9;

        final Button showDetails = (Button) findViewById(R.id.seeDisease);
        final CheckBox diseaseCheck[] = new CheckBox[lengthBox];

        for (int i = 0; i < 9; i++){
            int id = getResources().getIdentifier("checkBox_"+i, "id", getPackageName());
            diseaseCheck[i] = (CheckBox)findViewById(id);
        }

        showDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(diseaseCheck[0].isChecked() ||  diseaseCheck[1].isChecked() || diseaseCheck[2].isChecked()){
                    startActivity(new Intent(SymptomsCauliflower.this, DiseaseBlackLeg.class));
                }
                else if(diseaseCheck[3].isChecked() || diseaseCheck[4].isChecked() || diseaseCheck[5].isChecked()) {
                    startActivity(new Intent(SymptomsCauliflower.this, DiseaseDownyMildew.class));
                }
                else if(diseaseCheck[6].isChecked() || diseaseCheck[7].isChecked() || diseaseCheck[8].isChecked()){
                    startActivity(new Intent(SymptomsCauliflower.this, DiseaseDampingOff.class));
                }
                else {
                    Toast.makeText(getApplicationContext(), "Select some Symptoms!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }
}