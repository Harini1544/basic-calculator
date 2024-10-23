import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Choose operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
        scanner.close();
    }
}
