package com.example.college.Aptitude;

public class SimpleLibrary {

 private String mQuestions [] = {
        "A sum of money at simple interest amounts to Rs. 815 in\n" +
                " 3 years and to Rs. 854 in 4 years. The sum is:",
         "A sum fetched a total simple interest of Rs. 4016.25 at the " +
                 "rate of 9 p.c.p.a. in 5 years. What is the sum?",
                "How much time will it take for an amount of Rs. 450 to \n" +
                        "yield Rs. 81 as interest at 4.5% per annum of " +
                        "simple interest?",
         "A sum of Rs. 12,500 amounts to Rs. 15,500 in 4 years at\n" +
                 " the rate of simple interest. What is the rate of " +
                 "interest?",


};


    private String mChoices [][] = {
            {"650", "690", "698","700"},
            {"4462","8032.50","8900","8925"},
            {"3.5years","4years","4.5years","5years"},
            {"3%","4%","5%","6%"},



    };



    private String mCorrectAnswers[] = {"698", "8925", "4years","6%",};




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

