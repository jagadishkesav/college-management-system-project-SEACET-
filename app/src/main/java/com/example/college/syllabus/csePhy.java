package com.example.college.syllabus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.college.R;



public class csePhy extends AppCompatActivity {
    ListView btnPdfList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_phy);
        btnPdfList = (ListView) findViewById(R.id.btnPdfList);
        String[] pdfFiles = {"ENGINEERING MATHEMATICS-I","ENGINEERING PHYSICS","ELEMENTS OF CIVIL ENGINEERING","ELEMENTS OF MECHANICAL ENGINEERING","BASIC ELECTRICAL ENGINEERING","CONSTITUTION OF INDIA","WORKSHOP PRACTICE","PHYSICS LAB"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, pdfFiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
                View view=super.getView(position,convertView,parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);

                return view;
            }
        };

        btnPdfList.setAdapter(adapter);

        btnPdfList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String item = btnPdfList.getItemAtPosition(i).toString();

                Intent intent=new Intent(csePhy.this, CsePdfOpener.class);
                intent.putExtra("PdfFileName",item);
                startActivity(intent);



            }
        });

    }
}


