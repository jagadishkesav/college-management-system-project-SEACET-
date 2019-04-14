package com.example.college.Aptitude;

public class CalenderLibrary {
    private String mQuestions [] = {
            "What was the day of the week on 28th May, 2006?",

            "What will be the day of the week 15th August, 2010?",

            "Today is Monday. After 61 days, it will be:",

            "On what dates of April, 2001 did Wednesday fall?",

            "How many days are there in x weeks x days?",

            "The last day of a century cannot be",

            "On 8th Feb, 2005 it was Tuesday. What was the day of " +
                    "the week on 8th Feb, 2004?",

            "The calendar for the year 2007 will be the same for the" +
                    " year:",
            "Which of the following is not a leap year?",

            "January 1, 2007 was Monday. What day of the week lies " +
                    "on Jan. 1, 2008?",

           

};


    private String mChoices [][] = {
            {"Thursday", "Friday", "Saturday","Sunday"},
            {"Sunday", "Monday", "Tuesday","Friday"},
            {"Wednesday", "Saturday", "Tuesday","Thursday"},
            {"1st, 8th, 15th, 22nd, 29th", "2nd, 9th, 16th, 23rd, 30th",
                    "3rd, 10th, 17th, 24th","4th, 11th, 18th, 25th"},
            {"7x2", "8x", "14x","7"},
            {"Monday","Wednesday","Tuesday","Friday"},
            {"Tuseday","Monday","Sunday","Wednesday"},
            {"2014","2016","2017","2018"},
            {"700","800","1200","2000"},
            {"Monday","Wednesday","Tuesday","Sunday"},

    };



    private String mCorrectAnswers[] = {"Sunday", "Sunday", "Saturday",
            "4th, 11th, 18th, 25th","8x","Tuesday","sunday","2018","700"
    ,"Tuesday",};




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


