import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {
		//Hold and acquire user's birth month in numeric form
		System.out.println("What month is your birthday, in numeric: ");
		int month = new Scanner(System.in).nextInt();
		
		//Hold and acquire user's birth day in numeric form
		System.out.println("What day is your birthday, in numeric: ");
		int day = new Scanner(System.in).nextInt();
		
		//Hold and acquire user's birth year in numeric form
		System.out.println("What year is your birthday, in two-digit: ");
		int year = new Scanner(System.in).nextInt();
		
		//Display birth my month/day/and year
		System.out.println(month + "/" + day + "/" + year);
		//Calculate whether user's birthday dates are magic
		if (month*day == year) {
			System.out.println("The date is magic");
		} else {
			System.out.println("The date isn't magic");
		}
	}

}
