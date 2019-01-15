import java.util.Scanner;

public class SwitchCaseEx {
    public static boolean isWeekDay(int dayNumber) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me number day of week: ");
        switch (dayNumber= scanner.nextInt()){
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
}
