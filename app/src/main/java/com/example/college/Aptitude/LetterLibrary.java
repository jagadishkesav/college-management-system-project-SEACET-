package com.example.college.Aptitude;

public class LetterLibrary {
    private String mQuestions [] = {
            "SCD, TEF, UGH, ____, WKL",
            "B2CD, _____, BCD4, B5CD, BC6D",
            "ELFA, GLHA, ILJA, _____, MLNA",
            "ZA5, Y4B, XC6, W3D, _____",
            "P5QR, P4QS, P3QT, _____, P1QV",

    };


    private String mChoices [][] = {
            {"CMN", "UJI", "VIJ","IJT"},
            {"B2C2D", "BC3B", "B2C3D","BCD7"},
            {"OLPA","KLMA","LLMA","KLLA"},
            {"E7V","V2E","VE5","VE7"},
            {"PQW","PQV2","P2QU","PQ3U"},
    };



    private String mCorrectAnswers[] = {"VIJ", "BC3B", "KLLA","VE7",
        "P2QU",};





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




