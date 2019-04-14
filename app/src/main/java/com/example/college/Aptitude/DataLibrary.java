package com.example.college.Aptitude;

public class DataLibrary {
    private String mQuestions [] = {

            "ENORMOUS",
            "COMMISSIONED",





    };


    private String mChoices [][] = {
            {"Soft", "Average", "Tiny","Weak"},
            {"Started","Closed","Finished","Terminated"},
            {"Influx","Home-coming","Return","Restoration"},
            {"Abdicate","Renounce","Possess","Deny"},
            {"Free","Honest","Liberal","Frank"},
    };

    private String mCorrectAnswers[] = {"Tiny","Terminated","Influx",
            "possess","Honest",};


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






