package com.example.college.Aptitude;

public class RankingLibrary {
    private String mQuestions [] = {

            "Raman ranks sixteenth from the top and forty ninth" +
                    "from the bottm in a class.How many students"+
                    "are there in the class",
            "Sanjeev ranks Seventh from the top and twenty eight" +
                    "from the bottom in a class.How many students" +
                    "are there in the class?",
            "Sir ranked ninth from the top and thirty-eighth from" +
                    "the bottom in a class.How many students are there" +
                    "in the class?",




    };


    private String mChoices [][] = {
            {"63", "64", "60","65"},
            {"35","30","34","38"},
            {"40students","42students","46students","47students"},

    };

    private String mCorrectAnswers[] = {"64","34","46studemts"};



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






