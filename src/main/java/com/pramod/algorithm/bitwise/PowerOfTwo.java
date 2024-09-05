package com.pramod.algorithm.bitwise;

public class PowerOfTwo {
    static boolean isPowerOfTwo(int x)
    {
        /* First x in the below expression is
          for the case when x is 0 */
        return x != 0 && ((x & (x - 1)) == 0);
    }

    // Driver code
    public static void main(String[] args)
    {
        // Function call
        System.out.println(isPowerOfTwo(10) ? "Yes" : "No");
        System.out.println(isPowerOfTwoUsingMathFunction(64) ? "Yes" : "No");
        System.out.println(isPowerOfTwoUsingDevision(64) ? "Yes" : "No");
        System.out.println(isPowerOfTwoAndAndNot(64) ? "Yes" : "No");
    }

    private static boolean isPowerOfTwoAndAndNot(int n) {
        if (n == 0)
            return false;
        if ((n & (~(n - 1))) == n)
            return true;
        return false;
    }

    private static boolean isPowerOfTwoUsingDevision(int n) {
        if (n == 0)
            return false;

        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    private static boolean isPowerOfTwoUsingMathFunction(int n) {
        if (n == 0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
                == (int)(Math.floor(
                ((Math.log(n) / Math.log(2)))));
    }
}
