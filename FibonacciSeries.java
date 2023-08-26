package JavaProgram.BasicPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {

        //Display fibonacci series up to n digits.

/*
        int firstTerm = 0;
        int secondTerm = 1;
        int n = 10;// fibonacci series up to  n digits
        for (int i = 1; i <=n ; ++i) {
            System.out.println(firstTerm);
            int nextTerm = firstTerm + secondTerm;//
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
        */

//Display fibonacci series up to a given number -
        int n = 100;
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci series from 0 to "+n);
        while(firstTerm<=n){// initially firstTerm is 0 and goes to less than equal to n
            System.out.print(firstTerm+", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;//here the firstTerm updated everytime up to less than n
            secondTerm = nextTerm;
        }

    }
}
