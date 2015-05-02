package com.cyberChautari.verdure;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    String[] items = {
            "Cauliflower",
            "Cabbage",
            "Tomato",
            "Potato",
            "Onion",
            "Garlic",
            "Carrot",
            "Coriander",
            "Radish",
            "Pumpkin",
            "Asparagus"
    };

    Spinner spinnerDropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayUseLogoEnabled(true);

        final Button symptoms_button = (Button)findViewById(R.id.symptoms_button);
        final Button details_button = (Button)findViewById(R.id.detail_button);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinnerDropdown = (Spinner)findViewById(R.id.spinner1);
        //items = getResources().getStringArray(R.array.vegetables);
        spinnerDropdown.setAdapter(adapter);

        spinnerDropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, final View view, int position, long id) {
                switch (position){
                    case 0:
                        symptoms_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                //setContentView(R.layout.symptoms_cauliflower);
                                //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                                startActivity(new Intent(MainActivity.this, SymptomsCauliflower.class));
                            }
                        });

                        details_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, DetailsCauliflower.class));
                            }
                        });
                        break;
                    case 1:
                        symptoms_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SymptomsCabbage.class));
                            }
                        });

                        details_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                startActivity(new Intent(MainActivity.this, DetailsCabbage.class));
                            }
                        });
                        break;
                    case 2:
                        symptoms_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SymptomsTomato.class));
                            }
                        });

                        details_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, DetailsTomato.class));
                            }
                        });
                        break;
                    case 3:
                        symptoms_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SymptomsPotato.class));
                            }
                        });

                        details_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, DetailsPotato.class));
                            }
                        });
                        break;
                    case 4:
                        symptoms_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SymptomsOnion.class));
                            }
                        });

                        details_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, DetailsOnion.class));
                            }
                        });
                        break;
                    case 5:
                        symptoms_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SymptomsGarlic.class));
                            }
                        });

                        details_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, DetailsGarlic.class));
                            }
                        });
                        break;
                    case 6:
                        symptoms_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SymptomsCarrot.class));
                            }
                        });

                        details_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, DetailsCarrot.class));
                            }
                        });
                        break;
                    case 7:
                        symptoms_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SymptomsCorriander.class));
                            }
                        });

                        details_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, DetailsCoriander.class));
                            }
                        });
                        break;
                    case 8:
                        symptoms_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SymptomsRaddish.class));
                            }
                        });

                        details_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, DetailsRadish.class));
                            }
                        });
                        break;
                    case 9:
                        symptoms_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SymptomsPumpkin.class));
                            }
                        });

                        details_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, DetailsPumpkin.class));
                            }
                        });
                        break;
                    case 10:
                        symptoms_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, SymptomsAsparagus.class));
                            }
                        });

                        details_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                startActivity(new Intent(MainActivity.this, DetailsAsparagus.class));
                            }
                        });
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

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
        switch (item.getItemId()){
            case R.id.action_settings:
                openSettings();
                return true;
        }

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openSettings() {
        Toast.makeText(getApplicationContext(), "You pressed Settings!!", Toast.LENGTH_SHORT).show();
    }
}