
import java.util.*;

public class Main {
	
	public static void main (String [] args) {

		System.out.println("");
		System.out.println("Quick Quiz! Try your best in answering the following.");

		new Main ();

	}

	public Main () {

		Scanner sc = new Scanner (System.in);
		System.out.println("----------------------------------");

		for (int ins = 0; ins < 10; ins++) {

			try {

				System.out.println(ins + 1 + ". " + question[ins]);
				System.out.println("");
				System.out.println("A. " + a[ins]);
				System.out.println("B. " + b[ins]);
				System.out.println("C. " + c[ins]);
				System.out.println("");
				System.out.print("Answer: ");
				String ans = sc.nextLine();
				System.out.println("----------------------------------");
	
				if (ans.equalsIgnoreCase("a") || ans.equalsIgnoreCase("b") || ans.equalsIgnoreCase("c")) {

					if (ans.equalsIgnoreCase(answer[ins])) {
						score++;
					}

				}

				else if (ans.equalsIgnoreCase("") || ans.equalsIgnoreCase(" ")) {

					throw new InputBlankException();

				}

				else if (illegalChar.toLowerCase().contains(ans.toLowerCase())) {

					throw new InputMismatchException();

				}

				else {

					throw new InvalidCharactersException();

				}
				
			}

			catch (InputMismatchException im) {
				ins--;
				System.err.println("Invalid letter detected. Please try again. ");
				System.out.println("----------------------------------");
			}

			catch (InputBlankException ib) {
				ins--;
				System.err.println(ib.getMessage());
				System.out.println("----------------------------------");
			}

			catch (InvalidCharactersException ic) {
				ins--;
				System.err.println(ic.getMessage());
				System.out.println("----------------------------------");
			}

		}

		System.out.println("You got " + score + " / 10!");

		//Custom Feedback for Scores

			if (score >= 8) {
				System.out.println("Excellent Job! Thanks for playing. ");
			}

			else if (score <= 7 && score >= 5) {
				System.out.println("Good attempt! Thanks for playing. ");
			}

			else {
				System.out.println("Study more! Try harder next time! ");	
			}
        
        sc.close();
	}

	//User-defined Exception Classes

	public class InputBlankException extends Exception {
		public InputBlankException() {
			super("Blank input detected. Please try again.");
		}
	
	}

	public class InvalidCharactersException extends Exception {
		public InvalidCharactersException() {
			super("Invalid character(s) detected. Please try again.");
		}
	
	}

	//Quiz Content Initialization and Declaration
	
	int score = 0; 
	String illegalChar = "defghijklmnopqrstuvwxyz";

	String [] question = new String [10];
	String [] answer = new String [10];
	String [] choice = new String [10];

	String [] a = new String [10];
	String [] b = new String [10];
	String [] c = new String [10]; 

	{

	question [0] = "Which animal lays eggs?";
	question [1] = "A male cow is called?";
	question [2] = "All animals need food, air, and ____ to survive.";
	question [3] = "Which one is a fur-bearing animal?";
	question [4] = "What is Earth’s only natural satellite?";
	question [5] = "The tree has a branch filled with green _____.";
	question [6] = "What part of the body helps you move?";
	question [7] = "The two holes of the nose are called?";
	question [8] = "What star shines in the day and provides light?";
	question [9] = "Legs have feet and arms have ___.";

	answer [0] = "b";
	answer [1] = "a";
	answer [2] = "a";
	answer [3] = "c";
	answer [4] = "c";
	answer [5] = "b";
	answer [6] = "c";
	answer [7] = "a";
	answer [8] = "c";
	answer [9] = "c";

	choice [0] = "a";
	choice [0] = "b";
	choice [0] = "c";

	a [0] = "Dog";
	b [0] = "Duck";
	c [0] = "Sheep";

	a [1] = "Ox";
	b [1] = "Monkey";
	c [1] = "Rooster";

	a [2] = "Water";
	b [2] = "Love";
	c [2] = "House";

	a [3] = "Hen";
	b [3] = "Tortoise";
	c [3] = "Cat";

	a [4] = "Sun";
	b [4] = "International Space Station";
	c [4] = "Moon";

	a [5] = "Hair";
	b [5] = "Leaves";
	c [5] = "Elves";

	a [6] = "Eyes";
	b [6] = "Pancreas";
	c [6] = "Muscles";

	a [7] = "Nostrils";
	b [7] = "Nails";
	c [7] = "Hair";

	a [8] = "Venus";
	b [8] = "Mars";
	c [8] = "Sun";

	a [9] = "Ankles";
	b [9] = "Skull";
	c [9] = "Hands";

	}

}



