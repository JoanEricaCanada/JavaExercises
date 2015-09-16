

public class GalToLit {
	public static void main(String args[]){
		double gallons, liters;
		
		for(gallons = 1; gallons <=100; gallons++){
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons is " + liters + " liters");
			
			if (gallons%10 == 0)
				System.out.println();
		}
		
		// code from the book
		int counter = 0;
		for(gallons = 1; gallons <=100; gallons++){
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons is " + liters + " liters");
			
			counter++;
			if (counter == 10){
				System.out.println();
				counter= 0;
			}
		}
	}
}
