import java.util.Scanner;

public class problem08 {

	public static void main(String[] args) {
		
		int year,	// Number of years
			total,	// Accumulator for yearly rain
			month = 12,	// Number of months
			rain;	// Number of rain;
		double average;	// Average rain fall
		
		// Get number of years
		System.out.print("Years: ");
		year = extracted().nextInt();
		System.out.println("--------");
		
		// Process all yearly rain
		for (int i = 1; i <= year; i++) {
			total = 0;
			
			// Get rain for the month
			System.out.println("Year " + i + '\t');
			for (int j = 1; j <= month; j++) {
				System.out.print("Month " + j + ": ");
				rain = extracted().nextInt();
				total += rain; // Add rain amount to total
			}
			
			// Calculate and display average
			average = total / month;
			System.out.println("Average : " + average);
			System.out.println("--------");
		}
	}

	//Scanner object for input
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
