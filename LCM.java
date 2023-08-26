package JavaProgram.BasicPrograms;

public class LCM {
    public static void main(String[] args) {
       /*
        int number1 = 72, number2 = 120;
        int lcm = Math.max(number1,number2);// greatest number stored in lcm variable or(number1 > number2) ? number1 : number2;
                                           // bcz LCM cannot be less than the largest number

        while(true) {
            if (lcm % number1 == 0 && lcm % number2 == 0) {   //it returns true to while loop, when it finds lcm
                System.out.printf("LCM of %d and %d is =  %d", number1, number2, lcm);
                break;
            }
            ++lcm;
        }

        */

        // Find LCM using GCD or HCF
        
        int n1 = 72, n2 = 120;
        int gcd = 1;//initially we set gcd is 1

        //find GCD
        for (int i = 1; i <= n1 && i <= n2; i++) {
            //check if, i perfectly divides both number
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        int lcm = (n1 * n2)/gcd;

        System.out.println("LCM of two given number is - "+lcm);
    }
}
