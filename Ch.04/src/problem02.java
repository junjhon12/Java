import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {

		// Constants
		int STARTING_TIME; 	//Starting time
		
		// Variables
		System.out.println("Speed, in MPH: ");
		int speed = extracted().nextInt(); 	//Holds speed, in mph
		System.out.println("Time, in hours: ");
		int time = extracted().nextInt(); 	//Holds time in hours
		int distance; 									//Holds distance in miles
		
		// Display headings
		System.out.println("\nHour\tDistance Traveled");
		
		// Display the speed
		for (STARTING_TIME = 1; STARTING_TIME <= time; STARTING_TIME++) {
			
			//Stop the loop if the speed is lower than 0
			if (speed < 0 || time < 1) {
				System.out.println("ERROR");
				break;
			}
			
			// Calculate the distance
			distance = speed * STARTING_TIME;
			
			// Displays the time and distance
			System.out.println(STARTING_TIME + "\t" + distance);
			
		}
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
