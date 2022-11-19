import java.util.ArrayList;
import java.util.Scanner;

public class problem12 {

	public static void main(String[] args) {

		// Fields
		final int STORES = 5;
		int SALES_INPUT = 0;
		ArrayList<Integer> TODAY_SALES = new ArrayList<Integer>();
		int stars = 0;
		
		//Get user input for each store
		for(int i = 0; i < STORES; i++) {
			System.out.print("Enter today's sales for store " + (i+1) + ": ");
			SALES_INPUT = new Scanner(System.in).nextInt();
			//Stores the input into an arrayList
			TODAY_SALES.add(SALES_INPUT);
		}
		
		System.out.println("\n" + "SALES BAR CHART");
		//Prints out each store
		for(int j = 0; j < TODAY_SALES.size(); j++) {
			System.out.print("Store " + (j+1) + ": ");
			stars = TODAY_SALES.get(j)/100;
			//Per store display the earning by '*' for each 100$
			for(int k = 0; k <= stars; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
