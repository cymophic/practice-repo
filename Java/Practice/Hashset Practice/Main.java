//Mata, Luis Abhram V.
//BSCpE 301

import java.util.*;

class Main {

	public static void main(String[] args) {
		Set<String> group1 = new HashSet<String>();
		Set<String> group2 = new HashSet<String>();
		Set<String> self = new HashSet<String>();

		Scanner sc = new Scanner(System.in);

		System.out.println("\n----------------------------------");
		for (int month1 = 1; month1 <= 3; month1++) {
			System.out.print("Enter birth month " + month1 + ": ");
			group1.add(sc.nextLine());
		}

		System.out.println("");

		for (int month2 = 1; month2 <= 3; month2++) {
			System.out.print("Enter birth month " + month2 + ": ");
			group2.add(sc.nextLine());
		}

		System.out.println("----------------------------------");
		System.out.println("Group 1: " + group1);
		System.out.println("Group 2: " + group2);
		System.out.println("----------------------------------");

		System.out.print("Enter your birth month: ");
		self.add(sc.nextLine());

		Set<String> union = new HashSet<String>(group1);
		Set<String> inter = new HashSet<String>(group1);
		Set<String> diff = new HashSet<String>(group1);

		union.addAll(group2);
		inter.retainAll(group2);
		diff.removeAll(group2);

		System.out.println("----------------------------------");
		System.out.println("Union: " + union);
		System.out.println("Intersection: " + inter);
		System.out.println("Difference: " + diff);

		System.out.println("");

		if (union.containsAll(self)) {
			System.out.println("You have the same birthmonth with one of your classmates.");
			System.out.println("----------------------------------");
		}

		else {
			System.out.println("You do not have the same birthmonth as your classmates.");
			System.out.println("----------------------------------");
		}

		sc.close();
	}

}





