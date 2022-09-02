
public class problemFifteen {

	public static void main(String[] args) {
		
		//Holds the number of stocks
		int stocks = 600;
		
		//Holds the price of stock per share
		double price = 21.77;
		
		//Holds the stock broker share of commission
		double stockBroker = 0.02;
		
		//Display the total cost of the stock, amount of commission, and total cost for everything
		System.out.println("Amount paid for the stock alone: $" + (stocks*21.77) + '\n' +
							"Amount for commission: $" + ((stocks*21.77)*0.02) + '\n' +
							"Total cost for everything: $" + ((stocks*21.77)+((stocks*21.77)*0.02)));
		

	}

}
