package com.hasbro.trivial.interfaces.impl;

import com.hasbro.trivial.interfaces.ITopQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MapTopQuestion implements ITopQuestion {

    Map<Integer, List<String>> questionsMap = Map.of(
            1, Arrays.asList("who is the team of mlb with more title world series?",
                    "1-. New York Yankees",
                    "2-. Boston Red Sox",
                    "3-. Los Angeles Dodgers"),
            2, Arrays.asList("who is the player with the most hits in mlb?",
                    "1-. Miguel cabrera",
                    "2-. Derek Jeter",
                    "3-. Pete Rose"),
            3, Arrays.asList("who is the the player with the most home runs in mlb",
                    "1-. Albert Pujols",
                    "2-. Barry Bonds",
                    "3- Alex Rodriguez"),
            4, Arrays.asList("who is the  player with most point for life in the nba ",
                    "1-. Kareem Abdul-Jabbar",
                    "2-. Lebron James",
                    "3-. Michael Jordan "),
            5, Arrays.asList("team of europe with more champions league",
                    "1-. F.C Barcelona",
                    "2-. Real Madrid C.F",
                    "liverpool F.C")
    );


    @Override
    public List<String> getQuestion(int questionNumber) {

        return questionsMap.get(questionNumber);
    }
}
