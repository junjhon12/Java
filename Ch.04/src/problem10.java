import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problem10 {

	public static void main(String[] args) {
		// Fields
		int INPUT_NUM = 0; // Initialization
		int END_NUM = -99; // Initialization
		boolean stop = false; //Initialization
		ArrayList<Integer> al = new ArrayList<Integer>();

		try {
			while (stop != true) {
				System.out.println("Enter number: ");
				INPUT_NUM = new Scanner(System.in).nextInt();
				al.add(INPUT_NUM);
				if (INPUT_NUM == END_NUM) {
					stop = true;
					al.remove(Integer.valueOf(1));
				}
				Collections.sort(al);
				System.out.println(al.toString());
			}
		} catch (Exception e) {

		}
	}

}
/**
 * Write a program with a loop that lets the user enter a series of integers.
 * The user should enter -99 to signal the end of the series. After all the
 * numbers have been entered, the program should display the largest and
 * smallest numbers entered.
 */