package com.example.college.Login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.college.R;

public class Original extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_original );
        getSupportActionBar().setTitle("Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
