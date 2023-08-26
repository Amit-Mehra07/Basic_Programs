package JavaProgram.BasicPrograms;

public class PalindromeString {
    public static void main(String[] args) {
        //as we know String in java has "index number" so using for loop we can easily print reversed of the string
        String string = "Level";
        String reversedString = "";
        System.out.println(" Original string -> "+string);

        //We traverse the elements "from ending of the String till first element" of the String
        for (int i = string.length()-1; i >= 0; i--) {
            reversedString = reversedString + string.charAt(i);//here charAt() method used to "access each character" of string using for loop
        }

        //check original or reversed string using equals() method, toLowerCase() method converts both of the strings in lowercase.
        if(string.toLowerCase().equals(reversedString.toLowerCase())){//you can also convert in uppercase for both the string and reversedString
            System.out.println("Given string is \"Palindrome\"");
        }else {
            System.out.println("Given string is \"Not palindrome\"");
        }
//Note: Java is 'Case Sensitive' language.
    }

}
