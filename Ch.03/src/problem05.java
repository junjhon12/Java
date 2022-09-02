import java.util.Scanner;

public class problem05 {

	public static void main(String[] args) {
		// Holds and acquire user's object's mass
		System.out.println("Object's Mass: ");
		double mass = new Scanner(System.in).nextDouble();
		
		// Calculate and display the weight of the object
		double weight = mass * 9.8;
		System.out.println("Object's Weight: ");

		//Determines whether the object is too heavy or too light
		if (weight >= 1000) {
			System.out.println("Too heavy");
		} else if (weight < 10) {
			System.out.println("Too light");
		} else {
			System.out.println("Fine");
		}
	}

}
