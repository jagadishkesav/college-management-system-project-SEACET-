package com.example.college.Aptitude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.college.R;

public class logical extends AppCompatActivity {


    private Button btnSeries;
    private Button btnLetter;
    private Button btnAnalogy;
    private Button btnArthmetic;
    private Button btnBlood;
    private Button btnRanking;
    private Button btnCoding;
    private Button btnOld;
    private Button btnSeating;
    private Button btnData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logical);



        btnSeries = (Button) findViewById(R.id.btnSeries);
        btnSeries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logical.this, series.class);
                startActivity(intent);
            }
        });

        btnLetter = (Button) findViewById(R.id.btnLetter);
        btnLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logical.this, letter.class);
                startActivity(intent);
            }
        });

        btnAnalogy = (Button) findViewById(R.id.btnAnalogy);
        btnAnalogy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logical.this, analogy.class);
                startActivity(intent);
            }
        });


        btnArthmetic = (Button) findViewById(R.id.btnArthmetic);
        btnArthmetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logical.this, Arthmetic.class);
                startActivity(intent);
            }
        });


        btnBlood = (Button) findViewById(R.id.btnBlood);
        btnBlood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logical.this, blood.class);
                startActivity(intent);
            }
        });

        btnRanking = (Button) findViewById(R.id.btnRanking);
        btnRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logical.this, ranking.class);
                startActivity(intent);
            }
        });

        btnCoding = (Button) findViewById(R.id. btnCoding );
        btnCoding .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logical.this, coding.class);
                startActivity(intent);
            }
        });

        btnOld = (Button) findViewById(R.id.btnOld);
        btnOld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logical.this,old.class);
                startActivity(intent);
            }
        });

        btnSeating = (Button) findViewById(R.id.btnSeating);
        btnSeating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logical.this,seating.class);
                startActivity(intent);
            }
        });

        btnData = (Button) findViewById(R.id.btnData);
        btnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(logical.this,data.class);
                startActivity(intent);
            }
        });

    }
}
