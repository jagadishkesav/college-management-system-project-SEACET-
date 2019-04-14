package com.example.college.syllabus.Syllabus_CSE18;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.college.R;
import com.github.barteksc.pdfviewer.PDFView;

public class CsepdfOpener318 extends AppCompatActivity {

    PDFView myPdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csepdf_opener318);

        myPdfView = (PDFView) findViewById(R.id.pdfView);
        String getItem = getIntent().getStringExtra("PdfFileName");
        if(getItem.equals("Semester 3"))
        {
            myPdfView.fromAsset("syllabus318.pdf").load();
        }
        if(getItem.equals("Semester 4"))
        {
            myPdfView.fromAsset("syllabus418.pdf").load();
        }

    }
}











