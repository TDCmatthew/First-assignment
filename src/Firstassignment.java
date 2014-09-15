import java.util.Scanner;

public class Firstassignment {
	public static int NUMBERDAMNIT = 0;
	public static void main(String[] args) {
		System.out.println("Enter a number between 1-100 that you would like factored,");
		System.out.println("or type \"Quit\" to exit.");
		parseInput();
			factor();
	}

	public static void factor() {
		for(double i = NUMBERDAMNIT/2; i >= 1; i--){
			if((int)(NUMBERDAMNIT/i) * i == NUMBERDAMNIT  && i < NUMBERDAMNIT/i){
				System.out.println((int)i + " and " + (int)(NUMBERDAMNIT/i));
			}
		}
	}

	public static int parseInput() {
		Scanner console = new Scanner(System.in);
		int numberInput = 0;
		String otherInput;
		if (console.hasNextInt()) {
			numberInput = console.nextInt();
			if (numberInput >= 1 && numberInput <= 100) {
				NUMBERDAMNIT += numberInput;
				return numberInput;
			} else {
				System.out.println("That number isn't within an acceptable range - it must be between 1 and 100.");
				parseInput();
			}
		} else {
			otherInput = console.next();
			otherInput.toLowerCase();
			if (otherInput.equals("quit")) {
				System.out.println("Have a nice day.");
				return 0;
			} else {
				System.out.println("" + otherInput + " is not valid input. Please enter a number between 1-100.");
				parseInput();
			}
		}
		return numberInput;
	}
}