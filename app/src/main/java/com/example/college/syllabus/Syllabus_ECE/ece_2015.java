package com.example.college.syllabus.Syllabus_ECE;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.college.R;
import com.example.college.syllabus.Syllabus_CSE.cseChe;
import com.example.college.syllabus.Syllabus_CSE.csePhy;
import com.example.college.syllabus.Syllabus_CSE.cse_2015;
import com.example.college.syllabus.Syllabus_CSE.csesem3;
import com.example.college.syllabus.Syllabus_CSE.csesem5;
import com.example.college.syllabus.Syllabus_CSE.csesem7;

public class ece_2015 extends AppCompatActivity {

    Button btnSem1;
    Button btnSem2;
    Button btnSem3;
    Button btnSem5;
    Button btnSem7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece_2015);
        Button btnSem1;

        btnSem1 = (Button) findViewById(R.id.btnSem1);
        btnSem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ece_2015.this, ecephy.class);
                startActivity(intent);
            }
        });
        btnSem2 = (Button) findViewById(R.id.btnSem2);
        btnSem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ece_2015.this, eceche.class);
                startActivity(intent);
            }
        });

        btnSem3 = (Button) findViewById(R.id.btnSem3);
        btnSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ece_2015.this, ecesem3.class);
                startActivity(intent);
            }
        });

        btnSem5 = (Button) findViewById(R.id.btnSem5);
        btnSem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ece_2015.this, ecesem5.class);
                startActivity(intent);
            }
        });


        btnSem7 = (Button) findViewById(R.id.btnSem7);
        btnSem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ece_2015.this, ecesem7.class);
                startActivity(intent);
            }
        });




    }
}




