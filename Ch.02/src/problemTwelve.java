import java.util.Scanner;

public class problemTwelve {

	public static void main(String[] args) {
		//Acquire and store ueser's meal price
		double mealPrice = new Scanner(System.in).nextInt();
		
		//Store's the tax of the meal
		double tax = (0.0675*mealPrice);
		
		//Store's the tip for the meal after tax
		double tip = 0.20*(mealPrice-tax);
		
		//Displays the cost of the meal, tax, tip ,and total bill
		System.out.println("The cost of the meal: " + mealPrice + '\n' +
							"Tax: " + tax + '\n' +
							"Tip: " + tip + '\n' +
							"Total price: " + (mealPrice+tax+tip));
	}

}
