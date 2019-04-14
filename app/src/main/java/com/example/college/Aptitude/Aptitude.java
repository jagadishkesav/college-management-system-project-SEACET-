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

import com.example.college.Attendance.AttendanceMainActivity;
import com.example.college.Notes.PdfMainActivity;
import com.example.college.R;

public class Aptitude extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {



    private Button btnAge;
    private Button btnTrains;
    private Button btnCalender;
    private Button btnAverages;
    private Button btnProbability;
    private Button btnPercentage;
    private Button btnTime;
    private Button btnProfit;
    private Button btnNumber;
    private Button btnSimple;
    private Button btnBoats;
    private Button btnRatio;
    private Button btnNo;
    private Button btnPermutation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_aptitude );
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );


        btnAge = (Button) findViewById(R.id.btnAge);
        btnAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, age.class);
                startActivity(intent);
            }
        });


        btnTrains = (Button) findViewById(R.id.btnTrains);
        btnTrains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, trains.class);
                startActivity(intent);
            }
        });

        btnCalender = (Button) findViewById(R.id.btnCalender);
        btnCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, calender.class);
                startActivity(intent);
            }
        });

        btnAverages = (Button) findViewById(R.id.btnAverages);
        btnAverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, averages.class);
                startActivity(intent);
            }
        });

        btnProbability = (Button) findViewById(R.id.btnProbability);
        btnProbability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, probability.class);
                startActivity(intent);
            }
        });

        btnPercentage = (Button) findViewById(R.id.btnPercentage);
        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, percentage.class);
                startActivity(intent);
            }
        });

        btnTime = (Button) findViewById(R.id.btnTime);
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, time.class);
                startActivity(intent);
            }
        });

        btnProfit = (Button) findViewById(R.id.btnProfit);
        btnProfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, profit.class);
                startActivity(intent);
            }
        });

        btnNumber = (Button) findViewById(R.id.btnNumber);
        btnNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, number.class);
                startActivity(intent);


            }
        });


        btnSimple = (Button) findViewById(R.id.btnSimple);
        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, simple.class);
                startActivity(intent);

            }
        });

        btnBoats = (Button) findViewById(R.id.btnBoats);
        btnBoats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, boats.class);
                startActivity(intent);


            }
        });

        btnRatio = (Button) findViewById(R.id.btnRatio);
        btnRatio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, ratio.class);
                startActivity(intent);


            }
        });


        btnNo = (Button) findViewById(R.id.btnNo);
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, no.class);
                startActivity(intent);


            }
        });

        btnPermutation = (Button) findViewById(R.id. btnPermutation);
        btnPermutation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aptitude.this, permutation.class);
                startActivity(intent);


            }
        });













    DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle( this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( toggle );
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener( this );
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
        getMenuInflater().inflate( R.menu.aptitude, menu );
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
