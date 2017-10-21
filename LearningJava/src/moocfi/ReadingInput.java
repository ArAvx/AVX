package moocfi;
import java.util.Scanner;
public class ReadingInput {

	public static void main (String args[]) {
	
		readMe();
	}

	public static void readMe() {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Name of your dog:");
		String dogName = reader.nextLine();
		System.out.println("Dog's name is "+ dogName);
		
		boolean done =false;
		while(!done) {
		try {
		System.out.println("\nHow old are you?");
		int age = Integer.parseInt(reader.nextLine());
		done = true;
		System.out.println("Age is "+age);
		}
		catch(NumberFormatException e) {
			System.out.println("Entered value is not Integer");
		}
		}
		
}
	
}
