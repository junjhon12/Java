import java.util.ArrayList;

public class problem11 {

	public static void main(String[] args) {
		// Fields
		int[] Celsius_TEMP = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		ArrayList<Integer> Fahrenheit_TEMP = new ArrayList<Integer>();

		try {
			//Using for loop to calculate the 'Fahrenheit_TEMP'
			for (int i = 0; i < Celsius_TEMP.length; i++) {
				int formula = (((9/5)*Celsius_TEMP[i])+32);
				//Add the result into the 'Fahrenheit_TEMP' ArrayList
				Fahrenheit_TEMP.add(formula);
			}
			//Print the 'Fahrenheit_TEMP'  ArrayList
			System.out.println(Fahrenheit_TEMP);
		} catch (Exception e) {

		}
	}

}
