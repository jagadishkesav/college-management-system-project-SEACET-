package com.example.college.syllabus.Syllabus_CSE;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.college.R;
import com.github.barteksc.pdfviewer.PDFView;

public class CsepdfOpener5 extends AppCompatActivity {

    PDFView myPdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csepdf_opener5);
        myPdfView = (PDFView) findViewById(R.id.pdfView);
        String getItem = getIntent().getStringExtra("PdfFileName");
        if(getItem.equals("Semester 5"))
        {
            myPdfView.fromAsset("syllabus5.pdf").load();
        }
        if(getItem.equals("Semester 6"))
        {
            myPdfView.fromAsset("syllabus6.pdf").load();
        }

    }
}