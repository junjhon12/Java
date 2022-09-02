import java.util.Scanner;

public class problem15 {

	public static void main(String[] args) {
		// Hold and acquire user's checks a month
		System.out.println("Enter the # of checks in a month: ");
		double checks = extracted().nextInt();

		// Holds the bank's monthly fee
		double fee = 10.00;
		
		//Calculate and display user's total fees for the month
		if (checks < 20) {
			System.out.println("Total: " + (fee + (checks * 0.10)));
		} else if (checks >= 20 && checks <= 39) {
			System.out.println("Total: " + (fee + (checks * 0.08)));
		} else if (checks >= 40 && checks <= 59) {
			System.out.println("Total: " + (fee + (checks * 0.06)));
		} else if (checks <= 60) {
			System.out.println("Total: " + (fee + (checks * 0.04)));
		}
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
