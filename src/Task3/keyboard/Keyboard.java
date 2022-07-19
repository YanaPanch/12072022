package Task3.keyboard;

import java.util.Scanner;

public class Keyboard {
    private Scanner scanner;

    public Keyboard(){
        scanner = new Scanner(System.in);
    }

    public int readInteger(String promptMessage, String errorMessage) {
        int number = 0;
        String stringInput;
        boolean valid = false;

        while (!valid) {
            System.out.println(promptMessage);
            stringInput = scanner.nextLine();
            try {
                number = Integer.parseInt(stringInput);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
        return number;
    }
}
