package com.pramod.algorithm.backtracking;

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
        queen.placeQueens(board);
    }

    private void placeQueens(int[][] board) {
        placeQueens(board,0);

    }
    void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }


    private void placeQueens(int[][] board, int row) {
        Boolean legal = true;
       if(row==N){
           printSolution(board);
       }else{
           for(int i=0;i<N;i++){

               legal = true;

           }
       }
    }
}
