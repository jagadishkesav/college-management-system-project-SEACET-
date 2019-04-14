package com.example.college.syllabus.Syllabus_ECE;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.college.R;
import com.example.college.syllabus.Syllabus_ECE18.ece_2018;
import com.example.college.syllabus.Syllabus_ECE2017.ece_2017;

public class ECEMainActivity extends AppCompatActivity {
    Button btnEce2015;
    Button btnEce2017;
    Button btnEce2018;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecemain);

        btnEce2015 = (Button) findViewById(R.id.btnEce2015);
        btnEce2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ECEMainActivity.this, ece_2015.class);
                startActivity(intent);
            }
        });

        btnEce2017 = (Button) findViewById(R.id.btnEce2017);
        btnEce2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ECEMainActivity.this, ece_2017.class);
                startActivity(intent);
            }
        });

        btnEce2018 = (Button) findViewById(R.id.btnEce2018);
        btnEce2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ECEMainActivity.this, ece_2018.class);
                startActivity(intent);
            }
        });
    }
}
