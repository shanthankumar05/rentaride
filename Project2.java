// As a customer to Rent a Ride, you book a cab. We charge you as per the distance covered. We charge 8rs/km.

// The moment you click the button to RIDE, we search for the nearby drivers who will accept your ride.

// Suppose there are 15 drivers near your location, then we send the request to the first driver who is closest to you, then the second, and so on.

// There are a few conditions though, on the basis of which we cannot send the request to the nearby driver.


carInformation.java
// -----------------------
  
public class CarInformation {
	
		char[] driver = { 'A', 'B', 'C','D', 'E' };
		String[] carmodel = { "Sedan", "HatchBack", "5Seater", "Sedan", "HatchBack" };
		double[] rating = { 4, 4.3, 4.8, 4.1, 4.7 };
		int[] distance = { 500, 1, 200, 700, 430 };
		public void CarInformations() {
		System.out.println("List of Drivers with Details: ");
		System.out.println("Driver" + "Car Model" + "Rating" + "DistanceFromCustomer");
		for (int i = 0; i < 5; i++) {
			System.out.println(" "+driver[i] +" "+ carmodel[i]+" " + rating[i]+" " + distance[i]);

		}

	}

}


RideDetails.java

// --------------
import java.util.Scanner;
public class RideDetails extends CarInformation {
	public static void main(String[] args) {

		final int charge = 8;
		double total_charge;
		char cardriver;
		int mindis = 999999;
		String carname;
		Scanner sc = new Scanner(System.in);
		System.out.print("Customer Ride Distance: ");
		double distance = sc.nextDouble();
		System.out.println("car requested");
		carname = sc.next();
		RideDetails r = new RideDetails();
		//CarInformation i = new CarInformation();
		r.CarInformations();
		for (int j = 0; j < 5; j++) {
			
			if (r.carmodel[j].equals(carname)&& r.rating[j] >= 4) {
				

				if (mindis > r.distance[j]) {
					mindis = r.distance[j];
					cardriver = r.driver[j];
				    System.out.println("Driver " + cardriver+ "will get you to the destination");


				}
			}

		}
		
		total_charge = distance * 8;

		System.out.println("Your charge will be " + total_charge);

	}
}
