package com.example.college.syllabus.Syllabus_CSE17;

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

public class csesem317 extends AppCompatActivity {
    ListView btnPdfList3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem317);


        btnPdfList3 = (ListView) findViewById(R.id.btnPdfList3);
        String[] pdfFiles = {"Semester 3","Semester 4"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, pdfFiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
                View view=super.getView(position,convertView,parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);

                return view;
            }
        };

        btnPdfList3.setAdapter(adapter);

        btnPdfList3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String item = btnPdfList3.getItemAtPosition(i).toString();

                Intent intent=new Intent(csesem317.this, CsepdfOpener317.class);
                intent.putExtra("PdfFileName",item);
                startActivity(intent);



            }
        });

    }
}





