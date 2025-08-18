package com.pramod.geekforGeeks;

public class StockBuyandSelMax2Transactions {
    public static void main(String[] args)
    {
        int[] prices = { 10, 22, 5, 75, 65, 80 };
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {

        int minPrice = prices[0];

        int len = prices.length;
        int max = 0;

        for(int i=1;i<len;i++){
            int price = prices[i];

            if(price>minPrice){

                int secondminprice = price;

                int maxSecondDiff = 0;

                for(int j=i+1;j<len;j++){
                    int secondPrice = prices[j];
                    secondminprice=  Math.min(secondminprice,secondPrice);
                    maxSecondDiff = Math.max(maxSecondDiff,secondPrice-secondminprice);
                }
                int priceDiff = price-minPrice+maxSecondDiff;

                max = Math.max(priceDiff,max);



            }else {
                minPrice = price;
            }
        }
        return max;

    }

}
