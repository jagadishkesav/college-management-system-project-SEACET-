package com.example.college.syllabus.Syllabus_MEC17;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.college.R;
import com.example.college.syllabus.Syllabus_CSE17.CsepdfOpener517;
import com.example.college.syllabus.Syllabus_CSE17.csesem517;

public class mecsem517 extends AppCompatActivity {

    ListView btnPdfList5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecsem517);

        btnPdfList5 = (ListView) findViewById(R.id.btnPdfList5);
        String[] pdfFiles = {"Semester 5","Semester 6"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, pdfFiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
                View view=super.getView(position,convertView,parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);

                return view;
            }
        };

        btnPdfList5.setAdapter(adapter);

        btnPdfList5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String item = btnPdfList5.getItemAtPosition(i).toString();

                Intent intent=new Intent(mecsem517.this, mecpdfOpener517.class);
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



