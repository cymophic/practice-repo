import java.util.Scanner;

public class Main {
    private static double[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();
        
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Choose a math operation to be used: ");
        double num3 = sc.nextDouble();
        double [] numbers = {num1, num2, num3}; 
        sc.close();
        return numbers;
    }
    
    private static double[] performOperation(double num1, double num2, double num3) {
        double sum = num1 + num2;
        double dif = num1 - num2;
        double pro = num1 * num2;
        double quo = num1 / num2;
        
        double[] results = {sum, dif, pro, quo,};
        return results;
    }
    
    private static  void displayResult(double[] numbers, double[] results) {
         if (numbers[2] == 1) {
            System.out.println(numbers[0] + " + " + numbers[1] + " = " + results[0]);
        }
         if (numbers[2] == 2) {
            System.out.println(numbers[0] + " - " + numbers[1] + " = " + results[1]);
        }
         if (numbers[2] == 3) {
            System.out.println(numbers[0] + " x " + numbers[1] + " = " + results[2]);
        }
         if (numbers[2] == 4) {
            System.out.println(numbers[0] + " ÷ " + numbers[1] + " = " + results[3]);
        }
    }
    
    public static void main (String[] args) {
        double[] numbers = getUserInput();
        double[] results = performOperation(numbers[0], numbers[1], numbers[2]);
        displayResult(numbers, results);
    }
}





