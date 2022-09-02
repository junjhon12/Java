import java.util.Scanner;

public class problemThree {

	public static void main(String[] args) {
		String name, address,collegeMajor;	//The user's name, address,and college major
		int telephoneNumber; //The user ZIP and telephone number

		//Get user's name
		System.out.print("What is your name : ");
		name = new Scanner(System.in).nextLine();
		
		//Get user's address
		System.out.print("What is your address, with city, state, and ZIP code : ");
		address = new Scanner(System.in).nextLine();
		
		//Get user's college major
		System.out.print("What is your college major : ");
		collegeMajor = new Scanner(System.in).nextLine();
		
		//Get user's telephone number
		System.out.print("What is your telephone number : ");
		telephoneNumber = new Scanner(System.in).nextInt();
		
		//Display the initials back to the user
		System.out.println("Name: " + name + '\n' +
							"Address: " + address + '\n' +
							"College major: " + collegeMajor + '\n' +
							"Telephone number: " + telephoneNumber);
	}

}
