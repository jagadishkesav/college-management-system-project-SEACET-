package com.example.college.Aptitude;

public class NoLibrary {
    private String mQuestions [] = {
            "If one-third of one-fourth of a number is 15, then " +
                    "three-tenth of that number is:",
            "Three times the first of three consecutive odd integers is 3 more than twice the third. \n" +
                    "The third integer is:",
            "The sum of the squares of three numbers is 138, while the sum of their products taken two at \n" +
                    "a time is 131. Their sum is:",


    };


    private String mChoices [][] = {
            {"35", "36", "45","54"},
            {"9", "11", "13","15"},
            {"20","30","40","None of these"},

    };



    private String mCorrectAnswers[] = {"54", "15", "20",
            };





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






