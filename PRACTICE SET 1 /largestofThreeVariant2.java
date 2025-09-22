import java.util.InputMismatchException;
import java.util.Scanner;
public class largestofThreeVariant2 {
    public static void main(String[] args) {
        try(Scanner num = new Scanner(System.in)) {
            System.out.println("");
            int num1;
            int num2;
            int num3;
            int numOne;
            int numTwo;
            int numThree;

            while (true) {     
                    try {
                        System.out.println("Enter First number here!");
                        numOne = num.nextInt();
                        num1 = numOne;
                        break;
                    } 
                    catch (InputMismatchException e) {
                        System.out.println("Hm, something went wrong... Did you try putting in an int?\n");
                        num.next();
                    }
                
            }
            System.out.println("");
            while (true) {     
                    try {
                        System.out.println("Enter Second number here!");
                        numTwo = num.nextInt();
                        num2 = numTwo;
                        break;
                    } 
                    catch (InputMismatchException e) {
                        System.out.println("Hm, something went wrong... Did you try putting in an int?\n");
                        num.next();
                    }
                
            }
            System.out.println("");
            while (true) {     
                    try {
                        System.out.println("Enter Third number here!");
                        numThree = num.nextInt();
                        num3 = numThree;
                        break;
                    } 
                    catch (InputMismatchException e) {
                        System.out.println("Hm, something went wrong... Did you try putting in an int?\n");
                        num.next();
                    }
                
            }

            System.out.println("");
            int biggestNumber;

            if (num1 > num2 && num1 > num3) {
            biggestNumber = num1;
            } else if (num2 > num1 && num2 > num3) {
                biggestNumber = num2;
            } else {
                biggestNumber = num3;
            }
        
        System.out.println("The biggest number is: " + biggestNumber);
        System.out.println("");
        }
    }
}
