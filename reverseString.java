import java.util.Scanner;

public class reverseString {
   public static void main(String[] args) {
         /* Type your code here. */
         Scanner scnr = new Scanner(System.in);
        while (true) {
            //take input
            String inputPhrase = scnr.nextLine();

            //break if user inputs "done" (3 different ways to do it)
            if (inputPhrase.equals("Done") || 
                inputPhrase.equals("done") || 
                inputPhrase.equals("d")) {
                break;
            }

            //otherwise, process phrase
            for (int i = 0; i < inputPhrase.length(); i ++) {
                System.out.print(inputPhrase.charAt(inputPhrase.length() - (i + 1)));
            }
            System.out.println();
        }
        scnr.close();
   }
}
