package com.example.college.Aptitude;

public class BloodLibrary {
    private String mQuestions [] = {

            "A girl introduced a boy as the son of the" +
                    "daughter of the father of her uncle."+
                    "The boy is girls's",
            "A is B's sister.C is B's mother.D is C's father.E is D's mother" +
                    "Then,how is A related to D",
            "Pointing to a photograph,Balu said,'He is the son of the only"+
                    "daughter of the father of my brother'.How Balu" +
                    "is ralated to the main in the photograph",
            "Amar said,'This girl is the wife of the grandson of my mother'." +
                    "How is Amar related to the girl?",
            "A and B are Young ones of C.If C is the father of A but B is" +
                    "not the son of C.How are B and C related",




    };


    private String mChoices [][] = {
            {"Brother", "Father", "Uncle","Sister"},
            {"Mother","Sister","Grand daughter","Daughter"},
            {"Nephew","Brother","Maternal Uncle","Father"},
            {"Brother","Father-in=law","Husband","Grandfather"},
            {"Niece and Uncle","Daughter and Father","Niece and Uncle","Daughter and MOther"},
    };

    private String mCorrectAnswers[] = {"Brother","Grand daughter","Maternal Uncle",
            "Father-in-law","Daughter and Father",};


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






