package com.example.college.syllabus.Syllabus_CIV;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.college.R;
import com.example.college.syllabus.Syllabus_CIV17.civ_2017;
import com.example.college.syllabus.Syllabus_CIV18.civ_2018;

public class CIVMainActivity extends AppCompatActivity {
    Button btnCiv2015;
    Button btnCiv2017;
    Button btnCiv2018;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civmain);


        btnCiv2015 = (Button) findViewById(R.id.btnCiv2015);
        btnCiv2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CIVMainActivity.this, civ_2015.class);
                startActivity(intent);
            }
        });


        btnCiv2017 = (Button) findViewById(R.id.btnCiv2017);
        btnCiv2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CIVMainActivity.this, civ_2017.class);
                startActivity(intent);
            }
        });

        btnCiv2018 = (Button) findViewById(R.id.btnCiv2018);
        btnCiv2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CIVMainActivity.this, civ_2018.class);
                startActivity(intent);
            }
        });




    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );

        super.onBackPressed();

    }

}

