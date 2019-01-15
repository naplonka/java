import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Give me number ");
        //int number = scanner.nextInt();
        int moreNumber;
        do{
            System.out.print("Give me number ");
            moreNumber = scanner.nextInt();
            System.out.println("Your number is " + moreNumber*moreNumber);
        }
        while (moreNumber>0);
        System.out.println("Thank you! I want this number " + moreNumber);

    }
}
