import java.util.Scanner; 

public class seasonFinder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      String inputMonth;
      int inputDay;
      
      /* Type your code here. */
      //take input
      inputMonth = scnr.next();
      inputDay = scnr.nextInt();

      //use parallel arrays to check inputs
      String [] months = {"January", "February", "March", "April", "May"
                            , "June", "July", "August", "September"
                            , "October", "November", "December"};
      int [] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

      //if statements to find the season
      boolean foundDateFlag = false;

      for (int i = 0; i < months.length; i ++) {
        if (inputMonth.equals(months[i])) {
            if ((inputDay <= daysInMonth[i]) && (inputDay > 0 )) {
                foundDateFlag = true;
                int calculatedDay = 0;
                for (int j = 0; j < i; j ++) {
                    calculatedDay += daysInMonth[j];
                }
                calculatedDay += inputDay;

                //check for the seasons
                if ((calculatedDay >= 79) && (calculatedDay <= 171)) {
                    System.out.println("Spring");
                } else if ((calculatedDay >= 172) && (calculatedDay <= 264)) {
                    System.out.println("Summer");
                } else if ((calculatedDay >= 265) && (calculatedDay <= 354)) {
                    System.out.println("Autumn");
                } else {
                    System.out.println("Winter");
                }
            }
        }
      }
      if (!foundDateFlag) {
        System.out.println("Invalid");
      }

      //close scanner
      scnr.close();
   }
}