package com.example.college.Aptitude;

public class BoatsLibrary {

    private String mQuestions [] = {

            " A boat can travel with a speed of 13 km/hr in still water. " +
                    "If the speed of the stream is 4 km/hr,\n" +
                    " find the time taken by the boat to go 68 km downstream.",

            "A man's speed with the current is 15 km/hr and the speed of the current is 2.5 km/hr. \n" +
                    "The man's speed against the current is:",


            "In one hour, a boat goes 11 km/hr along the stream and 5 km/hr against the stream. The speed \n" +
                    "of the boat in still water (in km/hr) is:",

            "The speed of a boat in still water in 15 km/hr and the rate of current is 3 km/hr. \n" +
                    "The distance travelled downstream in 12 minutes is:\n" +
                    "\n" +
                    "A.\t1.2 km\n" +
                    "B.\t1.8 km\n" +
                    "C.\t2.4 km\n" +
                    "D.\t3.6 km\n" +
                    "Answer: Option D"


    };


    private String mChoices [][] = {
            {"2hours", "3hours", "4hours","5hours"},
            {"8.5 km/hr","9 km/hr","10 km/hr","12.5 km/hr"},
            {"3 km/hr","5 km/hr","8 km/hr","9 km/hr"},
            {"1.2 km","1.8 km","2.4 km","3.6 km"},



    };



    private String mCorrectAnswers[] = {"4hours", "10 km/hr", "8 km/hr","3.6 km",};




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



