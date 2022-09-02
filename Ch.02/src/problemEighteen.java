import java.util.Scanner;

public class problemEighteen {

	public static void main(String[] args) {
		//Holds user name
		System.out.println("Name: ");
		String name = new Scanner(System.in).nextLine();
		
		//Holds user age
		System.out.println("Age: ");
		int age = new Scanner(System.in).nextInt();
		
		//Holds user city name
		System.out.println("City name: ");
		String cityName = new Scanner(System.in).nextLine();
		
		//Holds user college name
		System.out.println("College name: ");
		String collegeName = new Scanner(System.in).nextLine();
		
		//Holds user profession
		System.out.println("Profession: ");
		String profession = new Scanner(System.in).nextLine();
		
		//Holds user pet type
		System.out.println("Type of pet: ");
		String pet = new Scanner(System.in).nextLine();
		
		//Holds user pet name
		System.out.println("Pet name: ");
		String petName = new Scanner(System.in).nextLine();
		
		//Display users info in a sentence
		System.out.println("There once was a person named " + name + " who lived in " + cityName + ". At the age of " + age + "," + '\n' +
							name + " wentto college at " + collegeName + ". " + name + " graduated and went to work as a " + '\n' +
							profession + ". Then, " + name + " adopted a(n) " + pet + " named " + petName + ". They both lived" + '\n' +
							" happily ever after!");
	}

}
