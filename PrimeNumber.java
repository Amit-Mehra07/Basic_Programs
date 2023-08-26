package JavaProgram.BasicPrograms;

import java.util.Scanner;

//A prime number is a number that is divisible by only 1 and number itself.
//Note: Prime numbers are -> 2,3,5,7,11,13,17,19,23.....
//Note: we are looping from 2 to number/2. Because a number cannot be divided by more than it's half.
public class PrimeNumber {
    public static void main(String[] args) {
        //Check prime number using while loop

       /*
        int number = 719;
        int i = 2;//bcz 1 is divisible by all numbers, and start looping from this value
        boolean flag = false;// we set flag initially false, only when it's true then the number is a prime number
        while(i<=number/2){

            //condition for non-prime numbers
            if(number % i == 0 ){
                flag = true;
                break;
            }i++;
        }

        if(flag){  //Note: if(true) take true value or run the body when condition is true
            System.out.println(number+" is \"not a prime number\"");
        }else {
            System.out.println(number+" is a \"prime number\"");
        }
        */


        //Prime numbers between given intervals...

    /*
        int low = 2;
        int high = 2000;
        int counter = 0;// to count how many prime numbers are present in interval
        System.out.println("These are prime numbers between "+low+" and "+high);

        while(low<high){   //bcz we need in between of these two numbers

            boolean flag = false;

            //condition for non-prime number
            for (int i = 2; i <=low/2; i++) {

                if (low % i == 0) {
                    flag = true;
                    break;
                }                             }


                if(!flag && low != 0 && low != 1){
                    counter++;
                    System.out.print(low+", ");
                }
                  low++;// to terminate while condition
                }
        System.out.println("\n"+counter+" Prime numbers in between");// \n is known as new line character
        */

        //Using function find prime numbers between intervals, using Scanner class we are making this program to take input from user
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter intervals above : 2");
        System.out.println("Input number From: ");
        int low = sc.nextInt();
        System.out.println("Input number Up to: ");
        int high = sc.nextInt();

        while(low<high){                 // calling function in if block
            if(checkPrimeNumber(low)){   // when function returns it value and if it is true then only execute if block...
                System.out.print(low+",");
            }
            low++;
        }
            }
            //function to check number prime or not


    private static boolean checkPrimeNumber(int low) {
        boolean flag = true;// initially we set flag  = true, it means when it false then resultant number is not a prime number
        for (int i = 2; i <= low/2; i++) {
            if(low % i == 0){
                flag = false;
                break;
            }
        }

        return flag;
    }

*/

        //to check whether a number can be expressed as Sum of Two prime numbers -

/*
        int number = 23;
        boolean flag = false;

        for (int i = 2; i <= number/2 ; i++) {

            if(checkPrime(i)){ // i will pass in function in increasing order or check prime number, if it's get prime then it enter further if

                if(checkPrime(number-i))// after find prime number it will pass in function (number-i) to find prime number in decreasing order
                {
                    System.out.println(number+ " = "+ i + " + " +(number-i));
                    flag = true; // when it will find two prime numbers that some become = to original number
                }
            }
        }

        if(!flag){               // here if our flag is false it will print this statement
            System.out.println(number+ " <- can't be expressed as the \"sum of two prime numbers\"");
        }
    }
// a function to check whether a number is prime or not and return the value to their respective calling area
    static boolean checkPrime(int num) {
        boolean isPrime = true;// initially it's true for non-prime numbers

        for (int i = 2; i <= num/2 ; i++) {
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    */


    }
}


