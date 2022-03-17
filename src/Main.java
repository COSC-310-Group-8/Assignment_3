import java.io.*;
import java.util.*;

public class Main extends Userfeelings {


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String cont1 = "yes";
		String cont2 = "No";
		String place = " ";
		Userfeelings p1 = new Userfeelings();
	

		NovaBot n1 = new NovaBot();
		System.out.println(n1.getGreeting());

		while (true) {
			try {
				String userInput = sc.nextLine();
				String[] words = userInput.split(" ");
				p1.findEmotion(words);
				System.out.println(n1.getResponse(p1.getEmotion()));
				System.out.println("NOVA: Would look like to expand on feeling " + p1.getKeyword() + "? (yes/no)");
				cont1 = sc.nextLine();
				cont1.toLowerCase();
				if (cont1.contains("yes")) {
					System.out.println("NOVA: Okay, I'm listening");

					while (true) {
						place = sc.nextLine();
						System.out.println(n1.getComfort() + "\n" + n1.getResponse(p1.getEmotion()) + "\n"
								+ "NOVA: Would you like to continue? (yes/no)");
						cont2 = sc.nextLine();
						cont2.toLowerCase();
						if (cont2.contains("yes")) {
							System.out.println("NOVA: You can continue");
							place = sc.next();
						} else {
							System.out.println(n1.getComfort() /* + n1.getQuote(p1.getEmotion()) */);
							break;
						}
					}

				} else {

					System.out.println("NOVA: That's okay! I want you to feel comfortable.\n" + n1.getComfort()/*
																								 */);
				}

				System.out.println("NOVA: Is there another emotion you would like to talk about?(yes/no) ");
				cont1 = sc.nextLine();
				cont1.toLowerCase();
				if (cont1.contains("yes")) {
					System.out.println("NOVA: Okay Im here to listen :) " + "\n"
							+ "What other emotions are you feeling? (mad, sad, happy)");
				} else {

					break;

				}
			} catch (NullPointerException e) {
				System.out.println("NOVA: I'm sorry, I don't understand. Please try again.");
			} catch (IndexOutOfBoundsException i) {
				System.out.println("NOVA: I'm sorry, I don't understand. Please try again.");
			}

		} // end of first while loop

		System.out.println("NOVA: I am happy you are able to open up to me like this :) ");

		// if user is sad this will be the line if choice
		System.out.println("NOVA: If you would like I can suggest some options to help you (yes/no)");
		boolean doneOptions = false;
		while (!doneOptions) {
			cont1 = sc.nextLine();
			if (cont1.equalsIgnoreCase("yes")) {
				boolean done = false;
				while (!done) {
					System.out.println("NOVA: " + n1.helpOptions());
					System.out.println("NOVA: Would you like another helpful tip? (yes/no)");
					cont1 = sc.nextLine();
					if (cont1.equalsIgnoreCase("no")) {
						done = true;
					} else if (cont1.equalsIgnoreCase("yes")) {
						System.out.println("NOVA: Awesome!");
					}
				}
				doneOptions = true;
			} else if (cont1.equalsIgnoreCase("no")) {
				System.out.println("NOVA: Okay, that's fine.");
				doneOptions = true;
			} else {
				System.out.println("NOVA: Sorry, I don't understand. Please try again: ");
			}
		}
		boolean doneRating = false;
		System.out.println(
				"NOVA: I am glad you are able to talk to me about your emotions :). I am always here if you need me");
		System.out.println("NOVA: Would you give me a rating on how I did today? (yes/no) ");
		while (!doneRating) {
			cont1 = sc.nextLine();
			if (cont1.equalsIgnoreCase("yes")) {
				NovaBot.getRating();
				doneRating = true;
			} else if (cont1.equalsIgnoreCase("no")) {
				System.out.println("That's okay! We only ask for feedback to improve NOVA.");
				doneRating = true;
			} else {
				System.out.println("NOVA: Sorry, I don't understand. Please try agian: ");
			}
		}

		System.out.println("Thank you for using NOVA! Goodbye.");
		sc.close();

	}// end of main method

}// end of class
