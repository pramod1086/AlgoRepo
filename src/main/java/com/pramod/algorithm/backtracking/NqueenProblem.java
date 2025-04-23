package com.pramod.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NqueenProblem {
    final int N = 4;
    public static void main(String args[])
    {
        int board[][] = {
                { 0, 0, 0, 0 },
        { 0, 0, 0, 0 },
        { 0, 0, 0, 0 },
        { 0, 0, 0, 0 }
        };
        NqueenProblem queen = new NqueenProblem();
        queen.solveNQueens(4);
    }

    public static boolean isSafe(int[] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            // Check column and diagonal conflicts
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static void solveNQueens(int n) {
        int[] board = new int[n];  // board[i] means the column number of the queen in the ith row
        List<int[]> solutions = new ArrayList<>();
        solve(board, 0, n, solutions);
        printSolutions(solutions, n);
    }

    private static void solve(int[] board, int row, int n, List<int[]> solutions) {
        if (row == n) {
            // Found a solution, add a copy of the board configuration
            solutions.add(board.clone());
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row] = col;
                solve(board, row + 1, n, solutions);
            }
        }
    }

    public static void printSolutions(List<int[]> solutions, int n) {
        for (int[] solution : solutions) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (solution[i] == j) {
                        System.out.print("Q ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
//    private void placeQueens(int[][] board) {
//        placeQueens(board,0);
//
//    }
//    void printSolution(int board[][])
//    {
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++)
//                System.out.print(" " + board[i][j]
//                        + " ");
//            System.out.println();
//        }
//    }


//    private void placeQueens(int[][] board, int row) {
//        Boolean legal = true;
//       if(row==N){
//           printSolution(board);
//       }else{
//           for(int i=0;i<N;i++){
//
//               legal = true;
//
//           }
//       }
//    }
}
