package com.example.college.syllabus.Syllabus_CIV;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.college.R;
import com.github.barteksc.pdfviewer.PDFView;

public class civpdfOpener extends AppCompatActivity {

    PDFView myPdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civpdf_opener);


        myPdfView = (PDFView) findViewById(R.id.pdfView);
        String getItem = getIntent().getStringExtra("PdfFileName");
        if(getItem.equals("ENGINEERING MATHEMATICS-I"))
        {
            myPdfView.fromAsset("maths1.pdf").load();
        }
        if(getItem.equals("ENGINEERING PHYSICS"))
        {
            myPdfView.fromAsset("csephy.pdf").load();
        }
        if(getItem.equals("ELEMENTS OF CIVIL ENGINEERING"))
        {
            myPdfView.fromAsset("csecivil.pdf").load();
        }
        if(getItem.equals("ELEMENTS OF MECHANICAL ENGINEERING"))
        {
            myPdfView.fromAsset("mech.pdf").load();
        }
        if(getItem.equals("BASIC ELECTRICAL ENGINERRING"))
        {
            myPdfView.fromAsset("cseelectrical.pdf").load();
        }
        if(getItem.equals("CONSTITUTION OF INDIA"))
        {
            myPdfView.fromAsset("const.pdf").load();
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


