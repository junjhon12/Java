import java.util.Scanner;

public class problem04 {

	public static void main(String[] args) {
		//Hold and acquire test score 1, 2, and 3
		System.out.println("Test 1: ");
		int test1 = new Scanner(System.in).nextInt();
		System.out.println("Test 2: ");
		int test2 = new Scanner(System.in).nextInt();
		System.out.println("Test 3: ");
		int test3 = new Scanner(System.in).nextInt();
		
		//Calculate and display the average test score
		int testAverage = (test1+test2+test3) / 3;
		System.out.println("Average: " + testAverage);
		
		//Determines the Letter grade using the test average
		if (testAverage >= 90 && testAverage <= 100) {
			System.out.println("A");
		} else if (testAverage >= 80 && testAverage <= 89) {
			System.out.println("B");
		} else if (testAverage >= 70 && testAverage <= 79) {
			System.out.println("C");
		} else if (testAverage >= 60 && testAverage <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
