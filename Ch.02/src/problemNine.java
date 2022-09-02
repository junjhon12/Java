import java.util.Scanner;

public class problemNine {

	public static void main(String[] args) {
		int testOne = 0; //Holds the first test grade
		int testTwo = 0; //Holds the second test grade
		int testThree = 0; //Holds the third test grade
		
		//Retrieved user's test one score
		System.out.print("Test one score: ");
		testOne = new Scanner(System.in).nextInt();
		//Retrieved user's test two score
		System.out.print("Test two score: ");
		testTwo = new Scanner(System.in).nextInt();
		//Retrieved user's test one score
		System.out.print("Test three score: ");
		testThree = new Scanner(System.in).nextInt();
		
		//Calculate the average of the tests then displays it
		double avg = (testOne+testTwo+testThree)/3;
		System.out.println("Average: " + avg);

	}

}
