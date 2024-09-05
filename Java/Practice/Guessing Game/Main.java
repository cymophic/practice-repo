import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int r = (int)(Math.random() * 15 + 1);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess My Number Game");
        System.out.print("Enter a number between 1 and 15: ");
        int n = input.nextInt();
        int c = 1;
        
        while(n != r) {
            c++;
            if (n < r)
                System.out.println(n + " is too low. Try guessing a higher number.");
            else if (n > r)
                System.out.println(n + " is too high. Try guessing a lower number.");
			else
				System.out.println("Please input a valid number.");

			System.out.print("Enter another number: ");
			n = input.nextInt();
        }
        
        switch (c) {   
            default:
                System.out.println("You got it in " + c + " attempt(s)! Congrats!");
				System.out.println("Thanks for playing!");
				System.exit(0);
				break;
        }
        
        input.close();
    }
}
