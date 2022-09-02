import java.util.Scanner;

public class problemEight {

	public static void main(String[] args) {
		double milesDriven = 0; //Hold miles driven
		double gallonUsed = 0; //Hold the number of gas used
		double milesPerGal; //Holds the miles per gallon calculation
		
		//Retrieved user's miles driven
		System.out.print("How much miles have you driven: ");
		milesDriven = new Scanner(System.in).nextInt();
		//Retrieved user's gas usage
		System.out.print("How much gallons did you used: ");
		gallonUsed = new Scanner(System.in).nextInt();
		
		//Calculate MPG(Miles per gallon) then display it
		milesPerGal = milesDriven/gallonUsed;
		System.out.println("MPG: " + milesPerGal);
	}

}
