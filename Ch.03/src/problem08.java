import java.util.Scanner;

public class problem08 {

	public static void main(String[] args) {
		//Holds and acquire user's package amount
		System.out.println("Number of packages: ");
		double packages = new Scanner(System.in).nextInt();
		
		//Holds package price
		double price = 99*packages;
		
		//Calculate and display the discount and amount after
		if (packages >= 10 && packages <= 19) {
			double discount = 0.20;
			System.out.println("Discount: " + discount + '\n' +
								"Total amount: " + (price - (discount*price)));
		} else	if (packages >= 20 && packages <= 49) {
			double discount = 0.30;
			System.out.println("Discount: " + discount + '\n' +
								"Total amount: " + (price - (discount*price)));
		}else	if (packages >= 50 && packages <= 99) {
			double discount = 0.40;
			System.out.println("Discount: " + discount + '\n' +
								"Total amount: " + (price - (discount*price)));
		}else 	if (packages >= 100) {
			double discount = 0.50;
			System.out.println("Discount: " + discount + '\n' +
								"Total amount: " + (price - (discount*price)));
		}else {
			System.out.println("Discount: N/A" + '\n' +
					"Total amount: " + price);
		}
	}

}
