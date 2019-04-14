package com.example.college.Notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.college.R;

import java.util.ArrayList;
import java.util.List;

public class semester extends AppCompatActivity  {
    String[] SPINNERVALUES = {"semester1","semester2","semester3","semester4","semester5","semester6","semester7","semester8"};
    String SpinnerValue;
    Button GOTO;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);


        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        GOTO = (Button)findViewById(R.id.button1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(semester.this, android.R.layout.simple_list_item_1, SPINNERVALUES);

        spinner.setAdapter(adapter);

        //Adding setOnItemSelectedListener method on spinner.
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                SpinnerValue = (String) spinner.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        GOTO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                switch(SpinnerValue){

                    case "semester1":
                        intent = new Intent(semester.this, semester1.class);
                        startActivity(intent);
                        break;

                    case "semester2":
                        intent = new Intent(semester.this, semester2.class);
                        startActivity(intent);
                        break;
                    case "semester3":
                        intent = new Intent(semester.this, semester3.class);
                        startActivity(intent);
                        break;

                    case "semester4":
                        intent = new Intent(semester.this, semester4.class);
                        startActivity(intent);
                        break;
                    case "semester5":
                        intent = new Intent(semester.this, semester5.class);
                        startActivity(intent);
                        break;

                    case "semester6":
                        intent = new Intent(semester.this, semester6.class);
                        startActivity(intent);
                        break;
                    case "semester7":
                        intent = new Intent(semester.this, semester7.class);
                        startActivity(intent);
                        break;

                    case "semester8":
                        intent = new Intent(semester.this, semester8.class);
                        startActivity(intent);
                        break;




                }
            }
        });

    }
    }




