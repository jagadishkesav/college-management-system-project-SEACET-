package com.example.college.Aptitude;

public class ProbabilityLibrary {
    private String mQuestions [] = {
            "What is the probability of getting an even number when a dice "
               + "is rolled?:",
            "The tickets numbered from 1 to 20 are mixed up and then a " +
                    "ticket is drawn at random. What is the " +
                    " that the ticket has a number which is a multiple " +
                    " 3 or 5",
            "A box contains 2 red, 3 green, and 2 blue balls. What is" +
                    " the probability that none of the balls drawn is " +
                    "blue?",

            "In a bag, there are 8 red, 7 yellow and 6 green balls. " +
                    "If one ball is picked up at random, what is the" +
                    " probability that it is neither red nor green?",

            "In a group of students, there are 15 boys and 10 girls. " +
                    "If three students are selected at random, what is " +
                    " probability that 1 girl and 2 boys are selected?",

    };


    private String mChoices [][] = {
            {"1/5", "1/2", "1/3","1/4"},
            {"9/20","9/24","9/27","9/30"},
            {"10/25","10/21","10/31","10/21"},
            {"1/4","1/2","1/5","1/3"},
            {"21/46","21/36","21/26","21/56"},

    };


    private String mCorrectAnswers[] = {"1/2","9/20","10/21",
    "1/3","21/46",};




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




