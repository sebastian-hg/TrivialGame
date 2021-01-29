package com.hasbro.trivial.questions;

import com.hasbro.trivial.interfaces.IQuestions;
import com.hasbro.trivial.interfaces.ICheckUserAnswer;

import java.util.Scanner;

public class ScannerQuestion {

    Scanner scanner = new Scanner(System.in);
    IQuestions questions;
    ICheckUserAnswer responseConditions;

    public ScannerQuestion(IQuestions questions, ICheckUserAnswer responseConditions) {
        this.questions = questions;
        this.responseConditions = responseConditions;
    }

    public void askQuestion(int questionNumber) {
        int user = questions.showQuestionAndGetAnswer(scanner, questionNumber);
        responseConditions.checkAnswer(questionNumber,user);
        System.out.println("______________________________________________________________________________");

    }




}