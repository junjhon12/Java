import java.io.IOException;
import java.util.Scanner;

public class problem05 {

	public static void main(String[] args) throws IOException {
		// Variables
		System.out.println("Enter a anything: ");
		String subject = extracted().nextLine(); // Holds user's string object
		System.out.println("Enter a letter: ");
		char letter = (char) System.in.read();; // Holds user character
		int count = 0; // Holds the count of letter
		// Loop and count the char in subject
		for (int i = 0; i < subject.length(); i++) {
			
			// Checks to see if the subject char matches user's char
			if (subject.charAt(i) == letter) {
				count++;
			}
		}
		// Display count of char
		System.out.println("Count: " + count);
	}
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
