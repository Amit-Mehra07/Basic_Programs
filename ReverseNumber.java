package JavaProgram.BasicPrograms;

public class ReverseNumber {
    public static void main(String[] args) {

        //We can achieve reverse number using Loop(While or for loop)
        int original_Number = 1234;
        int reversed_Number = 0;//this variable is used to update value every time when loop will run
        System.out.println("Original number: "+original_Number);
        while (original_Number != 0) {
            //variable store remainder of number
            int remainder = original_Number %10;
            reversed_Number = reversed_Number*10 + remainder;
            //remove the last digit in every step
            original_Number = original_Number/10;//or original_Number /= 10
        }
        System.out.println("Reversed number: "+reversed_Number);
    }
//using for loop - 1: no initialization expression is used. 2: test expression remain same. 3: update original number
}