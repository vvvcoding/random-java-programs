import java.util.Scanner; 

public class interstateNums {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        int highwayNumber;
        int lastTwoDigits;

        highwayNumber = scnr.nextInt();
      
        /* Type your code here. */
        //odd or even?
        if (highwayNumber % 2 != 0) {
            //odd
            if ((highwayNumber >= 1) && (highwayNumber <= 99)) {
                System.out.println("I-" + highwayNumber + " is primary, going north/south.");
            } else if ((highwayNumber >= 100) && (highwayNumber <= 999) && (highwayNumber % 100 != 0)) {
                lastTwoDigits = highwayNumber % 100;
                System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + lastTwoDigits + ", going north/south.");
            } else {
                System.out.println(highwayNumber + " is not a valid interstate highway number.");
            }
        } else {
            //even
            if ((highwayNumber >= 1) && (highwayNumber <= 99)) {
                System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            } else if ((highwayNumber >= 100) && (highwayNumber <= 999) && (highwayNumber % 100 != 0)) {
                lastTwoDigits = highwayNumber % 100;
                System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + lastTwoDigits + ", going east/west.");
            } else {
                System.out.println(highwayNumber + " is not a valid interstate highway number.");
            }
        }
        //close scanner
        scnr.close();
    }
}