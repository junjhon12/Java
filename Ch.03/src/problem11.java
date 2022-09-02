import java.util.Scanner;

public class problem11 {

	public static void main(String[] args) {
		// Declare, store, and prompt user for three runners name 
		System.out.println("Name 1: ");
		String name01 = new Scanner(System.in).nextLine();
		System.out.println("Name 2: ");
		String name02 = new Scanner(System.in).nextLine();
		System.out.println("Name 3: ");
		String name03 = new Scanner(System.in).nextLine();

		// Declare, store ,and prompt user for the runner's time
		System.out.println(name01 + " time: ");
		Double time01 = new Scanner(System.in).nextDouble();
		System.out.println(name02 + " time: ");
		Double time02 = new Scanner(System.in).nextDouble();
		System.out.println(name03 + " time: ");
		Double time03 = new Scanner(System.in).nextDouble();
		
		// Conditional structure to determine each runners order
		if (time01 < time02 && time01 < time03) {
			if (time02<time03) {
				System.out.println("1st Place: " + name01 + 
						"\n2nd Place: " + name02 +
						"\n3rd Place: " + name03);
			} else {
				System.out.println("1st Place: " + name01 + 
						"\n2nd Place: " + name03 +
						"\n3rd Place: " + name02);
			}
		}else if (time02 < time01 && time02 < time03) {
			if (time01<time03) {
				System.out.println("1st Place: " + name02 + 
						"\n2nd Place: " + name01 +
						"\n3rd Place: " + name03);
			} else {
				System.out.println("1st Place: " + name02 + 
						"\n2nd Place: " + name03 +
						"\n3rd Place: " + name01);
			}
		}else if (time03 < time02 && time03 < time01) {
			if (time02<time01) {
				System.out.println("1st Place: " + name03 + 
						"\n2nd Place: " + name02 +
						"\n3rd Place: " + name01);
			} else {
				System.out.println("1st Place: " + name03 + 
						"\n2nd Place: " + name01 +
						"\n3rd Place: " + name02);
			}
		}
	}

}
