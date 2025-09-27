import java.util.Scanner;

public class factorialCalculator {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.print("\nEnter a Number to factorize: ");
            int number = scan.nextInt();

            int FactorialProduct = 1;
            for (int i = 1; i <= number; i++) {
                FactorialProduct *= i;
            }
            System.out.println("The Factorial of " + number + " is " + FactorialProduct + "!!!\n");
        }

    }
}
