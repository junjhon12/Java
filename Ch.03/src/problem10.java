import java.util.Scanner;

public class problem10 {

	public static void main(String[] args) {
		// Holds and acquire user's food calories
		System.out.println("Food calories: ");
		double calories = new Scanner(System.in).nextDouble();
		
		//Holds and acquire user's food fat grams
		System.out.println("Food grams: ");
		double grams = new Scanner(System.in).nextDouble();
		
		//Calculate Calories from fat
		double caloriesFat = grams * 9;
		
		//Calculate percent of calories from fat
		double percentCalories = caloriesFat % calories;
		
		if (caloriesFat < 0.3) {
			System.out.println("Food is low in fat");
		} else if (caloriesFat > 0.3) {
			System.out.println("Food is not low in fat");
		}
	}

}
  