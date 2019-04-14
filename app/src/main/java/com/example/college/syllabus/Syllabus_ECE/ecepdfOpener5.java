package com.example.college.syllabus.Syllabus_ECE;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.college.R;
import com.github.barteksc.pdfviewer.PDFView;

public class ecepdfOpener5 extends AppCompatActivity {
    PDFView myPdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecepdf_opener5);
        myPdfView = (PDFView) findViewById(R.id.pdfView);
        String getItem = getIntent().getStringExtra("PdfFileName");
        if(getItem.equals("Semester 5"))
        {
            myPdfView.fromAsset("15ecesem5.pdf").load();
        }
        if(getItem.equals("Semester 6"))
        {
            myPdfView.fromAsset("15ecesem6.pdf").load();
        }

    }
}







