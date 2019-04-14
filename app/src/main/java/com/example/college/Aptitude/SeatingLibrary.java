package com.example.college.Aptitude;

public class SeatingLibrary {
    private String mQuestions [] = {

            "Which two of the following are not neighbours?",
            "which one is immediate right to the v?",
            "who seating immediate right to Reeta?",
            "who is in the middle of the photograph?",




    };


    private String mChoices [][] = {
            {"RV", "UV", "RP","QW"},
            {"P","U","R","T"},
            {"Bindu","Rani","Marry","Seema"},
            {"Bindu","Rani","Reeta","Seema"},
    };

    private String mCorrectAnswers[] = {"RV","R","Marry",
            "Rani",};


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






