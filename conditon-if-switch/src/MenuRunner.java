import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.println("You number1 is " + number1);

        System.out.print("Enter number2 ");
        int number2 = scanner.nextInt();
        System.out.println("Your number2 is "+ number2);

        System.out.println("1 - Add\n2 - Subtract\n3 - Divide\n4 -  Multiply");

        System.out.print("Choose operation: ");
        int operation = scanner.nextInt();
        if(operation ==1){
            int add = number1 + number2;
            System.out.println("Your result is " +add);
        }
        else if (operation == 2){
            int sub = number1 - number2;
            System.out.println("Your result is " +sub);
        }
        else  if (operation == 3){
            int divi = number1/number2;
            System.out.println("Your result is " +divi);
        }
        else if (operation == 4){
            int mutli = number1*number2;
            System.out.println("Your result is " +mutli);
        }
        else {
            System.out.println("Proszę wybrać odpowiednią liczbę z menu");
        }






    }
}
