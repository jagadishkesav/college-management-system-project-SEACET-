package com.example.college.syllabus.Syllabus_ECE2017;

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

public class ecesem717 extends AppCompatActivity {
    ListView btnPdfList7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecesem717);
        btnPdfList7 = (ListView) findViewById(R.id.btnPdfList7);
        String[] pdfFiles = {"Semester 7","Semester 8"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, pdfFiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
                View view=super.getView(position,convertView,parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);

                return view;
            }
        };

        btnPdfList7.setAdapter(adapter);

        btnPdfList7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String item = btnPdfList7.getItemAtPosition(i).toString();

                Intent intent=new Intent(ecesem717.this, ecepdfOpener717.class);
                intent.putExtra("PdfFileName",item);
                startActivity(intent);



            }
        });

    }
}





