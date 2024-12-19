import java.util.*;

public class convertBinary {
   /* Define your methods here */ 
    public static String intToReverseBinary(int integerValue) {
        String reverseBinary = "";
        while (integerValue != 0) {
            reverseBinary += Integer.toString(integerValue % 2);
            integerValue = integerValue / 2;
        }
        return reverseBinary;
    }

    public static String stringReverse(String inputString) {
        String reverseString = "";
        for (int i = 0; i < inputString.length(); i ++) {
            reverseString += inputString.charAt(inputString.length() - (i + 1));
        }
        return reverseString;
    }
   
   public static void main(String[] args) {
      /* Type your code here. 
         Your code must call intToReverseBinary() to get
         the binary string of an integer in a reverse order.
         Then call stringReverse() to reverse the string 
         returned from intToReverseBinary().*/
         
        //get user input
        Scanner scnr = new Scanner(System.in);
        int userInput = scnr.nextInt();

        //call methods
        String binaryInput = intToReverseBinary(userInput);
        String binaryReversed = stringReverse(binaryInput);

        //print reversed binary
        System.out.println(binaryReversed);

        //close scanner
        scnr.close();
   }
}