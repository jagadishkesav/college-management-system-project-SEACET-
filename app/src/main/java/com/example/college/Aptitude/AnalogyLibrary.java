package com.example.college.Aptitude;

public class AnalogyLibrary {

    private String mQuestions [] = {

            "Moon:Satellite::Earth:?",
            "Forecast:Future::Regret:?",
            "Influenza:Virus::Typhoid:?",
            "Fear:Threat::Anger:?",
            "Car:Garage::Aeroplane:?",
            "Race:Fatigue::Fast:?",
            "Candle:Wax::Paper:?",
            "Calf:Kid::Pup:?",
    };


    private String mChoices [][] = {
            {"Sun", "planet", "Solar System","Asteroid"},
            {"Present","Atone","Past","Sins"},
            {"Bacillus","Parasite","protozoe","Bacteria"},
            {"Complusion","panic","Provocation","Force"},
            {"Port","Depot","Hanger","Harbour"},
            {"Food","Appetite","Hunger","Weakness"},
            {"Wood","Tree","Bamboo","Pulp"},
            {"Infant","Young","Larva","Animal",}
    };

    private String mCorrectAnswers[] = {"Planet","Past","Bacteria",
            "Provocation","Hanger","Hunger","Pulp","Larva",};


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






