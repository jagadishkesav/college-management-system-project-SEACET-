package com.example.college.syllabus.Syllabus_ECE2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.college.R;
import com.github.barteksc.pdfviewer.PDFView;

public class ecepdfOpener117 extends AppCompatActivity {
    PDFView myPdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecepdf_opener117);

        myPdfView = (PDFView) findViewById(R.id.pdfView);
        String getItem = getIntent().getStringExtra("PdfFileName");
        if(getItem.equals("ENGINEERING  MATHEMATICS-II"))
        {
            myPdfView.fromAsset("maths2.pdf").load();
        }
        if(getItem.equals("ENGINEERING CHEMISTRY"))
        {
            myPdfView.fromAsset("chem.pdf").load();
        }
        if(getItem.equals("BASIC ELECTRONICS"))
        {
            myPdfView.fromAsset("electronics.pdf").load();
        }
        if(getItem.equals("COMPUTER AIDED ENGINEERING DRAWING"))
        {
            myPdfView.fromAsset("cad.pdf").load();
        }
        if(getItem.equals("PROGRAMMING IN C AND DATA STRUCTURES"))
        {
            myPdfView.fromAsset("c.pdf").load();
        }
        if(getItem.equals("ENVIRONMENTAL STUDIES"))
        {
            myPdfView.fromAsset("envi.pdf").load();
        }
        if(getItem.equals("COMPUTER PROGRAMMING LABORATORY"))
        {
            myPdfView.fromAsset("comlab.pdf").load();
        }
        if(getItem.equals("ENGINEERING CHEMISTRY LABORATORY"))
        {
            myPdfView.fromAsset("chemlab.pdf").load();
        }

        if(getItem.equals("KANNADA MANASU"))
        {
            myPdfView.fromAsset("kannadamansu.pdf").load();
        }
    }
}






