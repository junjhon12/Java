import java.util.Scanner;

public class problem09 {

	public static void main(String[] args) {
		//Hold and acquire user's weight of package
		System.out.println("Package's weight: ");
		int weight = new Scanner(System.in).nextInt();
		
		//Determines and display charges
		if (weight <= 2) {
			System.out.println("Charges: $1.10");
		} else if (weight > 2 && weight <= 6) {
			System.out.println("Charges: $2.10");
		} else if (weight > 6 && weight <= 10) {
			System.out.println("Charges: $3.70");
		} else {
			System.out.println("Charges: $3.80");
		}
	}

}
