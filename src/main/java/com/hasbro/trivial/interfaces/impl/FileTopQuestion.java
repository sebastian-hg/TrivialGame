package com.hasbro.trivial.interfaces.impl;

import com.hasbro.trivial.interfaces.ITopQuestion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTopQuestion implements ITopQuestion {
    String url="/home/sebastianhernandez/write/Questions.txt";
    @Override
    public List<String> getQuestion(int questionNumber) {
        List<String> listResult = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(url));
            String readBuffered;
            while ((readBuffered = bufferedReader.readLine()) != null) {
                listResult.add(readBuffered);
            }
        } catch (IOException ex) {
            ex.getMessage();
        }


        return null;
    }
}