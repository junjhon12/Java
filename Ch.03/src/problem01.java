import java.util.Scanner;

public class problem01 {

	public static void main(String[] args) {
		// Hold and acquire suer's number from 1-10
		System.out.println("Enter a number within 1 - 10: ");
		int number = new Scanner(System.in).nextInt();

		//Translate number to Roman Numerals
		switch(number) {
		case 1: System.out.println("Roman Numeral form: I");
		break;
		case 2: System.out.println("Roman Numeral form: II");
		break;
		case 3: System.out.println("Roman Numeral form: III");
		break;
		case 4: System.out.println("Roman Numeral form: IV");
		break;
		case 5: System.out.println("Roman Numeral form: V");
		break;
		case 6: System.out.println("Roman Numeral form: VI");
		break;
		case 7: System.out.println("Roman Numeral form: VII");
		break;
		case 8: System.out.println("Roman Numeral form: VIII");
		break;
		case 9: System.out.println("Roman Numeral form: IX");
		break;
		case 10: System.out.println("Roman Numeral form: X");
		break;
		default: System.out.println("ERROR");
		}
	}

}
