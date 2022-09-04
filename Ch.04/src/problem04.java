import java.util.Scanner;

public class problem04 {

	public static void main(String[] args) {
		
		// Constants
		int STARTING_NUM = 1; // Starting number
		double money = 0.01; // starting penny
		
		// Variables
		System.out.println("Number of Days: ");	// Hold the number of days
		int days = extracted().nextInt();
		
		// Display headings
		System.out.println("\nDay\tAmount");
		
		// Checks before looping and displaying the 
		for (STARTING_NUM = 1; STARTING_NUM <= days; STARTING_NUM++) {
			// If days is less than 1, stop
			if (days < 0) {
				break;
			} else if (days == 1){
				System.out.println(STARTING_NUM + "\t" + money);
			} else {
				money *= 2;
				System.out.println(STARTING_NUM + "\t" + money);
			}
		}

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
