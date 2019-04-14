package com.example.college.Aptitude;

public class NumberLibrary {
    private String mQuestions[] = {
            "Which one of the following is not a prime number?",
            "How many of the following numbers are divisible by 132 ?\n" +
                    "264, 396, 462, 792, 968, 2178, 5184, 6336",
            "1397 x 1397 = ?",
            "Which of the following is a prime number ?",
            "Which of the following number is divisible by 24 ?",


    };

    private String mChoices[][] = {
            {"31", "61", "71", "91"},
            {"4","5"," 6","7"},
            {"1951609","1981709","18362619","2031719"},
            {"33","81","93","97"},
            {"35718","63810","537804","3125736"},

    };


    private String mCorrectAnswers[] = {"91", "4","1951609","97","3125736"};


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







