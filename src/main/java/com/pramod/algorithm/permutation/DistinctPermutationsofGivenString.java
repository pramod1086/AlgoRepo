package com.pramod.algorithm.permutation;

public class DistinctPermutationsofGivenString {  public static void main(String args[]){
    DistinctPermutationsofGivenString ls = new DistinctPermutationsofGivenString();
    String str = "ABC";
    ls.distinctPermutationsofGivenString(str.toCharArray(),0,str.length()-1);

}

    public char [] swap(char charArray[], int i, int j)
    {
        char temp;
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return charArray;
    }
    public boolean shouldSwap(char str[], int start, int curr) {
        for (int i = start; i < curr; i++) {
            if (str[i] == str[curr]) {
                return false;
            }
        }
        return true;
    }
    private void distinctPermutationsofGivenString(char str[],int left,int right) {
        if (left == right)
            System.out.println(str);
        else {
            for (int i = left; i <= right; i++) {
                boolean check = shouldSwap(str, left, i);
                if (check) {
                    str = swap(str, left, i);
                    distinctPermutationsofGivenString(str, left + 1, right);
                    str = swap(str, left, i);
                }
                }

        }
    }

}
