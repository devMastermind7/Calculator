import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        float num1 = scanner.nextFloat();
        
        System.out.println("Enter the second number: ");
        float num2 = scanner.nextFloat();
        
        Calculator calculator = new Calculator();
        
        System.out.println("Addition: " + calculator.addition(num1, num2));
        System.out.println("Subtraction: " + calculator.subtraction(num1, num2));
        
        if (num2 != 0) {
            System.out.println("Division: " + calculator.division(num1, num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }
        
        System.out.println("Multiplication: " + calculator.multiplication(num1, num2));
        
        scanner.close();
    }
    
    public float addition(float num1, float num2) {
        return num1 + num2;
    }
    
    public float subtraction(float num1, float num2) {
        return num1 - num2;
    }
    
    public float division(float num1, float num2) {
        return num1 / num2;
    }
    
    public float multiplication(float num1, float num2) {
        return num1 * num2;
    }
}
