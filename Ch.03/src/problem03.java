import java.util.Scanner;

public class problem03 {

	public static void main(String[] args) {
		// Holds and acquire user's Weight, in pounds
		System.out.println("What is your weight, in pounds: ");
		double weight = new Scanner(System.in).nextDouble();
		
		// Holds and acquire user's height, in inches
		System.out.println("What is your height, in inches: ");
		double height = new Scanner(System.in).nextDouble();
		
		//Calculate and holds the user's BMI, Body mass index
		double BMI = weight * (Math.pow((703/height), 2));
		
		// Decides whether user is optimal weight, underweight, or overweight
		if (BMI >= 18.5 && BMI <= 25) {
			System.out.println("Weight is optimal");
		} else if (BMI < 18.5) {
			System.out.println("Weight is underweight");
		} else {
			System.out.println("Weight is overweight");
		}
	}
}
