package JavaProgram.BasicPrograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        int original_Number = 23432;
        int reversed_Number = 0; //this variable is used to update value every time when loop will run

        int real_Number = original_Number;  //because of after the while loop our original_Number will become zero(0).
        while(original_Number!=0){
            //this variable store remainder of original_Number.

            int remainder = original_Number % 10;
            reversed_Number = reversed_Number * 10 + remainder;
            original_Number/=10;//remove the last digit in every step
        }

        /* here our original_Number(variable) is zero.
        System.out.println(original_Number); */

//check if real_Number and reversed_Number are equal or not.
        if(real_Number == reversed_Number){
            System.out.println("Given number is Palindrome");
        }  else {
            System.out.println("Given number is not Palindrome");
        }
    }
}
