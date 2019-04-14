package com.example.college.Aptitude;

public class TrainsLibrary {
         private String mQuestions [] = {
        "A train moving at speed of 90 km/hr crosses a pole in 7 seconds. Find the length" +
                " of the train.",


        "A train of length 100 meters is moving at a speed of 70 km/hr. In what " +
                "time it will cross a man who is walking at 10 km/hr in the same " +
                "direction?",

        "A train of length 200 meters takes 12 seconds to cross a man who is running at " +
                "a speed of 10 km/hr in opposite direction of the train. What is the " +
                "speed of the train?",


        "A train of length 240 meters crosses a pole in 12 seconds. In what time it will" +
                " cross a platform of length 400 meters?",


        "A train crosses two men who are running in the direction of train at 4 km/hr " +
                "and 8 km/hr in 18 and 20 seconds respectively. Find the length of " +
                "train.",


        "The length of the bridge, which a train 130 metres long and travelling at 45 " +
                "km/hr can cross in 30 seconds, is:",


        "Two trains running in opposite directions cross a man standing on the platform " +
                "in 27 seconds and 17 seconds respectively and they cross each " +
                "other in 23 seconds. The ratio of their speeds is:",


        "A train 800 metres long is running at a speed of 78 km/hr. If it crosses a " +
                "tunnel in 1 minute, then the length of the tunnel (in meters) is:",



        "Two trains are running at 40 km/hr and 20 km/hr respectively in the same " +
                "direction. Fast train completely passes a man sitting in the slower " +
                "train in 5 seconds. What is the length of the fast " +
                "train?",


        "Two,trains, one from Howrah to Patna and the other from Patna to Howrah, " +
                "start simultaneously. After they meet, the trains reach their " +
                "destinations after 9 hours and 16 hours respectively. The ratio of " +
                "their speeds is:",



};


        private String mChoices [][] = {
                {"150", "165", "175","170"},
                {"5seconds", "6seconds", "7seconds","8seconds"},
                {"50 km/hr", "55 km/hr", "60 km/hr","65 km/hr"},
                {"33 seconds", "35 seconds", "37 seconds","39 seconds"},
                {"180", "175", "190","200"},
                {"200m","225m","245m","250m"},
                {"1:3","3:2","3:4","None of these"},
                {"130","360","500","540"},
                {"23m","23 2/9m","27 7/9m","29m"},
                {"2:3","4:3","6:7","9:16"},
        };



        private String mCorrectAnswers[] = {"175", "6seconds", "50 km/hr","33 seconds",
                "200","245m","3:2","500","27 7/9m","4:3"};




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


