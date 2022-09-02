import java.util.Scanner;

public class problem12 {

	public static void main(String[] args) {
		// Hold and acquire user's medium
		System.out.println("Choose a medium; Air, Water, or Steel: ");
		String medium = extracted().nextLine();
		
		// Hold and acquire user's distance the sound wave travel
		System.out.println("Distant, in feet: ");
		double distance = extracted().nextDouble();
		
		// Calculate and display the time
		double speed;
		switch(medium) {
		case ("Air"): speed = 1100;
		System.out.println("Time: " + (distance/speed));
		break;
		case ("air"): speed = 1100;
		System.out.println("Time: " + (distance/speed));
		break;
		case ("Water"): speed = 4900;
		System.out.println("Time: " + (distance/speed));
		break;
		case ("water"): speed = 4900;
		System.out.println("Time: " + (distance/speed));
		break;
		case ("Steel"): speed = 16400;
		System.out.println("Time: " + (distance/speed));
		break;
		case ("steel"): speed = 16400;
		System.out.println("Time: " + (distance/speed));
		break;
		default: System.out.println("ERROR");
		}

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
