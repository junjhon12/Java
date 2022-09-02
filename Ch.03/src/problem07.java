import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem07 {
	public static void main(String[] args) {
		//Array list thta holds the 3 names
		ArrayList<String> names = new ArrayList<String>();
		
		//Acquire user's names
		System.out.println("Name 1: ");
		String name01 = new Scanner(System.in).nextLine();
		names.add(name01);
		System.out.println("Name 2: ");
		String name02 = new Scanner(System.in).nextLine();
		names.add(name02);
		System.out.println("Name 3: ");
		String name03 = new Scanner(System.in).nextLine();
		names.add(name03);
		
		//Sort the Array list names alphabetically
		Collections.sort(names);
		
		//Prints out the names in order
		System.out.println(names + "\n");
	}
}
