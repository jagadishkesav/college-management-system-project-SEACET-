package com.example.college.Aptitude;

public class OldLibrary {
    private String mQuestions [] = {

            "Which word does NOT belong with the others",
            "Choose the number which is different from others" +
                    "in the group",
            "Find the Odd man out:",
            "Which word does NOT Belong with the others?",
            "Which word does NOT Belong with the others?",




    };


    private String mChoices [][] = {
            {"Book","Index","Glossary","Chapter"},
            {"64","125","27","144"},
            {"Tree","Plant","Grass","Stone"},
            {"eel","lobster","crab","shrimp"},
            {"couch","rug","table","chair"},
    };

    private String mCorrectAnswers[] = {"Book","144","Stone",
            "eel","rug",};


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






