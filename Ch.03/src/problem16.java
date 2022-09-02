import java.util.Scanner;

public class problem16 {

	public static void main(String[] args) {
		// Hold and acquire user's book purchases
		System.out.println("Books for the month: ");
		int books = extracted().nextInt();
		
		// Determines then display user's points
		switch(books) {
		case 0: System.out.println("Points: 0");
		break;
		case 1: System.out.println("Points: 5");
		break;
		case 2: System.out.println("Points: 15");
		break;
		case 3: System.out.println("Points: 30");
		break;
		} if (books >= 4) {
			System.out.println("Points: 60");
		}

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
