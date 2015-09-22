
public class TrafficLightDemo {
	public static void main(String args[]){
		//code from the book:
		//BUG: wrong use since TrafficLightColor is at a different class
		/*TrafficLightSimulator tl = new TrafficLightSimulator
				(TrafficLightColor.GREEN);*/
		TrafficLightSimulator tl = new TrafficLightSimulator
				(TrafficLightSimulator.TrafficLightColor.GREEN);
		
		for(int i = 0; i <9; i++){
			System.out.println(tl.getColor());
			tl.waitForChange();
		}
		tl.cancel();
	}

}
