package com.pramod.geekforGeeks;


public class StockBuyAndSell {

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfitoneTransactionAllowed(prices));
    }

    private static int maxProfitoneTransactionAllowed(int[] prices) {

        int min = prices[0];

        int result = -1;
        for(int i:prices){
            min = Math.min(min,i);


            result = Math.max(result,i-min);

        }
        return result;
    }
}
