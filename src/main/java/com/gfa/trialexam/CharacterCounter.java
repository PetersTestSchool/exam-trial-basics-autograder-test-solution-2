package com.gfa.trialexam;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class CharacterCounter {
    public static Map<Character, Integer> countMostCommonChars(String fileName) throws IOException {
        Map<Character, Integer> charCounts = new HashMap<>();
        File file = new File(fileName);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String line;
            while ((line = reader.readLine()) != null){
                for (char ch : line.toCharArray()) {
                    charCounts.merge(ch, 1, (a, b) -> a + b);
                }
            }
        }
        return charCounts.entrySet().stream().sorted(comparing(Map.Entry::getValue, reverseOrder())).limit(2).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
