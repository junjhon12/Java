import java.util.Scanner;
public class problemTen {

	public static void main(String[] args) {
		double circuitBoards = 0.40; //Holds the company percent profit from circuits
		int retailPrice; //Holds the user's retail price of circuit board
		
		//Retrieved the user's retail price
		System.out.println("What is the retail price of the circuit board: ");
		retailPrice = new Scanner(System.in).nextInt();
		
		//Calculate then displays the profit
		double profit = retailPrice * circuitBoards;
		System.out.println("Profits earned by circuit boards is: " + profit);

	}

}
