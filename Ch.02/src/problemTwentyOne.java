import java.util.Scanner;

public class problemTwentyOne {

	public static void main(String[] args) {
		//Holds and acquire amount originally deposited in account
		System.out.println("Amount deposit: ");
		double P = new Scanner(System.in).nextDouble();

		//Holds and acquire annual interest rate
		System.out.println("Annual interest rate, as percent: ");
		double r = new Scanner(System.in).nextDouble();
		
		//Holds and acquire number of times per year interest is compounded
		System.out.println("Time per year interest is compounded: ");
		double n = new Scanner(System.in).nextDouble();
		
		//Holds and acquire number of years account weill be left to earn interest
		System.out.println("Number of years left alone: ");
		double t = new Scanner(System.in).nextDouble();
		
		//Calculate and display amount earn after many years
		double A = P * (Math.pow((1 + (r/n)), n*t));
		System.out.println(A);
	}

}
