package com.example.college.syllabus.Syllabus_CIV;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.college.R;
import com.github.barteksc.pdfviewer.PDFView;

public class civpdfOpener7 extends AppCompatActivity {
    PDFView myPdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civpdf_opener7);

        myPdfView = (PDFView) findViewById(R.id.pdfView);
        String getItem = getIntent().getStringExtra("PdfFileName");
        if(getItem.equals("Semester 7"))
        {
            myPdfView.fromAsset("15civsem7.pdf").load();
        }
        if(getItem.equals("Semester 8"))
        {
            myPdfView.fromAsset("15civsem8.pdf").load();
        }

    }

}
