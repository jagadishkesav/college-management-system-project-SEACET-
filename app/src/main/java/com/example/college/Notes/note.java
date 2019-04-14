package com.example.college.Notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.college.Aptitude.AptitudeMainActivity;
import com.example.college.Notes.CIV.CIV;
import com.example.college.Notes.ECE.ECE;
import com.example.college.Notes.ISE.ISE;
import com.example.college.Notes.MECH.MECH;
import com.example.college.R;

public class note extends AppCompatActivity {
    String[] SPINNERVALUES = {"CSE","ISE","ECE","MECH","CIV"};
    String SpinnerValue;
    Button GOTO;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        GOTO = (Button)findViewById(R.id.button1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(note.this, android.R.layout.simple_list_item_1, SPINNERVALUES);

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

                    case "CSE":
                        intent = new Intent(note.this, semester.class);
                        startActivity(intent);
                        break;

                    case "ISE":
                        intent = new Intent(note.this, ISE.class);
                        startActivity(intent);
                        break;
                    case "ECE":
                        intent = new Intent(note.this, ECE.class);
                        startActivity(intent);
                        break;

                    case "MECH":
                        intent = new Intent(note.this, MECH.class);
                        startActivity(intent);
                        break;

                    case "CIV":
                        intent = new Intent(note.this, CIV.class);
                        startActivity(intent);
                        break;





                }
            }
        });
    }
}
