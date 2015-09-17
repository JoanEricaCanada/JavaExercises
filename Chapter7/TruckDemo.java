
public class TruckDemo {
	public static void main(String [] args){
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck (3, 28, 15, 2000);
		int dist = 252;
		
		double gallons = semi.fuelneeded(dist);
		
		System.out.println("Semi can carry " + semi.getCargo() + "pounds."
				+ "To go " + dist + " miles semi needs " + gallons
				+ " gallons of fuel.\n");
		gallons = pickup.fuelneeded(dist);
		
		System.out.println("Pickup can carry " + pickup.getCargo() + "pounds."
				+ "To go " + dist + " miles pickup needs " + gallons
				+ " gallons of fuel.\n");
		
	}
}
