package JavaProgram.BasicPrograms;

public class Factors {
    public static void main(String[] args) {

        //find factors of a positive number ->
/*
        int number = 60;
        System.out.println("Factors of "+number+" are: ");
        for (int i = 1; i <= number ; i++) { //loops run from 1 to number(60)
            if(number % i == 0){ //if number is divided by i and remainder is zero(0) then it is a factor of that number
                System.out.print(i+",");
            }
        }
        */

        //find factors of a negative number ->
        int number = -60;
        System.out.println("Factors of "+number+" are: ");

        //here we start the loop from given negative number to positive number with Math.abs() method.
        for (int i = number; i <=Math.abs(number) ; i++) {    // Math.abs() return the absolute value of the number
            if(i == 0){      //here we skip the iteration for i = 0
                continue;
            }else {
                if(number % i == 0){
                    System.out.print(i+", ");
                }
            }
        }
    }

}