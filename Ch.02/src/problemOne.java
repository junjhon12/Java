import java.util.Scanner;

public class problemOne {

	public static void main(String[] args) {
		String name; 				//The user's name
  		int age; 					//The user's age
		double annualIncome;		//The user's annual income
		
		//Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		//Get user's name
		System.out.print("What's your name : ");
		name = keyboard.nextLine();
		
		//Get user's age
		System.out.print("What's your age : ");
		age = keyboard.nextInt();
		
		//Get user;s annual income
		System.out.print("What's your annual income : ");
		annualIncome = keyboard.nextDouble();
		
		//Display the information back to user
		System.out.println("My name is "+name+", my age is "+age+" and I hope to earn $"+annualIncome+" per year.");
	}

}
