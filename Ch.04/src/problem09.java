import java.util.Scanner;

public class Problem09 {

	public static void main(String[] args) {
		try (// Scanner class
		Scanner input = new Scanner(System.in)) {
			// Fields
			int START_NUM = 0;	// Holds starting population number
			int NUM_DAYS = 0;	// Holds the days the population will increase
			double POP_INCREASE = 0;	// Holds the increase percentage per day
			
			// Check starting number and acquire
			while(true) {
				if (START_NUM < 2) {
					System.out.println("Starting Number: ");
					START_NUM = input.nextInt();
				}
				if (POP_INCREASE < 0) {
					System.out.println("Increase Percentage: ");
					POP_INCREASE = input.nextDouble();
				}
				if (NUM_DAYS < 1) {
					System.out.println("Number of days: ");
					NUM_DAYS = input.nextInt();
				}
				else {
					break;
				}
			}
			
			// Get user's input for each fields
			System.out.println("Increase Percentage: ");
			POP_INCREASE = input.nextDouble();
			
			// Display the progress of each day
			for (int i = 0 ; i <= NUM_DAYS; i++) {
				System.out.println("Day " + i + " Population: " + START_NUM);
				START_NUM += (POP_INCREASE * START_NUM);
			}
			
			
			
		} catch (Exception error) {
			System.out.println("ERROR");
		}

	}

}
