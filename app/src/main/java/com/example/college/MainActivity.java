package com.example.college;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.college.Aptitude.AptitudeMainActivity;
import com.example.college.Attendance.AttendanceMainActivity;
import com.example.college.Attendance.LoginActivity;
import com.example.college.Dictionary.DictionaryMainActivity;
import com.example.college.NoteView.NoteView;
import com.example.college.Notes.note;
import com.example.college.StickyNotes.StickyNotesMain;
import com.example.college.syllabus.SyllabusMain;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Button buttonAttendance,buttonSticky_note,buttonNotes,buttonDictionary,buttonResult,buttonSgpa_to_Cgpa,buttonExternalTimeTable,buttonAptitudeQuiz,buttonSyllabus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
       Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
       setSupportActionBar( toolbar );
        buttonSyllabus = (Button) findViewById(R.id.buttonSyllabus);
        buttonSyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent syllabus = new Intent( MainActivity.this, SyllabusMain.class );
                startActivity( syllabus );
            }
        });
        buttonAttendance = (Button) findViewById(R.id.buttonAttendance);
        buttonAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent( MainActivity.this, LoginActivity.class );
                startActivity( a );
            }
        });

        buttonSticky_note = (Button) findViewById(R.id.buttonSticky_note);
        buttonSticky_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent( MainActivity.this, StickyNotesMain.class );
                startActivity( result );
            }
        });
        buttonExternalTimeTable = (Button)findViewById( R.id.buttonExternalTimeTable );
        buttonExternalTimeTable.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent( MainActivity.this, External_tt.class );
                startActivity( result );
            }
        } );
        buttonSgpa_to_Cgpa = (Button)findViewById( R.id.buttonSgpa_to_Cgpa );
        buttonSgpa_to_Cgpa.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent( MainActivity.this, sgpaandcgpa.class );
                startActivity( result );
            }
        } );

        buttonResult = (Button)findViewById( R.id.buttonResult );
        buttonResult.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent( MainActivity.this, webview.class );
                startActivity( result );
            }
        } );

        buttonNotes = (Button)  findViewById( R.id.buttonNotes );
        buttonNotes.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, NoteView.class );
                startActivity( intent );
            }
        } );

        buttonDictionary = (Button) findViewById( R.id.buttonDictionary );
        buttonDictionary.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dic = new Intent( MainActivity.this, DictionaryMainActivity.class );
                startActivity( dic );
            }
        } );

        buttonAptitudeQuiz = (Button) findViewById( R.id.buttonAptitudeQuiz );
        buttonAptitudeQuiz.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apti = new Intent( MainActivity.this, AptitudeMainActivity.class );
                startActivity( apti );
            }
        } );
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
       ActionBarDrawerToggle toggle = new ActionBarDrawerToggle( this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( toggle );
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener( this );
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to Exit?")
                .setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.setTitle("Exit Alert!!!!");
        alertDialog.show();

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        if (drawer.isDrawerOpen( GravityCompat.START )) {
            drawer.closeDrawer( GravityCompat.START );
        } else {

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.main, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected( item );
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id)
        {
            case R.id.nav_attendance:
                Intent a = new Intent( MainActivity.this, AttendanceLoginActivity.class );
                startActivity( a );
                break;
            case R.id.nav_notifications:
                Intent n = new Intent( MainActivity.this,NotificationLoginActivity.class );
                startActivity( n );
                break;

            case R.id.nav_assignment:
                Intent intent = new Intent(getApplicationContext(), noteLoginActivity.class );
                startActivity( intent );
                break;
            case R.id.navFeedback:
                Intent feed = new Intent(getApplicationContext(), FeedbackMain.class );
                startActivity( feed );
                break;
            case R.id.nav_about:
                Intent about = new Intent(getApplicationContext(), AboutOurCollegeMain.class );
                startActivity( about );
                break;
            case R.id.nav_share:
                Intent share = new Intent(getApplicationContext(), share.class );
                startActivity( share );
                break;
        }


        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        drawer.closeDrawer( GravityCompat.START );
        return true;
    }
}
