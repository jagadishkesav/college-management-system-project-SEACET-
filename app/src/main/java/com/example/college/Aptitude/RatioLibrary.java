package com.example.college.Aptitude;

public class RatioLibrary {
    private String mQuestions[] = {
            "A and B together have Rs. 1210. If 4/15 of A's amount is equal to 2/5of B's amount, how much \n" +
                    "amount does B have?",
            "Two numbers are respectively 20% and 50% more than a third number. The ratio of the two \n" +
                    "numbers is:",
            "A sum of money is to be distributed among A, B, C, D in the proportion of 5 : 2 : 4 : 3.\n" +
                    " If C gets Rs. 1000 more than D, what is B's share?",



    };

    private String mChoices[][] = {
            {"Rs.460", "Rs.468", "Rs.550", "664"},
            {"2:5","3:5","4:5","6:7"},
            {"Rs. 500","Rs. 1500","Rs. 2000","None of this",}

    };


    private String mCorrectAnswers[] = {"Rs.460", "4:5","Rs.2000"};


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







