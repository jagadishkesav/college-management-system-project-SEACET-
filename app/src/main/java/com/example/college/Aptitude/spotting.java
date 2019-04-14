package com.example.college.Aptitude;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.college.R;

public class spotting extends AppCompatActivity {
    private SpottingLibrary mSpottingLibrary = new SpottingLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;


    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotting);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mScoreView = (TextView)findViewById(R.id.score);


        updateAgeQuestion();

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateAgeQuestion();
                    //This line of code is optiona
                    Toast.makeText(spotting.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(spotting.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateAgeQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateAgeQuestion();
                    //This line of code is optiona
                    Toast.makeText(spotting.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(spotting.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateAgeQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateAgeQuestion();
                    //This line of code is optiona
                    Toast.makeText(spotting.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(spotting.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateAgeQuestion();
                }
            }
        });

        //End of Button Listener for Button3


        //Start of Button Listener for Button3
        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice4.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateAgeQuestion();
                    //This line of code is optiona
                    Toast.makeText(spotting.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(spotting.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateAgeQuestion();
                }
            }
        });

        //End of Button Listener for Button3

    }

    private void updateAgeQuestion() {
        mQuestionView.setText(mSpottingLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mSpottingLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mSpottingLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mSpottingLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mSpottingLibrary.getChoice4(mQuestionNumber));


        mAnswer = mSpottingLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }



    private void updateScore(int point)
    {
        mScoreView.setText("" + mScore);
    }
}






