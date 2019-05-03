import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int userAge = input.nextInt();
		System.out.println(userAge + " years old.");

		System.out.println("What is your name?");
		String userFirstName = input.next();
		System.out.println("What is your last name?");
		String userLastName = input.next();
		System.out.println(userFirstName.toLowerCase() + " " + userLastName.toLowerCase());

		if (userLastName.length() > userFirstName.length()) {
			System.out.println("Your last name is longer than your first");
			System.out.println("Your last name is " + userLastName.length() + " Characters long");

		} else if (userLastName.length() < userFirstName.length()) {
			System.out.println("Your first name is longer than your last");
			System.out.println("Your first name is " + userFirstName.length() + " Characters long");

		} else {
			System.out.println("Your first and last name are the same number of characters long.");

		}
		
		boolean riddleLoop = false;
		while (riddleLoop == false) {
			System.out.println("What is used to greet, and also used to describe something taller than you?");
			String userAnswer = input.next();
			if (userAnswer.toLowerCase().equals("hi")) {
				System.out.println("Correct!!!");
				riddleLoop = true;
			} else {
				System.out.println("Try again");
				riddleLoop = false;

			}

		}
	}

}
