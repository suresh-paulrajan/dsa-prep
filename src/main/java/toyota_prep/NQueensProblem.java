package main.java.toyota_prep;

import java.util.ArrayList;
import java.util.List;

public class NQueensProblem {

    // Solution by ChatGPT
    // Function to solve the N Queens problem
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        int[] queensPos = new int[n]; // An array to store the column position of each queen
        placeQueens(queensPos, 0, n, solutions);
        return solutions;
    }

    // Recursive function to place queens on the chessboard
    private static void placeQueens(int[] queensPos, int row, int n, List<List<String>> solutions) {
        if (row == n) {
            // All queens are placed successfully, add the solution to the list
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (queensPos[i] == j) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                solution.add(sb.toString());
            }
            solutions.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValidPosition(queensPos, row, col)) {
                // Place the queen at (row, col) if it's a valid position
                queensPos[row] = col;

                // Recursively place queens in the next row
                placeQueens(queensPos, row + 1, n, solutions);
            }
        }
    }

    // Function to check if it is safe to place a queen at (row, col)
    private static boolean isValidPosition(int[] queensPos, int row, int col) {
        for (int i = 0; i < row; i++) {
            // Check if there is already a queen in the same column or diagonals
            System.out.println("arr val :: "+queensPos[i]+" :: col :: "+col+" :: Abs left :: "
                    +(queensPos[i]-col)+" :: Abs right :: "+(i-row));
            if (queensPos[i] == col || Math.abs(queensPos[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4; // Change 'n' to the desired size of the chessboard
        List<List<String>> solutions = solveNQueens(n);
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
