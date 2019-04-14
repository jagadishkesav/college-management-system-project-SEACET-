package com.example.college.Aptitude;

public class PipesLibrary {

    private String mQuestions [] = {
            "Two pipes A and B can fill a cistern in 37 1/2 minutes and 45 minutes respectively." +
                    " Both pipes opened. The cistern will be filled in " +
                    "just half an hour, if the B is turned off after:\n" +

            "A tank is filled in 5 hours by three pipes A, B and C. The pipe C is twice as fast as B \n" +
                    "and B is twice as fast as A. How much time will pipe A alone take to fill the tank?\n" +
                    "Two pipes A and B can fill a tank in 20 and 30 minutes respectively. If both the pipes are \n" +
                    "used together, then how long will it take to fill the tank?",


    };


    private String mChoices [][] = {
            {"5min", "9min", "10min","15min"},
            {"20hours","25hours","35hours","cannot be determined"},


    };



    private String mCorrectAnswers[] = {"9min", "35hours",};





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






