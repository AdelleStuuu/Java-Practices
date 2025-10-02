
import java.util.InputMismatchException;
import java.util.Scanner;

public class celsiusToFarenheit {
    public static int choiceMaking(Scanner choices) {
        int choice;
        
            while (true) { 
                    try {
                        System.out.print("Enter what conversion you wish to do:\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n3. Celsius to Kelvin\n4. Fahrenheit to Kelvin\n5. Kelvin to Celsius\n6. Kelvin to Fahrenheit\nChoice here: ");
                        choice = choices.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.err.println("Theres something wrong here, input type does not match!");
                        choices.next();
                    }
                    
                }
                return choice;
    }

    public static float temperatureInsertion(Scanner temp) {
        float temperature;
        
            
            while (true) { 
                try {
                    System.out.print("Great! Enter the temperature needed here for convertion: ");
                    temperature = temp.nextFloat();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Theres something wrong here, input type does not match!");
                    temp.next();
                }
            }
            
        return temperature;
    }
    public static void main(String[] args) {
        float temperatureCalculation = 0.0f;

        Scanner scan = new Scanner(System.in);
        System.out.println("");
        int choice = choiceMaking(scan);
        boolean isChoiceValid = false;
        float temperature = temperatureInsertion(scan);
        while (true) { 
            switch (choice) {
                case 1 -> {
                    temperatureCalculation = (temperature * 9/5) + 32;
                    isChoiceValid = true;
                    break;
                } case 2 -> {
                    temperatureCalculation = (temperature - 32) * 5/9;
                    isChoiceValid = true;
                    break;
                } case 3 -> {
                    temperatureCalculation = temperature + 273.15f;
                    isChoiceValid = true;
                    break;
                }case 4 -> {
                    temperatureCalculation = ((temperature - 32) * 5/9) + 273.15f;
                    isChoiceValid = true;
                    break;
                }case 5 -> {
                    temperatureCalculation = temperature - 273.15f;
                    isChoiceValid = true;
                    break;
                }case 6 -> {
                    temperatureCalculation = ((temperature - 273.15f) * 9/5) + 32;
                    isChoiceValid = true;
                    break;
                } default -> {
                    System.out.println("");
                    System.out.println("Let's Try again! Theres an invalid choice back at the choice making stage!");
                    System.out.println("");
                    choice = choiceMaking(scan);
                    temperature = temperatureInsertion(scan);
                }
            }

            if (isChoiceValid) {
                
                break;
            }
        }
        System.out.println("");
        System.err.println("The new Temperature is "+temperatureCalculation);
        System.out.println("");
           
    }
}
