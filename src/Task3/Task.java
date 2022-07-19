package Task3;

import Task3.keyboard.Keyboard;
import Task3.message.Messages.Message;

public class Task {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();

        int a = keyboard.readInteger(Message.PROMPT_MESSAGE, Message.ERROR_MESSAGE);
        int b = keyboard.readInteger(Message.PROMPT_MESSAGE, Message.ERROR_MESSAGE);
        int c = keyboard.readInteger(Message.PROMPT_MESSAGE, Message.ERROR_MESSAGE);
        int d = keyboard.readInteger(Message.PROMPT_MESSAGE, Message.ERROR_MESSAGE);
        int e = keyboard.readInteger(Message.PROMPT_MESSAGE, Message.ERROR_MESSAGE);
        int f = keyboard.readInteger(Message.PROMPT_MESSAGE, Message.ERROR_MESSAGE);
        int g = keyboard.readInteger(Message.PROMPT_MESSAGE, Message.ERROR_MESSAGE);

        int area = areaOfRightTriangle(a,b) + areaOfRightTriangle(g,c) + areaOfRightTriangle(f,d);
        System.out.println(area);
    }

    public static int areaOfRightTriangle(int sideA, int sideB){
        return (sideA*sideB)/2;
    }
}
