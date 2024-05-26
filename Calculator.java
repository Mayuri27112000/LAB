import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        do {
            System.out.println("Simple Calculator\n------------------");
            
            double num1 = getNumberInput("Enter first number: ", scanner);
            double num2 = getNumberInput("Enter second number: ", scanner);
            
            System.out.print("Choose operation (+, -, *, /): ");
            choice = scanner.next().charAt(0);
            
            double result;
            switch (choice) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero.");
                        continue; // Re-prompt for operation choice
                    }
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    break;
                default:
                    System.out.println("Invalid operation choice.");
            }
            
            System.out.print("Do you want to perform another operation? (Y/N): ");
            choice = scanner.next().charAt(0);
            
        } while (choice == 'Y' || choice == 'y');
        
        scanner.close();
    }
    
    private static double getNumberInput(String message, Scanner scanner) {
        double number;
        while (true) {
            System.out.print(message);
            try {
                number = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return number;
    }
}