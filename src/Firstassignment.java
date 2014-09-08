import java.util.Scanner;


public class Firstassignment {
	public static void main (String[] args) {
		System.out.println("Enter a number between 1-100");
		System.out.println("or type \"Quit\" to exit");
		parseInput();
	}

	public int factor(){
		return 1;
	}
	
	public static int parseInput(){
		Scanner console = new Scanner(System.in);
		int numberInput;
		String otherInput;
		if(console.hasNextInt()){
			numberInput = console.nextInt();
			return numberInput;
		}
		else{
			otherInput = console.next();
			otherInput.toLowerCase();
			if (otherInput.equals("quit")){
				System.out.println("Have a nice day.");
				return 0;
			}
			
		}
	}
}
//com