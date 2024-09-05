import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Name
        System.out.println("Please Enter Your Name: ");
        String employeeName = sc.nextLine();
        
        //Full or Part Time
        System.out.println("Press P for Part Time or F for Full Time: ");
        char FP = sc.nextLine().charAt(0);
        
        switch (FP) {
            case 'F':
            case 'f':
                
                System.out.println("--- Full Time Employee ---");
                System.out.println("Enter your monthly salary: ");
                Double monSalary = sc.nextDouble();
                
                System.out.println("________________________");
                System.out.println("Name: " + employeeName);
                System.out.printf("Monthly Salary: %.2f\n", monSalary);
                System.out.println("________________________");
                System.out.printf("Total Salary: %.2f", monSalary);
                break;
                
            case 'P':
            case 'p':
                System.out.println("--- Part Time Employee ---");
                System.out.println("Enter your hourly rate: ");
                Double hourlyRate = sc.nextDouble();
                System.out.println("Enter your hours: ");
                int hours = sc.nextInt();
                System.out.println("Enter your overtime hours: ");
                int overtime = sc.nextInt();
                
                //Computations
                Double salary = hourlyRate * hours;
                Double overtimeSalary = overtime * (hourlyRate * 1.25);
                Double totalSalary = salary +overtimeSalary;
                
                System.out.println("________________________");
                System.out.println("Name: " + employeeName);
                System.out.printf("Basic Salary: %.2f\n", salary);
                System.out.printf("Overtime Salary: %.2f\n", overtimeSalary);
                System.out.println("________________________");
                System.out.printf("Total Salary: %.2f\n", totalSalary);
                break;
                
            default:
                System.out.println("Please enter a valid input: ");
                break;
        }

        sc.close();
    }
}
