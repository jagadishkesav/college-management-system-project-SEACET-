package com.example.college.syllabus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.college.R;

import com.github.barteksc.pdfviewer.PDFView;

public class CsePdfOpener extends AppCompatActivity {
    PDFView myPdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_pdf_opener);
        myPdfView = (PDFView) findViewById(R.id.pdfView);
        String getItem = getIntent().getStringExtra("PdfFileName");
        if(getItem.equals("ENGINEERING MATHEMATICS-I"))
        {
            myPdfView.fromAsset("math.pdf").load();
        }
        if(getItem.equals("ENGINEERING PHYSICS"))
        {
            myPdfView.fromAsset("csephy.pdf").load();
        }
        if(getItem.equals("ELEMENTS OF CIVIL ENGINEERING"))
        {
            myPdfView.fromAsset("elem.pdf").load();
        }
        if(getItem.equals("ELEMENTS OF MECHANICAL ENGINEERING"))
        {
            myPdfView.fromAsset("mech.pdf").load();
        }
        if(getItem.equals("BASIC ELECTRICAL ENGINEERING"))
        {
            myPdfView.fromAsset("cssyll.pdf").load();
        }
        if(getItem.equals("CONSTITUTION OF INDIA"))
        {
            myPdfView.fromAsset("contitution.pdf").load();
        }
        if(getItem.equals("WORKSHOP PRACTICE"))
        {
            myPdfView.fromAsset("wrkshop.pdf").load();
        }
        if(getItem.equals("PHYSICS LAB"))
        {
            myPdfView.fromAsset("phylab.pdf").load();
        }
    }
}

