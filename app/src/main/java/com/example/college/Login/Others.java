package com.example.college.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.college.R;

public class Others extends AppCompatActivity {

    private EditText editTextName,editTextPassword,editTextEmail,editTextPhone;
    private Button buttonSignUp;
    private TextView textViewSingIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_others );
        getSupportActionBar().setTitle("Others");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textViewSingIn = (TextView) findViewById( R.id.textViewSignIn );
        textViewSingIn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this, SecondPageMainActivity.class );
                finish();
                startActivity( intent );
            }
        } );

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        if (drawer.isDrawerOpen( GravityCompat.START )) {
            drawer.closeDrawer( GravityCompat.START );
        } else {
            super.onBackPressed();
        }
    }

}



