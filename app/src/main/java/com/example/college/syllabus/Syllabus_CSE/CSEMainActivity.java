package com.example.college.syllabus.Syllabus_CSE;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.college.R;
import com.example.college.syllabus.Syllabus_CSE17.cse_2017;
import com.example.college.syllabus.Syllabus_CSE18.cse_2018;


public class CSEMainActivity extends AppCompatActivity {
Button btnCse2015;
Button btnCse2017;
    Button btnCse2018;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_csemain_syl);
        btnCse2015 = (Button) findViewById(R.id.btnCse2015);
        btnCse2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEMainActivity.this,cse_2015.class);
                startActivity(intent);
            }
        });

        btnCse2017 = (Button) findViewById(R.id.btnCse2017);
        btnCse2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEMainActivity.this, cse_2017.class);
                startActivity(intent);
            }
        });

        btnCse2018 = (Button) findViewById(R.id.btnCse2018);
        btnCse2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEMainActivity.this, cse_2018.class);
                startActivity(intent);
            }
        });






    }
}
