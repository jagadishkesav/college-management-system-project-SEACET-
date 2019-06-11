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

import com.example.college.Attendance.Student;
import com.example.college.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.ProviderQueryResult;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Students extends AppCompatActivity {

    private EditText StudentName,StudentUsn,StudentEmail,editTextPassword,StudentBranch,StudentCurrentSem,StudentPhone;
    private Button buttonSignUp;
    private TextView textViewSignIn;
    FirebaseAuth mAuth;
    FirebaseFirestore mFirestone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_students );
        StudentName = (EditText) findViewById( R.id.StudentName );
        StudentUsn = (EditText) findViewById( R.id.StudentUsn );
        StudentEmail = (EditText) findViewById( R.id.StudentEmail );
        editTextPassword = (EditText) findViewById( R.id.editTextPassword );
        StudentBranch = (EditText) findViewById( R.id.StudentBranch);
        StudentCurrentSem = (EditText) findViewById( R.id.StudentCurrentSem );
        mAuth = FirebaseAuth.getInstance();
        mFirestone = FirebaseFirestore.getInstance();
        StudentPhone = (EditText) findViewById( R.id.StudentPhone );
        textViewSignIn = (TextView) findViewById( R.id.textViewSignIn );

        buttonSignUp = (Button) findViewById( R.id.buttonSignUp );
         buttonSignUp.setOnClickListener( new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String Name = StudentName.getText().toString();
                 String USN = StudentUsn.getText().toString();
                 String Email = StudentEmail.getText().toString();
                 String Branch = StudentBranch.getText().toString();
                 String CurrentSemester = StudentCurrentSem.getText().toString();
                 String Phone_number = StudentPhone.getText().toString();
                 Map<String,String> userMap = new HashMap <>(  );

                 userMap.put("StudentName",Name);
                 userMap.put("StudentUsn",USN);
                 userMap.put("StudentEmail",Email);
                 userMap.put("StudentBranch",Branch);
                 userMap.put("StudentCurrentSemester",CurrentSemester);
                 userMap.put("StudentPhoneNumber",Phone_number);

                 mFirestone.collection("Students").add(userMap).addOnSuccessListener( new OnSuccessListener<DocumentReference>() {
                     @Override
                     public void onSuccess(DocumentReference documentReference) {

                         Toast.makeText(Students.this,"Student data recorded",Toast.LENGTH_SHORT ).show();
                     }
                 } ).addOnFailureListener( new OnFailureListener() {
                     @Override
                     public void onFailure(@NonNull Exception e) {
                         String error = e.getMessage();
                         Toast.makeText( Students.this,"Error",Toast.LENGTH_SHORT ).show();
                     }
                 } );

                 String sEmail = StudentEmail.getText().toString();
                 String sPassword = editTextPassword.getText().toString();
                 mAuth.fetchProvidersForEmail(Email)
                 .addOnCompleteListener(new OnCompleteListener<ProviderQueryResult>() {
                     @Override
                     public void onComplete(@NonNull Task<ProviderQueryResult> task) {
                         boolean check = !task.getResult().getProviders().isEmpty();
                         if(!check)
                         {
                             Toast.makeText(Students.this,"Email is not Found",Toast.LENGTH_SHORT).show();
                         }
                         else
                         {
                             Toast.makeText(Students.this,"Email is already exist....",Toast.LENGTH_SHORT).show();

                         }

                     }
                 });

                 if(!TextUtils.isEmpty(sEmail) && !TextUtils.isEmpty(sPassword) && ((sPassword.length() >=10)))
                 {
                     mAuth.createUserWithEmailAndPassword(sEmail,sPassword).addOnCompleteListener( Students.this, new OnCompleteListener<AuthResult>() {
                         @Override
                         public void onComplete(@NonNull Task<AuthResult> task) {
                             if(task.isSuccessful())
                             {
                                 sendEmailVerification();

                             }

                         }
                     } );
                 } else if(TextUtils.isEmpty(sEmail))
                 {
                     Toast.makeText(Students.this,"Email should not be Empty",Toast.LENGTH_SHORT ).show();
                 } else if((sPassword.length()<10) || TextUtils.isEmpty(sPassword))
                 {
                     Toast.makeText(Students.this,"Password should be atleast ten characters long!",Toast.LENGTH_SHORT ).show();
                 }



                 
             }
         } );
        textViewSignIn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Students.this, SecondPageMainActivity.class );
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
                            Toast.makeText(Students.this,"Student Registration is success,Please Check Your Email to Verify Your Email",Toast.LENGTH_SHORT).show();
                            finish();
                            startActivity(new Intent(Students.this,SecondPageMainActivity.class));
                        } else {
                            Toast.makeText(Students.this,"Verification Mail has'nt sent!..",Toast.LENGTH_SHORT).show();
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
