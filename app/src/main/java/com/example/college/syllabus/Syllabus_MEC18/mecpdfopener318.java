package com.example.college.syllabus.Syllabus_MEC18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.college.R;
import com.github.barteksc.pdfviewer.PDFView;

public class mecpdfopener318 extends AppCompatActivity {
    PDFView myPdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecpdfopener318);


        myPdfView = (PDFView) findViewById(R.id.pdfView);
        String getItem = getIntent().getStringExtra("PdfFileName");
        if(getItem.equals("Semester 3"))
        {
            myPdfView.fromAsset("15mecsem3.pdf").load();
        }
        if(getItem.equals("Semester 4"))
        {
            myPdfView.fromAsset("15mecsem4.pdf").load();
        }

    }
}












