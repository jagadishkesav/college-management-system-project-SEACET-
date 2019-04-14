package com.example.college.Aptitude;

public class AveragesLibrary {
    private String mQuestions [] = {

            "In the first 10 overs of a cricket game, the run rate was " +
                    "only 3.2. What should be the run rate in\n" +
                    " the remaining 40 overs to reach the target of" +
                    " 282 runs?",
            "The average monthly income of P and Q is Rs. 5050. The " +
                    "average monthly income of Q and R is\n" +
                    " Rs. 6250 and the average monthly income of P " +
                    "and R is Rs. 5200. The monthly income of P is:",

            "The average age of husband, wife and their child 3 years " +
                    "ago was 27 years and that of wife and the \n" +
                    "child 5 years ago was 20 years. The present age " +
                    "of the husband is:",

            "The average weight of A, B and C is 45 kg. If the average " +
                    "weight of A and B be 40 kg and \n" +
                    "that of B and C be 43 kg, then the weight of B" +
                    " is:\n",

            "A library has an average of 510 visitors on Sundays and " +
                    "240 on other days. The average number of visitors" +
                    " per day in a month of 30 days beginning with a " +
                    "Sunday is:",

    };


    private String mChoices [][] = {
            {"6.25", "6.5", "6.75","7"},
            {"3500","4000","4050","5000"},
            {"35years","40years","50years","None of these"},
            {"17kg","20kg","26kg","31kg"},
            {"250","276","280","285"},

    };



    private String mCorrectAnswers[] = {"6.25", "4000","40years","31kg",
            "285",};




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




