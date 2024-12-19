import java.util.*;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      long phoneNumber;
      long firstGroup, secondGroup, thirdGroup;
      // Add more variables as needed

      phoneNumber = scnr.nextLong();
      scnr.close();
      
      /* Type your code here. */
      //find each group of numbers
      firstGroup = phoneNumber / 10000000;
      thirdGroup = phoneNumber % 10000;
      secondGroup = (phoneNumber % 10000000) / 10000;
      
      //print number
      System.out.println("(" + firstGroup + ") " + secondGroup + "-" + thirdGroup);
   }
}