import java.util.Scanner;

public class problem01 {

	public static void main(String[] args) {
		// Hold and acquire user's number
		System.out.println("Is anyone in your party vegetarian? ");
		int userNum = extracted().nextInt();
		
		// The number to start
		int number = 1;
		
		// Loop that get the sum of all number up to user's number then displays it
		while (number <= userNum) {
			
			System.out.print(number + ", ");
			number++;
		}
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
