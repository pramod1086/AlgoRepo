package com.pramod.competetiveprogramming;

public class Solution {
    public static void main(String args[]){

        Solution s = new Solution();
       System.out.println(s.reverse(1534236469)); ;

    }
    public long reverse(int x) {
        long result = 0;
        long reminder =0;
        while(x>0){
            reminder =  (x%10);
            x=x/10;

            result =  (result*10+reminder);

        }

        if(x<0){
            while(x<0){
                reminder = (x%10);
                x=x/10;
                result =  (result*10+reminder);
            }

        }
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
            return 0;
        }

        return result;

    }
}
