package com.hasbro.trivial.questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileQuestion {
    String  url ="/home/sebastianhernandez/write/nbateam.txt";
    BufferedReader bufferedReader= new BufferedReader(new FileReader(url));

    public FileQuestion() throws FileNotFoundException {
    }


    public int teamNba(Scanner inputUser) {
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader("/home/sebastianhernandez/write/nbateam.txt"));
            String lecturaBuffered;
            while ((lecturaBuffered = bufferedReader.readLine()) != null) {
                System.out.println(lecturaBuffered);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        return inputUser.nextInt();
    }
}
