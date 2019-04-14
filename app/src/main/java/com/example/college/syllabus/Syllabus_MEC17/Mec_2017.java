package com.example.college.syllabus.Syllabus_MEC17;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.college.R;
import com.example.college.syllabus.Syllabus_CSE17.csesem717;

public class Mec_2017 extends AppCompatActivity {
    Button btnSem1;
    Button btnSem2;
    Button btnSem3;
    Button btnSem5;
    Button btnSem7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mec_2017);


        btnSem1 = (Button) findViewById(R.id.btnSem1);
        btnSem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mec_2017.this, mecphy17.class);
                startActivity(intent);
            }
        });

        btnSem2 = (Button) findViewById(R.id.btnSem2);
        btnSem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mec_2017.this, mecche17.class);
                startActivity(intent);
            }
        });

        btnSem3 = (Button) findViewById(R.id.btnSem3);
        btnSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mec_2017.this, mecsem317.class);
                startActivity(intent);
            }
        });

        btnSem5 = (Button) findViewById(R.id.btnSem5);
        btnSem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mec_2017.this, mecsem517.class);
                startActivity(intent);
            }
        });

        btnSem7 = (Button) findViewById(R.id.btnSem7);
        btnSem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mec_2017.this, mecsem717.class);
                startActivity(intent);
            }
        });



    }
}

