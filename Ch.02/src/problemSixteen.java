
public class problemSixteen {

	public static void main(String[] args) {
		//Holds the surveyed customer
		int customers = 12467;
		
		//Holds the percent that brought one or more drink a week
		double oneOrMore = 0.14;
		
		//Holds the percent that prefer citrus flavor
		double citrusFlavored = 0.64;
		
		//Calculate and display customers who purchase one or more a week
		System.out.println(customers*oneOrMore);
		
		//Calculate and display customers who prefer citrus
		System.out.println(customers*citrusFlavored);
	}

}
