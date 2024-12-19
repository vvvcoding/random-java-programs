import java.util.*;

public class DataVisualizer2 {
    public static void main(String[] args) {
        // get input
        Scanner scnr = new Scanner(System.in);

        // enter and output the title
        System.out.println("Enter a title for the data:");
        String titleInput = scnr.nextLine();
        System.out.println("You entered: " + titleInput + "\n");

        // get input for the headers of the collumns
        System.out.println("Enter the column 1 header:");
        String colOne = scnr.nextLine();
        System.out.println("You entered: " + colOne + "\n");

        System.out.println("Enter the column 2 header:");
        String colTwo = scnr.nextLine();
        System.out.println("You entered: " + colTwo + "\n");

        //enter data points
        int arrayCount = 50;                             //size of array
        int iterationCount = 0;                          //keeps track of while loop iteration
        String [] stringData = new String[arrayCount];   //declare string array
        int [] intData = new int[arrayCount];            //declare int array
        String stringInput = "";                         //stores final string input
        String checkIfInt = "";                          //stores int waiting to be checked
        int intInput = 0;                                //stores final int input
        boolean isLooping = true;                        //flag for while loop

        //loop to read inputs into array
        do {
            //take input
            System.out.println("Enter a data point (-1 to stop input):");
            stringInput = scnr.nextLine();

            //makes sure only 1 error can be printed at a time
            int errorCount = 0;

            //exit loop
            if (stringInput.equals("-1")) {
                isLooping = false;
                errorCount ++;
            }
            
            //count how many commas are in the input
            int commaCount = 0;
            for (int i = 0; i < stringInput.length(); i ++) {
                char tempChar = stringInput.charAt(i);
                if (tempChar == ',') {
                    commaCount ++;
                }
            }

            //error 1
            if ((commaCount > 1) && (errorCount == 0)) {
                System.out.println("Error: Too many commas in input.\n");
                errorCount ++;
            }

            //error 2
            if ((commaCount < 1) && (errorCount == 0)) {
                System.out.println("Error: No comma in string.\n");
                errorCount ++;
            }

            //error 3
            String [] tempStringArr = new String[10];
            boolean isInt = true;

            if (errorCount == 0) {
                //split the string into 2, store results in tempStringArr
                tempStringArr = stringInput.split(",");    //split string based on commas and spaces
                stringInput = tempStringArr[0];
                checkIfInt = tempStringArr[1].trim();
                
                //check if everything after the comma is an int
                for (int i = 0; i < checkIfInt.length(); i ++) {
                    char tempChar = checkIfInt.charAt(i);
                    if (!Character.isDigit(tempChar)) {     //if not an int, print error
                        System.out.println("Error: Comma not followed by an integer.\n");
                        isInt = false;
                        i = checkIfInt.length();
                    }
                }   
            }

            //enter data into arrays if it passed every check
            if (isInt && (errorCount == 0)) {
                intInput = Integer.parseInt(tempStringArr[1].trim());
                stringData[iterationCount] = stringInput;
                intData[iterationCount] = intInput;
                iterationCount ++;
                System.out.println("Data string: " + stringInput);
                System.out.println("Data integer: " + intInput + "\n");
            }

        } while (isLooping);
        System.out.println();

        //formatted table
        System.out.printf("%33s\n", titleInput);
        System.out.printf("%-19s | %22s\n", colOne, colTwo);
        for (int i = 0; i < 44; i ++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < iterationCount; i ++) {
            System.out.printf("%-19s | %22s", stringData[i], intData[i]);
            if ((iterationCount - 1) != i) {
                System.out.println();
            }
        }

        System.out.println("\n");

        //formatted histogram
        for (int i = 0; i < iterationCount; i ++) {
            String asterikString = "";
            for (int j = 0; j < intData[i]; j ++) {
                asterikString += "*";
            }
            System.out.printf("%20s", stringData[i]);
            System.out.printf(" " + asterikString + "\n");
        }

        // close scanner
        scnr.close();
    }
}