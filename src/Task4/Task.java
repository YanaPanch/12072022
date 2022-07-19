package Task4;

public class Task {
    public static void main(String[] args) {

        int a = factorial(5);

        int b = factorial(8);

        int c = factorial(6);

        int d = factorial(4);

        int result = ((2 * a) + (3 * b)) / (c + d);
        System.out.println("Result = " + result);
    }

    public static int factorial(int number){
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
