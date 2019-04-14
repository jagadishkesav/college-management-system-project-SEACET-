package com.example.college.Aptitude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.college.R;

public class verbal extends AppCompatActivity {
    private Button btnAntonyms;
    private Button btnVoice;
    private Button btnSynonyms;
    private Button btnIdioms;
    private Button btnSpotting;
    private Button btnOrdering;
    private Button btnSelecting;
    private Button btnSentence;
    private Button btnSpellings;
    private Button btnVeranalogy;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbal);

        btnAntonyms = (Button) findViewById(R.id.btnAntonyms);
        btnAntonyms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verbal.this, antonyms.class);
                startActivity(intent);
            }
        });

        btnVoice = (Button) findViewById(R.id.btnVoice);
        btnVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verbal.this, voice.class);
                startActivity(intent);
            }
        });

        btnSynonyms = (Button) findViewById(R.id.btnSynonyms);
        btnSynonyms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verbal.this, synonyms.class);
                startActivity(intent);
            }
        });

        btnIdioms = (Button) findViewById(R.id.btnIdioms);
        btnIdioms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verbal.this, idioms.class);
                startActivity(intent);
            }
        });

        btnSpotting = (Button) findViewById(R.id.btnSpotting);
        btnSpotting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verbal.this, spotting.class);
                startActivity(intent);
            }
        });

        btnOrdering = (Button) findViewById(R.id.btnOrdering);
        btnOrdering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verbal.this, ordering.class);
                startActivity(intent);
            }
        });

        btnSelecting = (Button) findViewById(R.id.btnSelecting);
        btnSelecting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verbal.this, selecting.class);
                startActivity(intent);
            }
        });

        btnSentence = (Button) findViewById(R.id.btnSentence);
        btnSentence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verbal.this, sentence.class);
                startActivity(intent);
            }
        });

        btnSpellings = (Button) findViewById(R.id.btnSpellings);
        btnSpellings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verbal.this, spellings.class);
                startActivity(intent);
            }
        });

        btnVeranalogy = (Button) findViewById(R.id.btnVeranalogy);
        btnVeranalogy .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verbal.this, veranalogy.class);
                startActivity(intent);
            }
        });
        }
    }

