import java.util.Scanner;

public class problemSeven {

	public static void main(String[] args) {
		int bagOfCookies = 40; //Holds the amount of cookies in one bag
		int servings = 10; //Holds the amount of servings in one bag
		int calories = 300; //Holds the total number of calories in one bag
		int calPerCookies = calories/(bagOfCookies/servings); //Holds the calories per cookies
		
		//Retrieve's user's number of eaten cookies
		System.out.print("How many cookies did you ate: ");
		int cookiesEaten = new Scanner(System.in).nextInt();
		
		//Display number of cookies eaten and calories amount
		System.out.println("Number of cookes eaten: " + cookiesEaten + '\n' +
							"Number of total calories consumed: " + (calPerCookies * cookiesEaten));
	}

}
