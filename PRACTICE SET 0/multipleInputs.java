import java.util.Scanner;

public class multipleInputs {
    public static void main(String[] args) {
        try (Scanner personalInfo = new Scanner(System.in)) {
            System.out.println("\nHi! Enter your name here! ");
            String name = personalInfo.nextLine();

            System.out.println("\nOkay! Now enter your age here! ");
            String age = personalInfo.nextLine();

            System.out.println("\nHello! " + name + ", you are "+ age +" years old!\n");
        }
    }
}
