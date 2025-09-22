import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        System.out.println("");
        try(Scanner num = new Scanner(System.in)) {
        System.out.println("Enter First number here!");
        int num1 = num.nextInt();

        System.out.println("Enter Second number here!");
        int num2 = num.nextInt();

        System.out.println("Enter Third number here!");
        int num3 = num.nextInt();

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
