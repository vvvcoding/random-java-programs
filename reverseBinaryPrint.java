import java.util.Scanner; 

public class reverseBinaryPrint {
   public static void main(String[] args) {
      /* Type your code here. */
      //take input
      Scanner scnr = new Scanner(System.in);
      int input = scnr.nextInt();

      //calculations
      int [] reverseBinary = new int[input];
      int count = 0;
      while (input != 0) {
        reverseBinary[count] = input % 2;
        input = input / 2;
        count ++;
      }

      //printing reverse binary
      for (int i = 0; i < count; i ++) {
        System.out.print(reverseBinary[i]);
      }
      System.out.println();
      scnr.close();
   }
}
