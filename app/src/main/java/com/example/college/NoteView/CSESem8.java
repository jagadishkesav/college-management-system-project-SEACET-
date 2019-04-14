package com.example.college.NoteView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.college.R;

public class CSESem8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem8);
    }
    public void btn_action(View view) {
        startActivity(new Intent(getApplicationContext(), CSESemView8.class));
    }
}
