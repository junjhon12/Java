import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class problem13 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		try {
			System.out.println("Enter file name: ");
			String fileName = input.next();
			
			//Open the file
			File file = new File(fileName);
			try (Scanner inputFile = new Scanner(file)) {
			}
			
			//Read the file
			BufferedReader bf = new BufferedReader(new FileReader(fileName));
			String line = null;
			int i = 0;
			
			//
			while(((line = bf.readLine()) != null) && i < 5) {
				System.out.println(line);
				i++;
			}
			
			bf.close();
		} catch (Exception e) {

		}
	}

}
