import java.util.Scanner;

public class problemTwo {

	public static void main(String[] args) {
		String firstName, middleName, lastName; 	//The user's first. middle, and last name
		
		//Get user's first name
		System.out.print("What's your first name : ");
		firstName = new Scanner(System.in).nextLine();
		char firstInitial = firstName.charAt(0);	//The user's first initial
		
		//Get user's middle name
		System.out.print("What's your middle name : ");
		middleName = new Scanner(System.in).nextLine();
		char middleInitial = middleName.charAt(0);; //The user's middle initial
		
		//Get user's last name
		System.out.print("What's your last name : ");
		lastName = new Scanner(System.in).nextLine();
		char lastInitial = lastName.charAt(0);; //The user's last initial
		
		//Display the initials back to the user
		System.out.println("First Name : " + firstName + '\t' + " initial : " + firstInitial + '\n' +
							"Middle Name : " + middleName + '\t' + " initial : " + middleInitial + '\n' +
							"Last Name : " + lastName + '\t' + " initial : " + lastInitial);
		
	}

}
