import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int number;

    Scanner enter = new Scanner(System.in);
    System.out.println("Enter the number that you want to check: ");
    number = enter.nextInt();

    if (number % 2 == 0) {
      System.out.println("Number " + number + " is even. ");
    } 
	
	else {
      System.out.println("Number " + number + " is odd. ");
    }

    enter.close();
  }
}