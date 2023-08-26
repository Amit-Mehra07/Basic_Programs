package JavaProgram.BasicPrograms;

public class DigitCounting {
    public static void main(String[] args) {
        int number = 45678;
        int count = 0;

        System.out.println("Number is -> "+number);
        for (; number >0; number/=10) {// no initialization, and number!=0 is similar to number>0, in the end upadte the number
            count++;//increment counter after every loop by 1
        }

        //one liner for loop
//        for(; number!= 0; number/=10, count++){}//for loop without body
        System.out.println(count+" digits in given number");
    }
}
