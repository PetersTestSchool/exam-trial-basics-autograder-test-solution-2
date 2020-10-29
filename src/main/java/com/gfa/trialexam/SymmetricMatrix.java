package com.gfa.trialexam;

import java.util.List;

public class SymmetricMatrix {
    public static void main(String[] args) {

    }

    public static Boolean isSymmetric(int[][] matrix) {
        // TODO get rid of duplicate checks
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix.length; x++) {
                if (matrix[x][y] != matrix[y][x]) {
                    return false;
                }
            }
        }
        return true;
    }
}