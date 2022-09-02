
public class problemFour {

	public static void main(String[] args) {
		double salesPercent = 0.62; //The company's percent in total sales
		double sales = 4.6; //The company's yearly sales
		double totalGenerated = salesPercent * sales; //THe East Coast's generate amount
		
		//Calculates East Coast sales then displays it
		System.out.println("$ "+ totalGenerated * 1000000);
	}

}
