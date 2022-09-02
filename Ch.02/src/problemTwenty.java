import java.util.Scanner;

public class problemTwenty {

	public static void main(String[] args) {
		//Holds and acquire the length of row, in feet
		System.out.println("Length of row, in feet: ");
		double R = new Scanner(System.in).nextDouble();
		
		//Holds and acquire the space used by an end-post assembly
		System.out.println("The space used by end-post: ");
		double E = new Scanner(System.in).nextDouble();
		
		//Holds and acquire space between vines, in feet
		System.out.println("Space between vines, in feet: ");
		double S = new Scanner(System.in).nextDouble();
		
		//Holds the number of grapevines that'll fit in the row
		double V = ((R-(2*E))/S);
		
		//Display the number of grapevines that'll fit in the row
		System.out.println("Number of grapevines that will fit in the row" + V);

	}

}
