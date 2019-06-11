package com.example.college.syllabus;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.college.R;

public class CSEMainSyl extends AppCompatActivity {
    Button btnCse2015;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csemain_syl);
        btnCse2015 = (Button) findViewById(R.id.btnCse2015);
        btnCse2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEMainSyl.this,cse_2015.class);
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
