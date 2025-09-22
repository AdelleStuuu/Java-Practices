import java.util.Scanner;

public class sumOfNums {
    public static void main(String[] args) {
        try(Scanner add = new Scanner(System.in)) {
            System.out.println("");
            System.out.println("Enter a number!");
            var num1 = add.nextInt();
            
            System.out.println("Enter another number!");
            var num2 = add.nextInt();

            var sum = num1 + num2;
            System.out.println("The total of " + num1 + " and " + num2 + " are: " + sum);
            System.out.println("");
        }
    }    
}
