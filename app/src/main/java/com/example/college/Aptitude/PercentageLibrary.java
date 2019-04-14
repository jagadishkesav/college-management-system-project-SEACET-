package com.example.college.Aptitude;

public class PercentageLibrary {
    private String mQuestions [] = {
            "A batsman scored 110 runs which included 3 boundaries and" +
                    " 8 sixes. What percent of his total score did he " +
                    "make by running between the wickets?",
            "A fruit seller had some apples. He sells 40% apples and " +
                    "still has 420 apples. Originally, he had:",
            "If A = x% of y and B = y% of x, then which of the following" +
                    " is true?",
            "If 20% of a = b, then b% of 20 is the same as:",

    };


    private String mChoices [][] = {
            {"45%", "45 5/11%", "54 6/11%","55%"},
            {"588apples","600apples","672apples","700apples"},
            {"A is smaller than B","A is greater than B","A and B cannot determined",
            "None of these"},
            {"4% of a","5% of a","20% of a","None of these"},

    };



    private String mCorrectAnswers[] = {"45 5/11%", "700apples","None of these",
    "4% of a",};




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




