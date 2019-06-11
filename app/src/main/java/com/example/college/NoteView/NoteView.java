package com.example.college.NoteView;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.college.Notes.CIV.CIV;
import com.example.college.Notes.ECE.ECE;
import com.example.college.Notes.ISE.ISE;
import com.example.college.Notes.MECH.MECH;
import com.example.college.Notes.note;
import com.example.college.Notes.semester;
import com.example.college.R;

public class NoteView extends AppCompatActivity {
    String[] SPINNERVALUES = {"CSE","ISE","ECE","MECH","CIV"};
    String SpinnerValue;
    Button GOTO;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_view);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        GOTO = (Button)findViewById(R.id.button1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(NoteView.this, android.R.layout.simple_list_item_1, SPINNERVALUES);

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
                        intent = new Intent(NoteView.this, CSEMain.class);
                        startActivity(intent);
                        break;

                    case "ISE":
                        intent = new Intent(NoteView.this, ISE.class);
                        startActivity(intent);
                        break;
                    case "ECE":
                        intent = new Intent(NoteView.this, ECE.class);
                        startActivity(intent);
                        break;

                    case "MECH":
                        intent = new Intent(NoteView.this, MECH.class);
                        startActivity(intent);
                        break;

                    case "CIV":
                        intent = new Intent(NoteView.this, CIV.class);
                        startActivity(intent);
                        break;





                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );

        super.onBackPressed();

    }

}
