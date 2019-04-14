package com.example.college.Aptitude;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.college.Attendance.AttendanceMainActivity;
import com.example.college.Notes.PdfMainActivity;
import com.example.college.R;

public class calender extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private CalenderLibrary mCalenderLibrary = new CalenderLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;


    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_calender );
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );



        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle( this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( toggle );
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener( this );

        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mScoreView = (TextView)findViewById(R.id.score);


        updateAgeQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateAgeQuestion();
                    //This line of code is optiona
                    Toast.makeText(calender.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(calender.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateAgeQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateAgeQuestion();
                    //This line of code is optiona
                    Toast.makeText(calender.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(calender.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateAgeQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateAgeQuestion();
                    //This line of code is optiona
                    Toast.makeText(calender.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(calender.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateAgeQuestion();
                }
            }
        });

        //End of Button Listener for Button3


        //Start of Button Listener for Button3
        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice4.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateAgeQuestion();
                    //This line of code is optiona
                    Toast.makeText(calender.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(calender.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateAgeQuestion();
                }
            }
        });

    }

    private void updateAgeQuestion() {
        mQuestionView.setText(mCalenderLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mCalenderLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mCalenderLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mCalenderLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mCalenderLibrary.getChoice4(mQuestionNumber));


        mAnswer = mCalenderLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }




    private void updateScore(int point)
    {
        mScoreView.setText("" + mScore);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.calender, menu );
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
                Intent a = new Intent( getApplicationContext(), AptitudeMainActivity.class );
                startActivity( a );
                break;
            case R.id.nav_notifications:
                Intent n = new Intent( getApplicationContext(), AttendanceMainActivity.class );
                startActivity( n );
                break;

            case R.id.nav_assignment:
                Intent intent = new Intent(getApplicationContext(), PdfMainActivity.class );
                finish();
                startActivity( intent );
                break;
        }


        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        drawer.closeDrawer( GravityCompat.START );
        return true;
    }
}
