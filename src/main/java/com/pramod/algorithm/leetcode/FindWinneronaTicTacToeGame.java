package com.pramod.algorithm.leetcode;

public class FindWinneronaTicTacToeGame {
    public static void main(String[] args) {
        int[][] moves = {{0, 1}, {2, 0}, {1, 1}, {2,1},{2,2}};
        FindWinneronaTicTacToeGame ps = new FindWinneronaTicTacToeGame();
        ps.tictactoe(moves);

    }
    public String tictactoe(int[][] moves) {
        int n = moves.length;
        int[] cnt = new int[8];
        for (int k = n - 1; k >= 0; k -= 2) {
            int i = moves[k][0], j = moves[k][1];
            cnt[i]++;
            cnt[j+3]++;

            if(i==j){
                cnt[6]++;
            }

            if(i+j==2){
                cnt[7]++;
            }
            if (cnt[i] == 3 || cnt[j + 3] == 3 || cnt[6] == 3 || cnt[7] == 3){
                return k % 2 == 0 ? "A" : "B";
            }
            System.out.println(i);
            System.out.println(j);
        }
        return n == 9 ? "Draw" : "Pending";
    }


}
