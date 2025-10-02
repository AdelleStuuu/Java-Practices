
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleInterestRate {
    public static void main(String[] args) {

        System.out.println("");
        
        try(Scanner numbersScanner = new Scanner(System.in)) {
            float principle,time,rate;
            while (true) { 
                try {
                    System.out.print("Enter Principle here: ");
                    principle = numbersScanner.nextFloat();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Theres something wrong here, input type does not match!");
                    numbersScanner.next();
                }
                
            }

            System.out.println("");

            while (true) { 
                try {
                    System.out.print("Enter the Time in years here: ");
                    time = numbersScanner.nextFloat();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Theres something wrong here, input type does not match!");
                    numbersScanner.next();
                }
                
            }

            System.out.println("");

            while (true) { 
                try {
                    System.out.print("Enter the Rate here: ");
                    rate = numbersScanner.nextFloat();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Theres something wrong here, input type does not match!");
                    numbersScanner.next();
                }
                
            }
            float SimpleInterestRate = (principle * time * rate)/100;
            System.out.println("\nYour interest rate is: "+SimpleInterestRate+"%\ns");
        }
    }
}
