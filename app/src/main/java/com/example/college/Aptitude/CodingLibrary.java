package com.example.college.Aptitude;

public class CodingLibrary {
    private String mQuestions [] = {

            "ZYXW’ as coded as ‘ABCD’ then ‘STUV’ is coded as...........",

            "‘ bcd’ is coded as ‘def’ then ‘True’ is coded as.........",

            " ‘ Hyderabad ’ is coded as ‘Ixedszcze’ then ‘Chennai’ is coded as..............",
                    "", "Answer: H – I (+1)\n",
            "Apple is coded as 25563, Rung is coded as 7148. Then purple is coded as ",

            "PUSH is coded as 1234, ROUGH is coded as 65274. Then SOUP is coded as",





    };


    private String mChoices [][] = {
            {"HFER", "HGFE", "HGEE","HWFE"},
            {"VTWG","VTGH","VWTG","VGTW"},
            {"H – I (+3)","H – I (+1)","H – I (-1)","H – I (+7)"},
            {"517563","517564","517566","517568"},
            {"3521","3524","3526","3527"},
    };

    private String mCorrectAnswers[] = {"HGFE","VTWG","H – I (+1)",
            "517563","3521",};


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






