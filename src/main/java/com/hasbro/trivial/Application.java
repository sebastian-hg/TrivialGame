package com.hasbro.trivial;

import com.hasbro.trivial.interfaces.IQuestions;
import com.hasbro.trivial.interfaces.ICheckUserAnswer;
import com.hasbro.trivial.interfaces.ITopQuestion;
import com.hasbro.trivial.interfaces.impl.MapQuestion;
import com.hasbro.trivial.interfaces.impl.MapTopQuestion;
import com.hasbro.trivial.interfaces.impl.SportResponseConditions;
import com.hasbro.trivial.questions.ScannerQuestion;

public class Application {
    public static void main(String[] args) {

        ITopQuestion iTopQuestion= new MapTopQuestion();

        IQuestions questions = new MapQuestion(iTopQuestion);

        ICheckUserAnswer responseConditions = new SportResponseConditions();
        ScannerQuestion sportsQuestion1 = new ScannerQuestion(questions, responseConditions);
        ScannerQuestion sportQuestion2 = new ScannerQuestion(questions,responseConditions);
        ScannerQuestion sportQuestion3= new ScannerQuestion(questions,responseConditions);



        // sportsQuestions.questionsSport1();
        sportsQuestion1.askQuestion(1);

        sportQuestion2.askQuestion(2);

        sportQuestion3.askQuestion(3);




    }

}
