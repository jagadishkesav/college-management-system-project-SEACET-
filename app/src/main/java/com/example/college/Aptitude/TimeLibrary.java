package com.example.college.Aptitude;

public class TimeLibrary {
        private String mQuestions[] = {
                "A can do a work in 15 days and B in 20 days. If they " +
                        "work on it together for 4 days, then the " +
                        "fraction of the work that is left is ",
                "A does 80% of a work in 20 days. He then calls in B " +
                        "and they together finish the remaining work in" +
                        " 3 days. How long B alone would take to do " +
                        "the",

        };

        private String mChoices[][] = {
                {"1/4", "1/10", "7/15", "8/15"},
                {"23days","37days","37 1/2days","40days"},

        };


        private String mCorrectAnswers[] = {"8/15", "37 1/2",};


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



