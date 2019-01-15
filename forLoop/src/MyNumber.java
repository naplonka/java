public class MyNumber {

    private int i;

    public MyNumber(final int i) {
        this.i = i;
    }

    public boolean isPrime() {
        this.i = i;
        for (int number = 2; number <= i; number++) {
            int divisionResult = i / number;
            int divideNumberBy1 = i / 1;
            if (i % number == 0) {
                if (!(divisionResult == 1) || !(divideNumberBy1 == i)) {
                    System.out.println("To nie jest liczba pierwsza");
                    break;
                } else if ((divisionResult == 1) && (divideNumberBy1 == i)) {
                    System.out.println("To jest liczba pierwsza");
                }
            }
        }
        return false;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int number2 = 1; number2 <= i; number2++) {
            sum = sum +number2;

            System.out.println(sum);
        }
        return sum;
    }


    public void printANumberTriangle() {
        
        for (int number3=1; number3<=i; number3++){
            for (int j = 1; j<=number3; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

