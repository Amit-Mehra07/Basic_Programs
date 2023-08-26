package JavaProgram.BasicPrograms;

public class HCF {
    //HCF(Highest Common Factor) or GCD (Greatest Common Factor)
    public static void main(String[] args) {
       /*
        int number1 = 12;
        int number2 = 6;
        int gcd = 1; // we initially set gcd is 1

        for (int i = 1; i <= number1 && i<= number2; i++) {
            //check if, i perfectly divides both number1 and number2,
            // also the loop will run until is find the largest number to divide both number

            if(number1 % i ==0 && number2 % i ==0){
                gcd = i;
            }

        } System.out.println("HCF of "+number1+" and "+number2+" is -->> "+gcd);
        */


                   //Euclidean or while loop approach

/*
        int n1 = 70, n2 = 90;
        while(n1!=n2){           //terminate the while loop when n1 is equal to the n2
            if(n1>n2)
            {
                n1 = n1-n2;
            }
            else {
                n2 = n2- n1;
            }
        }
        System.out.println("Gcd of given number is: "+n2);//here we print either n1 or n2 bcz both are equal.

  */

        //program to find GCD or HCF where negative number is also accepted

        int n1= -20,n2 = -36;

        //always set to positive
        n1 = (n1>0)?n1:-n1;      // it means if n1 is not greater than 0, then it is multiply by minus(negative) to make positive itself
        n2 = (n2>0)?n2:-n2;  //it means if n2 is not greater than 0, then it is multiply by minus(negative) to make positive itself

        while(n1 != n2){    //loop will be stopped when both n1 and n2 is equal.
            if(n1>n2){
                n1 = n1-n2;
            }
            else{
                n2 = n2-n1;
            }
        }
        System.out.println("HCF of two given numbers: "+n1);
    }



}
