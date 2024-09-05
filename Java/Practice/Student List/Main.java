/*
Mata, Luis Abhram
BSCpE 301
*/

import java.util.*; //Imports Scanner, Map, & HashMap

class Main {
	public static void main (String [] args) {

		Scanner sc = new Scanner (System.in);
		HashMap <String, String> students = new LinkedHashMap<>();

		System.out.println("\nStudent List Display & Enlisting\n");

		System.out.println("---------------START--------------\n");
		System.out.print("Enter student number 1: ");
		String number1 = sc.nextLine();
		System.out.print("Enter first name 1: ");
		String name1 = sc.nextLine();
		students.put(number1, name1);

		System.out.print("Enter student number 2: ");
		String number2 = sc.nextLine();
		System.out.print("Enter first name 2: ");
		String name2 = sc.nextLine();
		students.put(number2, name2);

		System.out.print("Enter student number 3: ");
		String number3 = sc.nextLine();
		System.out.print("Enter first name 3: ");
		String name3 = sc.nextLine();
		students.put(number3, name3);

		System.out.println("----------------------------------");

		System.out.println("Student List: ");
		for (HashMap.Entry <String, String> list: students.entrySet()) {
			System.out.println(list.getKey() + " : " + list.getValue());
		}

		students.remove(number3, name3);

		System.out.println("----------------------------------");
		System.out.print("Enter your student number: ");
		String number = sc.nextLine();
		System.out.print("Enter your first name: ");
		String name = sc.nextLine();
		students.put(number, name);

		System.out.println("----------------------------------");
		System.out.println("Student List: ");
		for (HashMap.Entry <String, String> list: students.entrySet()) {
			System.out.println(list.getKey() + " " + list.getValue());
		}

		System.out.println("\n---------------END----------------");
		sc.close();
	}
}





