import java.util.Scanner;


public class Firstassignment {
	public static void main (String[] args) {

	}

	public int factor(){
		return 1;
	}
	
	public static int parseInput(){
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a number between 1-100");
		System.out.println("or type \"Quit\" to exit");
		console.nextLine();
		if(console.hasNextInt()){
			int numberInput = console.nextLine();
		}
		if(userInput.equals("quit")){
		}else{
			System.out.println("You can't do that. Please enter a number between 1- 100, or type \"quit\"");
			return 101;
		}
		
		
		
		
		return 0;
	}
}