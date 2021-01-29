import com.hasbro.trivial.interfaces.ITopQuestion;
import com.hasbro.trivial.interfaces.impl.FileTopQuestion;
import com.hasbro.trivial.questions.FileQuestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main (String [] args){

        ITopQuestion iTopQuestion = new FileTopQuestion();
        List<String> listResult =  iTopQuestion.getQuestion(1);
    listResult.forEach(linea-> System.out.println(linea));





    }

}
