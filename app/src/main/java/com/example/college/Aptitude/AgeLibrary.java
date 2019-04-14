package com.example.college.Aptitude;

public class AgeLibrary {
    private String mQuestions [] = {
            "Father is aged three times more than his son Ronit. After 8 years, he " +
                    "would be two and a half times of Ronit's age. After further " +
                    "8 years, how many times would he be of Ronit's age?",

            "The sum of ages of 5 children born at the intervals of 3 years each " +
                    "is 50 years. What is the age of the youngest child?",

            "Six years ago, the ratio of the ages of Kunal and Sagar was 6 : 5. " +
                    "Four years hence, the ratio of their ages will be 11 : 10. " +
                    "What is Sagar's age at present?",

            "At present, the ratio between the ages of Arun and Deepak is 4 : 3. " +
                    "After 6 years, Arun's age will be 26 years. What is the age of" +
                    " Deepak at present ?",

            "Q is as much younger than R as he is older than T. If the sum of the ages" +
                    " of R and T is 50 years, what is definitely the difference between" +
                    " R and Q's age?",

            "Four years ago a man was 6 times as old as his son. After 16 " +
                    "years he will be twice as old as his son. What is the " +
                    "present age of man and his son?",

            "Ten years ago, Ajay wasApti Problem on ages 18rd as old as Vijay." +
                    " If Ajay is 18 years old now, how old is Vijay now?",

            "Simran is younger than Simarjeet by 7 years, and the ratio of" +
                    " their ages is 7:9. What is the age of Simran?",

            "At present, the ratio between the ages of Haseena and Anushka is 4:3. " +
                    "After 6 years, Haseena's age will be 26years. What is the" +
                    " present age of Anushka?",

            "The ages of Ram and Shyam differ by 16 years. 6 years ago, " +
                    "the Ram was 3 times as old as Shyam. " +
                    "What is the present age of Ram?",


};


    private String mChoices [][] = {
            {"2times", "2 1/2times", "2 3/4times","3times"},
            {"4years", "8years", "10years","None of these"},
            {"16years", "18years", "20years","None of these"},
            {"12years", "15years", "19 and half years","21years"},
            {"1years", "2years", "25 years","Data inadequate"},
            {"34,9","33,7","35,5","36,6"},
            {"32years","34years","36years","38years"},
            {"24years","23.5years","24.5years","25years"},
            {"15years","14years","13years","12years"},
            {"10years","20years","30years","40years"},
    };



    private String mCorrectAnswers[] = {"2times", "4years", "16years","15years",
    "Data inadequate","34,9","32years","24.5years","15years","40years"};




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
