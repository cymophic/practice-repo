import java.util.*;
import java.util.InputMismatchException;

public class Main {

	public static void main (String [] args) {
	
		int obj = (int)(Math.random() * 50 + 1);
		int att = 1;
		
		System.out.println("");
		System.out.println("Guessing Game!");
		System.out.println("----------------------------------");
		System.out.print("Guess my number! Pick a number between 1 & 50: ");

		new Main (obj, att);

	}

	public Main (int obj, int att) {

		@SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
		
		int num;
		int min = 0;
		int max = 51;	

		try {	

			num = sc.nextInt();

			while (true) {

				if (num <= min || num >= max) {
					throw new OutOfRangeException();
				}		

				else if (num != (int) num) {
					throw new InputMismatchException();
				}

				else if (num > obj) {
					att++;
					System.out.print(num + " is too high. Try guessing a lower number: ");
					num = sc.nextInt();
				}

				else if (num < obj) {
					att++;
					System.out.print(num + " is too low. Try guessing a higher number: ");
					num = sc.nextInt();
				}

				else if (num == obj) {
					System.out.println("----------------------------------");
					System.out.println("You won! You got it in " + att + " attempt(s)!");
					System.out.println("Thanks for playing! ");
					System.exit(0);
				}

			}
		
		}
		
		//Error Catchers
		catch (InputMismatchException im) {
			System.err.print("Invalid input. Please choose a number instead: ");
			new Main(obj, att);
		}

		catch (OutOfRangeException oor) {
			System.err.print(oor.getMessage());
			new Main(obj, att);
		}
        
	}

	//OutOfRangeException Class
	public class OutOfRangeException extends Exception {
		public OutOfRangeException() {
			super("Out of range. Please choose between 1 & 50: ");
		}
	
	} 

}