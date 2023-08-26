package JavaProgram.BasicPrograms;

public class Power_of_aNumber {
    public static void main(String[] args) {

      /*
        int base = 3;
        int exponent = 4;
        int result = 1;
        int num = exponent;
        while(num != 0){     //num = 4 ,3, 2, 1 and stop while loop.
            result *= base; // 3 * 3 * 3 * 3 = 81
            num--;
        }
        System.out.println(base+" to the power "+exponent+" is-> "+ result);
    }
    //Note: this program will not work with any negative exponent, for this you need to use the pow() in java standard library..
    */


        //calculate the power of a number using pow() function - that will accept also negative number

        int base = 4;
        int exponent = -4;
        double result = Math.pow(base,exponent);// pow() -  has a double return type
        System.out.println("Answer = "+result);

        //this program is also work with negative base ie: base = -4
    }
}
