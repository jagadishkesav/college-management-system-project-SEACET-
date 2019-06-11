package com.example.college.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.college.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Staffs extends AppCompatActivity {

    private EditText editTextName,editTextDepartment,editTextEmail,editTextPassword,editTextPhone;
    private Button buttonSignUp;
    private TextView textViewSignIn;
    FirebaseAuth mAuth;
    FirebaseFirestore mFirestone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_staffs );
      /*  getSupportActionBar().setTitle("Staff");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
        editTextName = (EditText) findViewById( R.id.editTextName );
        editTextDepartment = (EditText) findViewById( R.id.editTextDepartment );
        editTextEmail = (EditText) findViewById( R.id.editTextEmail);
        editTextPassword = (EditText) findViewById( R.id.editTextPassword );
        editTextPhone = (EditText) findViewById( R.id.editTextPhone );
        buttonSignUp = (Button) findViewById( R.id.buttonSignUp );
        mAuth = FirebaseAuth.getInstance();
        mFirestone = FirebaseFirestore.getInstance();
        buttonSignUp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = editTextName.getText().toString();
                String Department = editTextDepartment.getText().toString();
                String Email = editTextEmail.getText().toString();
                String Phone = editTextPhone.getText().toString();

                Map<String,String> userMap = new HashMap<>(  );

                userMap.put("FacultyName",Name);
                userMap.put("FacultyDepartment",Department);
                userMap.put("FacultyEmail",Email);
                userMap.put("FacultyPhone",Phone);


                mFirestone.collection("Teacher").add(userMap).addOnSuccessListener( new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(Staffs.this,"Faculty data recorded",Toast.LENGTH_SHORT ).show();
                    }
                } ).addOnFailureListener( new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        String error = e.getMessage();
                        Toast.makeText( Staffs.this,"Error",Toast.LENGTH_SHORT ).show();
                    }
                } );

                String fEmail = editTextEmail.getText().toString();
                String fPassword = editTextPassword.getText().toString();
                if(!TextUtils.isEmpty(fEmail) && !TextUtils.isEmpty(fPassword) && ((fPassword.length() >=10)))
                {
                    mAuth.createUserWithEmailAndPassword(fEmail,fPassword).addOnCompleteListener( Staffs.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                sendEmailVerification();
                            }
                        }
                    } );
                } else if(TextUtils.isEmpty(fEmail))
                {
                    Toast.makeText(Staffs.this,"Email should not be Empty",Toast.LENGTH_SHORT ).show();
                } else if((fPassword.length()<10) || TextUtils.isEmpty(fPassword))
                {
                    Toast.makeText(Staffs.this,"Password should be atleast ten characters long!",Toast.LENGTH_SHORT ).show();
                }




            }
        } );


        textViewSignIn = (TextView) findViewById(R.id.textViewSignIn);

        textViewSignIn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Staffs.this, SecondPageMainActivity.class );
                finish();
                startActivity( intent );
            }
        } );
    }
    public void sendEmailVerification()
    {
        FirebaseUser user = mAuth.getCurrentUser();
        if(user!=null)
        {
            user.sendEmailVerification()
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful())
                            {
                                Toast.makeText(Staffs.this,"Student Registration is success,Please Check Your Email to Verify Your Gmail",Toast.LENGTH_SHORT).show();
                                finish();
                                startActivity(new Intent(Staffs.this,SecondPageMainActivity.class));
                            } else {
                                Toast.makeText(Staffs.this,"Verification Mail has'nt sent!..",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
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
