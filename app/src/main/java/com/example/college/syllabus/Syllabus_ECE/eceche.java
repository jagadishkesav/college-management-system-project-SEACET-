package com.example.college.syllabus.Syllabus_ECE;

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
import com.example.college.syllabus.Syllabus_CSE.CsePdfOpener1;

public class eceche extends AppCompatActivity {
    ListView btnPdfList1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eceche);

        btnPdfList1 = (ListView) findViewById(R.id.btnPdfList1);
        String[] pdfFiles = {"ENGINEERING MATHEMATICS-II","ENGINEERING CHEMISTRY","BASIC ELECTRONICS","COMPUTER AIDED ENGINEERING DRAWING","PROGRAMMING IN C AND DATA STRUCTURES","ENVIRONMENTAL STUDIES","COMPUTER PROGRAMMING LABORATORY","ENGINEERING CHEMISTRY LABORATORY"};

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

                Intent intent=new Intent(eceche.this, ecepdfOpener1.class);
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






