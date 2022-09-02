import java.util.Scanner;

public class problem17 {

	public static void main(String[] args) {
		// Ask user whether the Wi-Fi connection is fix or not
		System.out.println("Reboot the computer and try to connect " + '\n' +
							"Did that fix the problem? ");
		String answer00 = extracted().nextLine();
		
		if (answer00.equalsIgnoreCase("yes")){
			System.out.println("Finish");
		} else {
			System.out.println("Reboot the router and try to connect " + '\n' +
					"Did that fix the problem? ");
			String answer01 = extracted().nextLine();
			if (answer01.equalsIgnoreCase("yes")) {
				System.out.println("Finish");
			} else {
				System.out.println("Make sure the cables between the router & modem are plugged in firmly " + '\n' +
						"Did that fix the problem? ");
				String answer02 = extracted().nextLine();
				if (answer02.equalsIgnoreCase("yes")) {
					System.out.println("Finish");
				} else {
					System.out.println("Move the router to a new location " + '\n' +
							"Did that fix the problem? ");
					String answer03 = extracted().nextLine();
					if (answer03.equalsIgnoreCase("yes")) {
						System.out.println("Finish");
					} else {
						System.out.println("Get a new router");
					}
				}
			}
		}

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
