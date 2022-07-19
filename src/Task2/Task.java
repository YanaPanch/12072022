package Task2;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("How are You?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        System.out.println("You are " + answer);
    }
}
