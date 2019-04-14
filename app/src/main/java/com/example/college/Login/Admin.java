package com.example.college.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
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

public class Admin extends AppCompatActivity {

    private EditText editTextName,editTextAdminId,editTextPassword,editTextEmail,editTextPhone;
    private Button buttonSignUp;
    private TextView textViewSingIn;
    FirebaseAuth mAuth;
    FirebaseFirestore mFirestone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_admin );
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAdminId = (EditText) findViewById(R.id.editTextAdminId);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPhone  = (EditText) findViewById(R.id.editTextPhone);
        buttonSignUp = (Button) findViewById(R.id.buttonSignUp);
        textViewSingIn = (TextView) findViewById(R.id.textViewSignIn);

        mAuth = FirebaseAuth.getInstance();
        mFirestone = FirebaseFirestore.getInstance();


        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = editTextName.getText().toString();
                String Usn = editTextAdminId.getText().toString();
                String Email = editTextEmail.getText().toString();
                String Phone = editTextPhone.getText().toString();
                Map<String,String> userMap = new HashMap<>(  );

                userMap.put("AdminName",Name);
                userMap.put("AdminUsn",Usn);
                userMap.put("AdminEmail",Email);
                userMap.put("AdminPhone",Phone);


                mFirestone.collection("Admin").add(userMap).addOnSuccessListener( new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(Admin.this,"Admin data recorded",Toast.LENGTH_SHORT ).show();
                    }
                } ).addOnFailureListener( new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        String error = e.getMessage();
                        Toast.makeText( Admin.this,"Error",Toast.LENGTH_SHORT ).show();
                    }
                } );

                String AEmail = editTextEmail.getText().toString();
                String APassword = editTextPassword.getText().toString();
                if(!TextUtils.isEmpty(AEmail) && !TextUtils.isEmpty(APassword) && ((APassword.length() >=10)))
                {
                    mAuth.createUserWithEmailAndPassword(AEmail,APassword).addOnCompleteListener( Admin.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                            {
                                sendEmailVerification();
                            }
                        }
                    } );
                } else if(TextUtils.isEmpty(AEmail))
                {
                    Toast.makeText(Admin.this,"Email should not be Empty",Toast.LENGTH_SHORT ).show();
                } else if((APassword.length()<10) || TextUtils.isEmpty(APassword))
                {
                    Toast.makeText(Admin.this,"Password should be atleast ten characters long!",Toast.LENGTH_SHORT ).show();
                }




            }
        } );

        textViewSingIn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Admin.this, SecondPageMainActivity.class );
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
                                Toast.makeText(Admin.this,"Student Registration is success,Please Check Your Email to Verify Your Gmail",Toast.LENGTH_SHORT).show();
                                finish();
                                startActivity(new Intent(Admin.this,SecondPageMainActivity.class));
                            } else {
                                Toast.makeText(Admin.this,"Verification Mail has'nt sent!..",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }

}
