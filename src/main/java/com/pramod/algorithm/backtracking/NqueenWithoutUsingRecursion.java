package com.pramod.algorithm.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NqueenWithoutUsingRecursion {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        System.out.println(solutions.size());
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        boolean[] colUsed = new boolean[n];
        boolean[] diag1Used = new boolean[2 * n - 1];
        boolean[] diag2Used = new boolean[2 * n - 1];

        backtrack(board, 0, colUsed, diag1Used, diag2Used, result);

        return result;
    }

    private static void backtrack(char[][] board, int row, boolean[] colUsed, boolean[] diag1Used, boolean[] diag2Used, List<List<String>> result) {
        if (row == board.length) {
            result.add(constructSolution(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (!colUsed[col] && !diag1Used[row + col] && !diag2Used[row - col + board.length - 1]) {
                board[row][col] = 'Q';
                colUsed[col] = true;
                diag1Used[row + col] = true;
                diag2Used[row - col + board.length - 1] = true;

                backtrack(board, row + 1, colUsed, diag1Used, diag2Used, result);

                board[row][col] = '.';
                colUsed[col] = false;
                diag1Used[row + col] = false;
                diag2Used[row - col + board.length - 1] = false;
            }
        }
    }
    private static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }
}
