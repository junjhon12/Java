import java.util.Scanner;

public class problem14 {

	public static void main(String[] args) {
		// Hold and acquire user's phone service provider
		System.out.println("Phone service package; A ,B, or C:");
		String service = extracted().nextLine();
		
		// Hold and acquire user's minutes used
		System.out.println("Minutes used: ");
		int minuteUsed = extracted().nextInt();
		
		// Calculate and display the monthly bill
		double monthlyCost;
		int minutesProvided;
		
		switch(service) {
		case ("A"): monthlyCost = 39.99;
					minutesProvided = 450;
					if ((minuteUsed-minutesProvided)*0.45 < 0) {
						minutesProvided= 0;
						minuteUsed = 0;
					} else if ((minuteUsed-minutesProvided)*0.45 > 59.99 && (minuteUsed-minutesProvided)*0.45 < 69.99) {
						System.out.println("We recommend getting Package B");
					} else if ((minuteUsed-minutesProvided)*0.45 > 69.99) {
						System.out.println("We recommend getting Package C");
					}
		System.out.println("Monthly Bill: " + (monthlyCost + ((minuteUsed-minutesProvided)*0.45)));
		break;
		case ("a"): monthlyCost = 39.99;
					minutesProvided = 450;
					if ((minuteUsed-minutesProvided)*0.45 < 0) {
						minutesProvided = 0;
						minuteUsed = 0;
					} else if ((minuteUsed-minutesProvided)*0.45 > 59.99 && (minuteUsed-minutesProvided)*0.45 < 69.99) {
						System.out.println("We recommend getting Package B");
					} else if ((minuteUsed-minutesProvided)*0.45 > 69.99) {
						System.out.println("We recommend getting Package C");
					}
		System.out.println("Monthly Bill: " + (monthlyCost + ((minuteUsed-minutesProvided)*0.45)));
		break;
		case ("B"): monthlyCost = 59.99;
				minutesProvided = 900;
				if ((minuteUsed-minutesProvided)*0.40 < 0) {
					minutesProvided = 0;
					minuteUsed = 0;
				} else if ((minuteUsed-minutesProvided)*0.40 > 69.99) {
					System.out.println("We recommend getting Package C");
				}
		System.out.println("Monthly Bill: " + (monthlyCost + ((minuteUsed-minutesProvided)*0.40)));
		break;
		case ("b"): monthlyCost = 59.99;
				minutesProvided = 900;
				if ((minuteUsed-minutesProvided)*0.40 < 0) {
					minutesProvided = 0;
					minuteUsed = 0;
				} else if ((minuteUsed-minutesProvided)*0.40 > 69.99) {
					System.out.println("We recommend getting Package C");
				}
		System.out.println("Monthly Bill: " + (monthlyCost + ((minuteUsed-minutesProvided)*0.40)));
		break;
		case ("C"): monthlyCost = 69.99;
		System.out.println("Monthly Bill: " + (monthlyCost));
		break;
		case ("c"): monthlyCost = 69.99;
		System.out.println("Monthly Bill: " + (monthlyCost));
		break;
		default: System.out.println("ERROR");
		}
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
