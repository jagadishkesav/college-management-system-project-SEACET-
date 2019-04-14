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

public class AptitudeMainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {



    private Button btnAptitude;
    private Button btnLogical;
    private Button btnVerbal;
    private Button btnTechnical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        btnAptitude = (Button) findViewById(R.id.btnAptitude);
        btnAptitude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AptitudeMainActivity.this, Aptitude.class);
                finish();
                startActivity(intent);


            }
        });
        btnLogical = (Button) findViewById(R.id.btnLogical);
        btnLogical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent log = new Intent(AptitudeMainActivity.this, logical.class);
                finish();
                startActivity(log);

            }
        });

        btnVerbal = (Button) findViewById(R.id.btnVerbal);
        btnVerbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ver = new Intent(AptitudeMainActivity.this, verbal.class);
                finish();
                startActivity(ver);
            }
        });
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
        getMenuInflater().inflate( R.menu.aptitude_main, menu );
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
                Intent a = new Intent( AptitudeMainActivity.this, AptitudeMainActivity.class );
                startActivity( a );
                break;
            case R.id.nav_notifications:
                Intent n = new Intent( AptitudeMainActivity.this, AttendanceMainActivity.class );
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
