package com.hasbro.trivial.interfaces;

import java.util.Scanner;

public class WelcomeImpl implements Welcome{
    Scanner input = new Scanner(System.in);
    int inputLanguage;
    @Override
    public void welcomeEnglish(

    ) {

    }

    @Override
    public void WelcomeSpanish() {

    }

    @Override
    public void language() {
        System.out.println("1-. Spanish");
        System.out.println("2-. English");
        inputLanguage =input.nextInt();


    }
}
