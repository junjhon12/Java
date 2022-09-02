import java.util.Scanner;

public class problemEleven {

	public static void main(String[] args) {
		String city; //Hold user's favorite city
		
		//Get user's favorite city name
		System.out.print("What is the name of your favorite city: ");
		city = new Scanner(System.in).nextLine();
		
		//Displays the user's input number of characters, city in uppercase and lowercase, and first character
		System.out.println("City: " + city + '/' + 
							"Number of Char: " + city.length() + '\n' +
							"All uppercase: " + city.toUpperCase() + '\n' +
							"All lowercase: " + city.toLowerCase() + '\n' +
							"First Char: " + city.charAt(0));
		

	}

}
