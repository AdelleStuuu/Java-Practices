import java.util.Scanner;

public class basicInput {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("\nHi! Enter your name here! ");
            String name = scan.nextLine();

            System.out.println("Hello! " + name + "\n");
        }
    }
}
