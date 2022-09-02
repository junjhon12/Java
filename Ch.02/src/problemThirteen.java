import java.util.Scanner;

public class problemThirteen {

	public static void main(String[] args) {
		//Acquired and stores the number of males in class
		System.out.println("How any males are in your class:" );
		double males = new Scanner(System.in).nextInt();
		
		//Acquired and stores the number of females in class
		System.out.println("How any females are in your class:" );
		double females = new Scanner(System.in).nextInt();
		
		//Calculate the display the percentage of males in your class
		double malesPercent = males/(males+females);
		System.out.println("Males percentage: " + malesPercent);
		
		//Calculate the display the percentage of females in your class
		double femalesPercent = females/(males+females);
		System.out.println("Males percentage: " + femalesPercent);
		
	}

}
