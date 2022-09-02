import java.util.Scanner;

public class problem18 {

	public static void main(String[] args) {
		// Ask user if their group has anyone vegetarian, 
		System.out.println("Is anyone in your party vegetarian? ");
		String answer00 = extracted().nextLine();
		
		if (answer00.equalsIgnoreCase("yes")) {
			System.out.println("Is anyone in your party vegan? ");
			String answer01 = extracted().nextLine();
			if (answer01.equalsIgnoreCase("yes")) {
				System.out.println("Is anyone in your party Gluten-Free? ");
				String answer02 = extracted().nextLine();
				if (answer02.equalsIgnoreCase("yes")) {
					System.out.println("Corner Cafe" + '\n' + "The Chef's Kitchen");
				} else if (answer02.equalsIgnoreCase("no")) {
					System.out.println("Corner Cafe " + '\n' +
							"The Chef's Kitchen");
				}
			} else if (answer01.equalsIgnoreCase("no")) {
				System.out.println("Is anyone in your party Gluten-Free? ");
				String answer02 = extracted().nextLine();
				if (answer02.equalsIgnoreCase("yes")) {
					System.out.println("Main Street Pizza Company " + '\n' +
							"Corner Cafe " + '\n' +
							"The Chef's Kitchen");
				}
			}
		} else if (answer00.equalsIgnoreCase("no")) {
			System.out.println("Is anyone in your party vegan? ");
			String answer01 = extracted().nextLine();
			if (answer01.equalsIgnoreCase("no")) {
				System.out.println("Is anyone in your party Gluten-Free? ");
				String answer02 = extracted().nextLine();
				if (answer02.equalsIgnoreCase("no")) {
					System.out.println("Main Street Pizza Company " + '\n' +
										"Corner Cafe " + '\n' +
										"Mama's Fine Italian" + '\n' +
										"The Chef's Kitchen" + '\n' +
										"Joe's Gourmet Burgers");
				} else if (answer02.equalsIgnoreCase("yes")) {
					System.out.println("Main Street Pizza Company " + '\n' +
							"Corner Cafe " + '\n' +
							"The Chef's Kitchen" + '\n');
				}
			} else if (answer01.equalsIgnoreCase("yes")) {
				System.out.println("Is anyone in your party Gluten-Free? ");
				String answer02 = extracted().nextLine();
				if (answer02.equalsIgnoreCase("yes")) {
					System.out.println("Corner Cafe " + '\n' +
							"The Chef's Kitchen");
				} else if (answer02.equalsIgnoreCase("no")) {
					System.out.println("Corner Cafe " + '\n' +
							"The Chef's Kitchen");
				}
			}
			
		}
		
	}
	
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}

