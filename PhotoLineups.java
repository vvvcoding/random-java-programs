import java.util.Scanner;
//import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhotoLineups {

   public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
        //size of lists
        int nameListSize = nameList.size();
        int permListSize = permList.size();

        if (nameListSize == permListSize) {
            //base case
            for (int i = 0; i < permListSize; i ++) {
                System.out.print(permList.get(i));
                if (i != permListSize - 1) {
                    System.out.print(", ");
                } else {
                    System.out.println();
                }
            }
            return;
        } else {
            //recursive case
            for (int i = 0; i < nameListSize; i ++) {
                String name = nameList.get(i);
                if (!permList.contains(name)) {
                    permList.add(name);
                    printAllPermutations(permList, nameList);
                    permList.remove(permList.size() - 1);
                }
            }
        }
    }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name = "";

      //store user input in "inputString"
      String inputString = scnr.nextLine();

      //find the -1
      int indexI = 0;
      for (int i = 0; i < inputString.length(); i ++) {
        char c = inputString.charAt(i);
        if (c == ' ') {
            if (inputString.charAt(i + 2) == '1') {
                //-1 was read, exit the loop
                indexI = i;
                i = inputString.length();
            }
        }
      }

      //store the names in the name list
      for (int i = 0; i <= indexI; i ++) {
        char c = inputString.charAt(i);
        if (c != ' ') {
            name += Character.toString(c);
        } else {
            nameList.add(name);
            name = "";
        }
      }

      //call recursive method
      printAllPermutations(permList, nameList);

      //close scanner
      scnr.close();
   }
}