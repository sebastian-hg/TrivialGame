package com.hasbro.trivial.interfaces.impl;

import com.hasbro.trivial.interfaces.IQuestions;
import com.hasbro.trivial.interfaces.ITopQuestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapQuestion implements IQuestions {
    // TODO: 2.Mover questionsMap a una clase y pasarla como parametro en el constructor

    // TODO: 4.Crear la clase FileQuestion que recibe el nombre del file como parametro

    ITopQuestion iTopQuestion;
    public MapQuestion(ITopQuestion iTopQuestion){
        this.iTopQuestion=iTopQuestion;
    }


    @Override
    public int showQuestionAndGetAnswer(Scanner scanner, int questionsNumber) {
        List<String> options = iTopQuestion.getQuestion(questionsNumber);
        options.forEach(System.out::println); //linea -> System.out.println(linea)
        return scanner.nextInt();
    }



}
