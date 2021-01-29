package com.hasbro.trivial.interfaces.impl;

import com.hasbro.trivial.interfaces.IWelcome;

import java.util.Scanner;

public class WelcomeImpl implements IWelcome {
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
