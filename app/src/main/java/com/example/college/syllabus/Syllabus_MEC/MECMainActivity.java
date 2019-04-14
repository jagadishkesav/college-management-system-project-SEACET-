package com.example.college.syllabus.Syllabus_MEC;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.college.R;
import com.example.college.syllabus.Syllabus_MEC17.Mec_2017;
import com.example.college.syllabus.Syllabus_MEC18.mec_2018;

public class MECMainActivity extends AppCompatActivity {
    Button btnMec2015;
    Button btnMec2017;
    Button btnMec2018;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecmain);
        btnMec2015 = (Button) findViewById(R.id.btnMec2015);
        btnMec2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MECMainActivity.this, mec_2015.class);
                startActivity(intent);
            }
        });

        btnMec2017 = (Button) findViewById(R.id. btnMec2017);
        btnMec2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MECMainActivity.this, Mec_2017.class);
                startActivity(intent);
            }
        });

        btnMec2018 = (Button) findViewById(R.id. btnMec2018);
        btnMec2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MECMainActivity.this, mec_2018.class);
                startActivity(intent);
            }
        });






    }
}

