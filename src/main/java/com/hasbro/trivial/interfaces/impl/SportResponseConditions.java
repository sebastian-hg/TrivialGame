package com.hasbro.trivial.interfaces.impl;

import com.hasbro.trivial.interfaces.ICheckUserAnswer;

import java.util.Map;

public class SportResponseConditions implements ICheckUserAnswer {

    // TODO: 1.Cambiar map a <Integer, Map<Integer, String> y eliminar AnswersImpl
    Map<Integer, Map<Integer, String >> rightAnswer = Map.of(
            1, Map.of(1,"the new york yankees have 27 championship rings being the last in 2009"),
            2, Map.of(3,"pete rose is the player with more hits in the mlb with 4256, retired in the year"),
            3,Map.of( 2,"Barry bonds is the player with more home runs in the mlb with 762 " +
                    ", retired in the year 2017"),
            4, Map.of(1, "404 "),
            5, Map.of(2,"the boston celtics have 17 championship rings being the last in 2008"));
    @Override
    public void checkAnswer(int questionNumber, int answer) {
        Map<Integer,String> responseMap = rightAnswer.get(questionNumber);
        if (responseMap.containsKey(answer)) {
            System.out.println("very good");
            System.out.println(responseMap.values().stream().findFirst().orElse(""));
        } else {
            System.out.println("Incorrect");
        }

    }
}
