package com.example.college;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FeedbackMain extends AppCompatActivity {
    TextView txtMarquee;
    private EditText namee;
    private EditText usn;
    private EditText email;
    private EditText subject;
    private EditText feed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_main);
        // public void send_click(View view)
        // {

        EditText namee = (EditText) findViewById(R.id.namee);
        EditText usn = (EditText) findViewById(R.id.usn);
        EditText email = (EditText) findViewById(R.id.email);
        EditText subject = (EditText) findViewById(R.id.subject);
        EditText feed = (EditText) findViewById(R.id.feed);

        if (namee.getText().toString().equals(""))
            namee.setError("Mandatory Field");
        else if (usn.getText().toString().equals(""))
            usn.setError("Mandatory Field");
        else if (email.getText().toString().equals(""))
            email.setError("Mandatory Field");
        else if (subject.getText().toString().equals(""))
            subject.setError("Mandatory Field");
        else if (feed.getText().toString().equals(""))
            feed.setError("Mandatory Field");
        else {
            Intent i = new Intent(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("mailto:"));
            i.putExtra(Intent.EXTRA_EMAIL, new String[]{"deepa@gmail.com"});
            i.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
            i.putExtra(Intent.EXTRA_TEXT, "dear deepa, \n"
                    + feed.getText().toString() + "\n regards,"
                    + email.getText().toString());

            try {
                startActivity(Intent.createChooser(i, "send mail"));
            } catch (ActivityNotFoundException ex) {
                Toast.makeText(this, "no mail app found", Toast.LENGTH_SHORT).show();

            } catch (Exception ex) {
                Toast.makeText(this, "unexpected error" + ex.toString(), Toast.LENGTH_SHORT).show();
            }

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
