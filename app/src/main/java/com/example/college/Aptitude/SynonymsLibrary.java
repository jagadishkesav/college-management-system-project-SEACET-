package com.example.college.Aptitude;

public class SynonymsLibrary {
    private String mQuestions [] = {
            "Synonyms of : UNCOUTH",
            "Synonyms of DEBACLE",
            "Synonyms of TEPID",
            "Synonyms of VARACIOUS",



    };


    private String mChoices [][] = {
            {"Ungraceful", "Rough ", "Slovenly","Dirty"},
            {"Collapse", "Decline", "Defeat","Disgrace"},
            {"HOt ","Warm","Cold","Boiling"},
            {"Wild","Greedy","Angry","Quick"}

    };



    private String mCorrectAnswers[] = {"Rough", "Collapse", "Warm",
    "Greedy"};





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








