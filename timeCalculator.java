public class timeCalculator {

    public static String getMyTime() {
        //variable declarations
        String tempString = "";
        long startingMiliseconds = System.currentTimeMillis();

        //calculate the time
        long startingSeconds = (startingMiliseconds / 1000) % (86400);
        int seconds = (int)startingSeconds % 60;
        startingSeconds /= 60;
        int minutes = (int)startingSeconds % 60;
        startingSeconds /= 60;
        int hour = (int)startingSeconds;

        //AM or PM
        String midday = "";
        if (hour < 12) {
            midday = "AM";
        } else if (hour >= 12) {
            midday = "PM";
            hour -= 12;
        }

        //return the string
        tempString = String.format("%1d:%02d:%02d %1s", hour, minutes, seconds, midday);
        /*
        another way to do it
         tempString = Long.toString(hour) + ":" + Long.toString(minutes) 
                        + ":" + Long.toString(seconds) + " " + midday;
         */
        return tempString;
    }

    public static void main(String [] args) {
        System.out.println(getMyTime());
    }
}