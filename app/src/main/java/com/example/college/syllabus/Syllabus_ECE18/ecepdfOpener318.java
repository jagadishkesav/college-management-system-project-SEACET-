package com.example.college.syllabus.Syllabus_ECE18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.college.R;
import com.github.barteksc.pdfviewer.PDFView;

public class ecepdfOpener318 extends AppCompatActivity {
    PDFView myPdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecepdf_opener318);
        myPdfView = (PDFView) findViewById(R.id.pdfView);
        String getItem = getIntent().getStringExtra("PdfFileName");
        if(getItem.equals("Semester 3"))
        {
            myPdfView.fromAsset("17ecesem3.pdf").load();
        }
        if(getItem.equals("Semester 4"))
        {
            myPdfView.fromAsset("17ecesem4.pdf").load();
        }

    }
}












