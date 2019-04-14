package com.example.college.syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.college.R;
import com.example.college.syllabus.Syllabus_CIV.CIVMainActivity;
import com.example.college.syllabus.Syllabus_CSE.CSEMainActivity;
import com.example.college.syllabus.Syllabus_ECE.ECEMainActivity;
import com.example.college.syllabus.Syllabus_MEC.MECMainActivity;

public class SyllabusMain extends AppCompatActivity {
    Button btnCSE;
    Button btnECE;
    Button btnMEC;
    Button btnCIV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_main);


        btnCSE = (Button) findViewById(R.id.btnCSE);
        btnCSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SyllabusMain.this, CSEMainActivity.class);
                startActivity(intent);
            }
        });

        btnECE = (Button) findViewById(R.id.btnECE);
        btnECE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SyllabusMain.this, ECEMainActivity.class);
                startActivity(intent);
            }
        });

        btnMEC = (Button) findViewById(R.id.btnMEC);
        btnMEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SyllabusMain.this, MECMainActivity.class);
                startActivity(intent);
            }
        });


        btnCIV = (Button) findViewById(R.id.btnCIV);
        btnCIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SyllabusMain.this, CIVMainActivity.class);
                startActivity(intent);
            }
        });
    }
}
