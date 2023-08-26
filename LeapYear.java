package JavaProgram.BasicPrograms;

public class LeapYear {
    //Program to check given year is leap year or not ?
    public static void main(String[] args) {
        int year = 2018;
        boolean isLeapYear = false;//initially we set false

        if(year % 4 != 0){   // if any year after dividing 4 not give the remainder 0, it's not a leap year.
          isLeapYear = false;
        }

        else if(year % 400 == 0){  //century year is a leap year, if divisible by 400
            isLeapYear = true;
        }
        else if(year % 100 == 0){// other century years are not leap years
            isLeapYear = false;
        }
        else {                  //remaining years are Leap years
            isLeapYear = true;
        }

//check the condition -
        if(isLeapYear){
            System.out.println(year+" is a Leap Year");
        }else {
            System.out.println(year+" is not a Leap Year");
        }
    }
}// A year is a Leap year if it's exactly divisible by 4 except for century years (ie years ending with 00),
// if it's century year then it must be exactly divisible by 400.
