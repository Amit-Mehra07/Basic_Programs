package JavaProgram.BasicPrograms;
//A positive integer number is called an Armstrong number of order n if --> a.b.c.d = a^n + b^n + c^n + d^n
//like 153, 371..
public class CheckArmstrong {
    //                  This commented code for Checking 3-digits Armstrong number
    /* public static void main(String[] args) {
        int originalNumber = 153;
        int number = originalNumber;
        while(number!=0){
            int remainder = number % 10;
            result += (int)Math.pow(remainder,3);//pow() use double return type, that's why we need to typecast into int(Not mandatory)
            number/=10;
        }

        if(originalNumber == result){
            System.out.println("Given number is an \"Armstrong number\"");
        }else {
            System.out.println("Given number is \"not\" an \"Armstrong number\"");
        }
    } */
//____________________________________________________________________________________________________________//
    // This commented code will check an Armstrong "number of n-digits".

    /* public static void main(String[] args) {

        //Note: Here we need to count digit of given number.
        int originalNumber = 16345;
        int result = 0;
        int counter = 0;

        int number = originalNumber;

        //this will find how many digits in our originalNumber
        while(number!=0){
            counter++;//counting digit of number
            number/=10;
        }

        number = originalNumber;//again assign because above "number" variable has zero(0) value

        //in this while loop we will apply formula to get power of each individual number with total number of digits
        while(number!= 0){
            int remainder = number %10;
            result += Math.pow(remainder,counter);//here we don't type cast this Math.pow() function
            number/=10;
        }

        //check given number is Armstrong or not

        if(originalNumber == result){
            System.out.println(originalNumber+" is an \"Armstrong number\"");
        }else {
            System.out.println(originalNumber+" is not an \"Armstrong number\"");
        }

    } */

//____________________________________________________________________________________________________________//

    // This code is used to get Armstrong numbers between two Intervals, we made using a function with return boolean value

    public static void main(String[] args) {
        int lower = 999;
        int higher = 99999;
        System.out.println("Armstrong numbers between "+lower+" and "+higher);
        for (int number = lower+1; number < higher ; number++) {// each time number is updated by lower + 1, and this value pass in the function
            if(checkArmstrong(number))//Note: we made a function with bool return value that's why, when function returns true then only it will print
            System.out.print(number+", ");
        }
    }

    private static boolean checkArmstrong(int num) {
        int counts = 0;
        int result = 0;
        int copyNumber = num;
 //counting digits in number
 while(copyNumber != 0){
     counts++;
     copyNumber/=10;
 }

 copyNumber = num;

 //find armstrong numbers

        while(copyNumber!=0){
            int remainder = copyNumber %10;
            result+= (int) Math.pow(remainder,counts);
            copyNumber/=10;
        }
//checking original number and resultant number are equal or not, if yes then return true otherwise false
        if(result == num) {
            return true;
        }
        return false;
    }


}
