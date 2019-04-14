package com.example.college.Aptitude;

public class ProfitLibrary {
        private String mQuestions[] = {
               "Alfred buys an old scooter for Rs. 4700 and spends Rs." +
                       " 800 on its repairs. If he sells the scooter " +
                       "for Rs. 5800, his gain percent is:",


                "The cost price of 20 articles is the same as the selling price of x articles. If the profit \n" +
                        "is 25%, then the value of x is:",


        };

        private String mChoices[][] = {
                {"44/7%", "5 5/11%", "10%", "12%"},
                {"15","16"," 18","25"},

        };


        private String mCorrectAnswers[] = {"5 5/11%", "16",};


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





