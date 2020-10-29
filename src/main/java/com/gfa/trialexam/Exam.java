package com.gfa.trialexam;

import java.io.IOException;

public class Exam {
    public static void main(String[] args) {

        // Matrix exercise:
        int[][] matrix = new int[][]{
                {1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}
        };
        System.out.println(SymmetricMatrix.isSymmetric(matrix));

        // Character counter exercise:
        try {
            System.out.println(CharacterCounter.countMostCommonChars("countchar.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
