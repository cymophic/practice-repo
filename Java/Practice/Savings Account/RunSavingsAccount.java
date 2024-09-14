import java.util.Scanner;

public class RunSavingsAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();
        System.out.print("\nPlease input the interest rate: ");
        savings.setInterestRate(input.nextDouble());
        System.out.print("Please enter deposit amount: ");
        savings.deposit(input.nextDouble());
        savings.showBalance(savings);
        System.out.print("Press D for another deposit or W for withdraw: ");
        String choice = input.next();

        switch (choice.toLowerCase()) {
            case "d":
                System.out.print("Please enter deposit amount: ");
                savings.deposit(input.nextDouble());
                break;
            case "w":
                System.out.print("Please enter withdrawal amount: ");
                savings.withdraw(input.nextDouble());
                break;
            default:
                System.out.println("Please enter a valid input. ");
                break;
        }   

        if (savings.getBalance() > 1000)
            savings.addInterest();

        savings.showBalance(savings);
        System.out.println("");
        input.close();
    }
}

class SavingsAccount {
    private double balance;
    public static double interestRate = 0;

    public SavingsAccount() {
        balance = 0;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            amount = 0;
        }
        return amount;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

    public static void showBalance(SavingsAccount account) {
        System.out.println("Your current balance: " + account.getBalance());
    }
}