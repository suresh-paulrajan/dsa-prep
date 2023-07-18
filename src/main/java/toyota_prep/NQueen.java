package main.java.toyota_prep;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    // LeetCode Hard
    //    The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that
    //    no two queens attack each other.
    public static void main(String[] args) {
        int input = 4;
        System.out.println(solveNQueens(input));
    }

    private static List<List<String>> solveNQueens (int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queenColIndex = new int[n];
        placeQueens(queenColIndex, 0, n, result);
        return result;
    }

    private static void placeQueens(int[] queenColIndex, int row, int n, List<List<String>> result) {
        if (row == n) {
            List<String> resultRow = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder rowString = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if(queenColIndex[i] == j)
                        rowString.append("Q");
                    else
                        rowString.append(".");
                }
                resultRow.add(rowString.toString());
            }
            result.add(resultRow);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("isValid check :: row :: "+row+" :: col :: "+i);
                if (isValidPosition(queenColIndex, row, i)) {
                    queenColIndex[row] = i;
                    System.out.println("PLACED @ "+row+" :: "+i);
                    placeQueens(queenColIndex, row+1, n, result);
                }
            }
        }
    }

    private static boolean isValidPosition (int[] queenColIndex, int row, int column) {
        for (int i = 0; i < row; i++) {
            if (queenColIndex[i] == column || Math.abs(queenColIndex[i] - column) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}
