package com.example.college.Aptitude;

public class PermutationLibrary{
        private String mQuestions [] = {
                "In how many different ways can the letters of the word 'LEADING' be arranged in such a way\n" +
                        " that the vowels always come together?",
                "In how many different ways can the letters of the word 'CORPORATION' be arranged so that \n" +
                        "the vowels always come together?",




        };


        private String mChoices [][] = {
                {"360", "480", "720","5040"},
                {"810", "1440", "2880","5760"},

        };



        private String mCorrectAnswers[] = {"720", "5760",


        };





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








