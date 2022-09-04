import java.util.Scanner;

public class problem07 {

	public static void main(String[] args) {
		
		double occupiedRooms = 0;	// Holds number of occupied rooms
		double vacantRooms = 0;		// Holds number of rooms vacant
		double floors = 0;			// Holds number of floors
		double rooms = 0;			// Hold number of rooms
		double occupancyRate;
		
		// Get number of floors
		System.out.print("Enter number of floors: ");
		floors = extracted().nextInt();
	
		// Get number of floors, rooms, rooms occupied, and vacant rooms
		for (int i =1; i <= floors; i++) {

			if (floors < 1) {						// Break if floors is less than 1
				break;
			}				
			// Get number of rooms
			System.out.print("Floor " + i + " rooms: ");
			rooms += extracted().nextInt();			// Hold all number of rooms
			if (rooms < 10) {						// Break if rooms is less than 10
				break;
			}
			// Get number of rooms occupied
			System.out.print("Floor " + i + " rooms occupied: ");
			occupiedRooms += extracted().nextInt();	// Hold all number of occupied rooms
			if (occupiedRooms > rooms) {			// Break if occupied rooms is more than rooms
				break;
			}
		}
		
		// Calculates the Occupancy rate
		occupancyRate = occupiedRooms/rooms;
		// Calculates the Vacant rooms
		vacantRooms = rooms - occupiedRooms;
		System.out.println("\nRooms\tRooms Occupied\tRooms Vacant\tOccupancy rate" +
					"\n" + rooms + "\t" + occupiedRooms + "\t\t" + vacantRooms + "\t\t" + String.format("%.2f",occupancyRate));
	}
	
	//Scanner object for input
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
