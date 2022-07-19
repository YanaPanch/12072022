package Task1;

import Task1.keyboard.Keyboard;
import Task1.message.Messages.Message;

public class Task {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();

        double a = keyboard.readInteger(Message.PROMPT_MESSAGE, Message.ERROR_MESSAGE);

        double b = keyboard.readInteger(Message.PROMPT_MESSAGE, Message.ERROR_MESSAGE);

        double summariseResult = summarise(a,b);
        double subtractionResult = subtraction(a,b);
        double multiplicationResult = multiplication(a,b);
        double divisionResult = division(a,b);

        showResults(summariseResult, subtractionResult, multiplicationResult,divisionResult);
    }



    public static double summarise(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b){
        return a - b;
    }

    public static double multiplication(double a, double b){
        return a * b;
    }

    public static double division(double a, double b){
        return a / b;
    }

    public static void showResults(double summariseResult, double subtractionResult, double multiplicationResult, double divisionResult){
        System.out.println("Summarise a + b = " + summariseResult + "\n" +
                "Subtraction a - b = " + subtractionResult + "\n" +
                "Multiplication a * b = "+ multiplicationResult + "\n" +
                "Division a / b = " + divisionResult);
    }
}
