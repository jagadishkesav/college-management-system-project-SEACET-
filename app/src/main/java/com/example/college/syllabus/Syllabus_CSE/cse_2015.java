package com.example.college.syllabus.Syllabus_CSE;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.college.R;


public class cse_2015 extends AppCompatActivity {
Button btnSem1;
Button btnSem2;
Button btnSem3;
Button btnSem5;
Button btnSem7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_2015);
        btnSem1 = (Button) findViewById(R.id.btnSem1);
        btnSem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse_2015.this,csePhy.class);
                startActivity(intent);
            }
        });
        btnSem2 = (Button) findViewById(R.id.btnSem2);
        btnSem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse_2015.this,cseChe.class);
                startActivity(intent);
            }
        });

        btnSem3 = (Button) findViewById(R.id.btnSem3);
        btnSem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse_2015.this,csesem3.class);
                startActivity(intent);
            }
        });

        btnSem5 = (Button) findViewById(R.id.btnSem5);
        btnSem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse_2015.this,csesem5.class);
                startActivity(intent);
            }
        });


        btnSem7 = (Button) findViewById(R.id.btnSem7);
        btnSem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse_2015.this,csesem7.class);
                startActivity(intent);
            }
        });




    }
}