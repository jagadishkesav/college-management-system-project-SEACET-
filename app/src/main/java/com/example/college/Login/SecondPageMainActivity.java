package com.example.college.Login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.college.MainActivity;
import com.example.college.PasswordActivity;
import com.example.college.R;
import com.example.college.WelcomeActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.apache.log4j.chainsaw.Main;
import org.w3c.dom.Text;

public class SecondPageMainActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button login;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mAuth = FirebaseAuth.getInstance();
        final FirebaseUser firebaseUser = mAuth.getCurrentUser();



        setContentView(R.layout.activity_second_page_main);
        email = (EditText) findViewById(R.id.editTextEmail);
        password = (EditText) findViewById(R.id.editTextPassword);
        login = (Button) findViewById(R.id.buttonSignIn);



        login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth = FirebaseAuth.getInstance();
                String qqemail = email.getText().toString();
                String qqpassword = password.getText().toString();

                mAuth.signInWithEmailAndPassword(qqemail,qqpassword)
                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(!task.isSuccessful())
                                {
                                    Toast.makeText(SecondPageMainActivity.this,"Invalid Email Id/password",Toast.LENGTH_SHORT).show();
                                   // checkEmailVerification();
                                }
                                else if(firebaseUser!=null && firebaseUser.isEmailVerified())
                                {
                                    Intent intent = new Intent(SecondPageMainActivity.this, MainActivity.class);
                                    finish();
                                    startActivity(intent);
                                }
                            }
                        });

            }
        } );
        TextView resetpassword = (TextView)findViewById(R.id.textViewForget);
        resetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondPageMainActivity.this, PasswordActivity.class);
                finish();
                startActivity(intent);
            }
        });
        TextView register = (TextView) findViewById(R.id.textViewSignUp);
        register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondPageMainActivity.this, Register.class);
                finish();
                startActivity(intent);
            }
        } );


    }
 /*   private void checkEmailVerification() {
        FirebaseUser user = mAuth.getCurrentUser();
        Boolean emailflag = user.isEmailVerified();
        if(emailflag)
        {
            startActivity(new Intent(SecondPageMainActivity.this,MainActivity.class));
        }
        else
        {
            Toast.makeText(SecondPageMainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
        }
    } */
 /*@Override
 public void onBackPressed() {
     DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
     if (drawer.isDrawerOpen( GravityCompat.START )) {
         drawer.closeDrawer( GravityCompat.START );
     } else {
         super.onBackPressed();
     }
 }*/

}
