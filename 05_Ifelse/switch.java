// a switch statement evaluates an expression and then compares the result against several case labels. If a match is found, the block of code associated with that case is executed.

public class switch {
    
    public static void main(String[] args) {
        int dayNumber = 3;
        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day corresponding to number " + dayNumber + " is " + dayName);
    }
}