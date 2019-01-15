

public class SwitchCaseExRunner {
    public static void main(String[] args) throws InterruptedException {
        isWeekDay(2);
        System.out.println(determineNameOfMonth(6));
        System.out.println(determineNameOfDay(3));
        Thread.sleep(203);
    }
    public static boolean isWeekDay(int dayNumber) {
        switch (dayNumber){
            case 0 : System.out.println("Monday");
                break;
            case 1 : System.out.println("Tuesday");
                break;
            case 2 : System.out.println("Wendesday");
                break;
            case 3 : System.out.println("Thursday");
                break;
            case 4 : System.out.println("Friday");
                break;
            case 5 : System.out.println("Saturday");
                break;
        }
        return false;

    }
    public static String determineNameOfDay(int dayNumber) {
        switch (dayNumber){
            case 0 : return "Monday";
            case 1 : return "Tuesday";
            case 2 : return "Wedensday";
            case 3 : return  "Thursday";
            case 4 : return  "Friday";
            case 5 : return  "Saturday";
            case 6 : return "Sunday";
        }
        return "Invalid number";

    }

    public static String determineNameOfMonth(int monthNumber) {
        switch (monthNumber){
            case 1: return "January";
            case 2 : return "February";
            case 3 : return "March";
            case 4 : return "April";
            case 5 : return "May";
            case 6 : return "June";
            case 7 : return "August";
            case 8 : return "September";
            case 9 : return  "Jul";
        }
        return "Invalid number";
    }

}
