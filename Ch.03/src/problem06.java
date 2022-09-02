import java.util.Scanner;

public class problem06 {

	public static void main(String[] args) {
		// Hold acquire user's seconds
		System.out.println("Enter a number in seconds: ");
		int seconds = new Scanner (System.in).nextInt();
		
		//Calculate and display user's seconds in minutes,hours, and days
		if (seconds >= 60 && seconds < 3600) {
			System.out.println("Minutes: " + seconds / 60);
		} else if (seconds > 60 && seconds >= 3600 && seconds < 864000) {
			System.out.println("Hours: " + seconds / 3600);
		}else if (seconds > 60 && seconds >= 864000) {
			System.out.println("Days: " + seconds / 864000);
		}else {
			System.out.println("Seconds: " + seconds);
		}
	
	}
}
