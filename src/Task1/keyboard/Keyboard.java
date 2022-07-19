package Task1.keyboard;

import java.util.Scanner;

public class Keyboard {
    private Scanner scanner;

    public Keyboard(){
        scanner = new Scanner(System.in);
    }

    public double readInteger(String promptMessage, String errorMessage) {
        double number = 0;
        String stringInput;
        boolean valid = false;

        while (!valid) {
            System.out.println(promptMessage);
            stringInput = scanner.nextLine();
            try {
                number = Double.parseDouble(stringInput);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
        return number;
    }
}
