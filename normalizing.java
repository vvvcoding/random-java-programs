import java.util.Scanner; 

public class normalizing {
   public static void main(String[] args) {
      /* Type your code here. */
      //get input for number of values
      Scanner scnr = new Scanner(System.in);
      String numInputs = scnr.nextLine();
      while ((Integer.parseInt(numInputs) >= 20) || (Integer.parseInt(numInputs) <= 0)) {
        System.out.println("Re-enter num: ");
        numInputs = scnr.nextLine();
      }

      //get input for floats
      String userInput = scnr.nextLine();
      String [] test = userInput.split("\\s");      //breaks up the string after each space "\\s"
      while (test.length != Integer.parseInt(numInputs)) {
        System.out.println("Re-enter floats: ");
        userInput = scnr.nextLine();
        test = userInput.split("\\s");
      }

      //find the largest float
      float currentLargest = 0;
      for (int i = 0; i < test.length; i ++) {
            if (Float.parseFloat(test[i]) > currentLargest) {
                currentLargest = Float.parseFloat(test[i]);
            }
      }
      
      //normalizing

      for (int i = 0; i < test.length; i ++) {
        float currentPrint = Float.parseFloat(test[i]) / currentLargest;
        System.out.printf("%.2f", currentPrint);
        System.out.print(" ");
      }
      System.out.println();

      //close scanner
      scnr.close();
   }
}