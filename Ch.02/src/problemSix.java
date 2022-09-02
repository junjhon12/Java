import java.util.Scanner;

public class problemSix {

	public static void main(String[] args) {
		int purchaseAmount; //Holds the user's amount of purchases
		double stateTax = 0.04; //Holds the sales tax
		double countyTax= 0.02; //Holds the county sales tax
		
		//Retrieved user's purchase amount
		System.out.print("How much is your purchase amount: $ ");
		purchaseAmount = new Scanner(System.in).nextInt();
		
		//Calculate the total sale with both taxes and user's purchase amount then displays it
		System.out.println("Purchase amount: $ " + purchaseAmount + '\n' +
							"States Sales Tax: % " + stateTax + '\n' +
							"County Sales Tax: % " + countyTax + '\n' +
							"Total of the sale: $" + (purchaseAmount + (stateTax * purchaseAmount) + (countyTax * purchaseAmount)));
	}

}
