//Mata, Luis Abhram
//BSCpE 301
//07 Hands-on Activity

import java.util.*;

class Main {

	public static void main (String [] args) {

		PriorityQueue<String> nicknames = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the nickname of your four classmates: ");

		for (int i = 0; i < 4; i++) {
			String names = sc.nextLine();
			names = names.substring(0,1).toUpperCase() + names.substring(1).toLowerCase();
			nicknames.add(names);
		}

		do {
			System.out.print("\nPress \"H\" to say Hi: ");
			String hi = sc.nextLine();

			if (hi.equalsIgnoreCase("h")) {
				System.out.println("Hi " + nicknames.poll());
			}

		} while (!nicknames.isEmpty());

		System.out.println("\nDone saying Hi");
		sc.close();

	}

}




