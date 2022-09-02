import java.util.Scanner;

public class problemSeventeen {

	public static void main(String[] args) {
		//Holds the count of cookies
		int cookies = 0;
		
		//Holds the amount of sugar needed for 48 cookies
		double sugar = 1.5/48;
		
		//Holds the amount of butter needed for 48 cookies
		double butter = 1.0/48;
		
		//Holds the amount of flour needed for 48 cookies
		double flour = 2.75/48;
		
		//Acquired user's cookies amount
		System.out.println("How many cookies do you want: ");
		cookies = new Scanner(System.in).nextInt();
		
		//Displays the amount of ingredients needed to make user's count of cookies
		System.out.println("Cups of Sugar: " + (sugar*cookies) + '\n' +
							"CUps of butter: " + (butter*cookies) + '\n' +
							"Cups of flour: " + (flour*cookies) + '\n');
	}

}
