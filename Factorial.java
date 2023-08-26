package JavaProgram.BasicPrograms;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {

        int n = 4;//number which you want to calculate factorial
        int factorial = 1;//initialized here bcz we will update in for loop.

       // BigInteger factorials = BigInteger.ONE;//BigInteger class is used to work with very large integer number

        for (int i = 1; i <=n ; i++) {
            factorial *= i;

                    /*  factorials = factorials.multiply(BigInteger.valueOf(i));
                       multiply()method used to find big number factorial, here *(multiply symbol) doesn't work  */
        }
        System.out.println(factorial+" <-- is a factorial of "+n);
    }
}//For big number, result cannot be stored in a long type variable, this is the reason used "BigInteger variable"
// in java.math.library .
