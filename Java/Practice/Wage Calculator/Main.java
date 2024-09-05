import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int hourlyRate;
    int hours;

    Scanner hr = new Scanner(System.in);
    System.out.println("Enter your rate per hour: ");
    hourlyRate = hr.nextInt();
    System.out.println("Your hourly rate is: " + hourlyRate); 
    
    Scanner numhrs = new Scanner(System.in);
    System.out.println("Enter your number of hours: ");
    hours = numhrs.nextInt();
    System.out.println("Your number of hours is: " + hours);

    int wage = hourlyRate * hours;

    System.out.println("Your wage is: " + wage);
	hr.close();
    numhrs.close();
  }
}