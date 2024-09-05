import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner celsius = new Scanner(System.in);
    System.out.println("Enter Celcius: ");
    int C = celsius.nextInt();

    int F = (C * 9/5) + 32;

    System.out.println("Fahrenheit is " + F + " degrees");
    celsius.close();
  }
}