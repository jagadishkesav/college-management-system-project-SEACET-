package com.example.college.syllabus.Syllabus_CSE18;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.college.R;

public class csechemistry18 extends AppCompatActivity {
    ListView btnPdfList1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csechemistry18);


        btnPdfList1 = (ListView) findViewById(R.id.btnPdfList1);
        String[] pdfFiles = {"ENGINEERING  MATHEMATICS-II","ENGINEERING CHEMISTRY","BASIC ELECTRONICS","COMPUTER AIDED ENGINEERING DRAWING","PROGRAMMING IN C AND DATA STRUCTURES","ENVIRONMENTAL STUDIES","COMPUTER PROGRAMMING LABORATORY","ENGINEERING CHEMISTRY LABORATORY","KANNADA MANASU"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, pdfFiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
                View view=super.getView(position,convertView,parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };

        btnPdfList1.setAdapter(adapter);

        btnPdfList1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String item = btnPdfList1.getItemAtPosition(i).toString();

                Intent intent=new Intent(csechemistry18.this, CsepdfOpener118.class);
                intent.putExtra("PdfFileName",item);
                startActivity(intent);



            }
        });

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );

        super.onBackPressed();

    }

}

