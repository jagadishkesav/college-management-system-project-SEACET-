package com.example.college.Aptitude;

public class VoiceLibrary {
    private String mQuestions [] = {
            "They will inform the police",
            "I cannot accept your offer.",
            "She spoke on official on duty",
            "A child coule not have done this mischief."


    };


    private String mChoices [][] = {
            {"The poice will be inforemed by them.", "The police wil inform them",
                    "The police are informed by them","Informed will be the police by them"},
            {"Your offer cannot be accepted by me.", "I cannot be accepted by your offer", "The" +
                    "offer cannot be accepted by me.","Yout offer cannot be accepted."},
            {"The official on duty was spoken to by her","The official" +
                    " was spoken to by her on duty","She was spoken to by the official" +
                    "on duty","she was the official to be spoken to an duty"},
            {"This mischief could not be done by a child.","This mischief could" +
                    "not veen done by a child","This mischief could not have been" +
                    "done by a child","This mischief a child could not have been done."}

    };



    private String mCorrectAnswers[] = {"The police wil be informbed by them.", "Your offer cannot be accepted by me",
            "The official on duty was spoken to by her","This mischif could not hve been" +
            "done by a child",
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








