package com.example.college.Aptitude;

public class ArthmeticLibrary {
    private String mQuestions [] = {

            "5,8,13,21,?",
            "If 84x13=8 " +
                    "37x13=6"+
                    "26X11=6"+
                    "then 56x22=?",

            "If 1=3"+
                    "2=5"+
                    "3=7"+
                    "4=9"+
                    "then 7=?",
            "Change the sign where it is necessary to obtain the equation"+
                    "28-(3+4)+(2x2)=0",

            "If 55x11=9"+
                    "37x13=6"+
                    "42x12=3 then find the value of 87x77=?",

            "Find out the two signs to be interchanged for " +
                    "making following equation correct:"+
                    "5+3*8-12/4=3",

            "If 2+3=13"+
                    "3+4=25"+
                    "4+5=41 then"+
                    "5+6=?",



    };


    private String mChoices [][] = {
            {"31","34","35","28",},
            {"36","39","7","11",},
            {"15","13","17","11",},
            {"change + into x","change x into +","change - into +",
                    "change + into -"},
            {"1","3","4","5",},
            {"+ and -","- and /", "Err:509", "+ and /"},
            {"60","61","51","63",}
    };

    private String mCorrectAnswers[] = {"34","7","15",
            "change + into x","Honest","1","- and /","61",};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}



