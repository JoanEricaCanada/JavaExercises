
public class GenQDemo {
	public static void main(String args[]){

		Integer iStore[] = new Integer [10];
		GenQueue<Integer> q = new GenQueue<Integer> (iStore);
		
		Integer iVal;
		
		System.out.println("Demonstrate a queue of Integers.");
		try{
			for (int i=0; i<5; i++){
				System.out.println("Adding " + i + " to the q.");
				q.put(i);
			}
		}catch (QExc.QueueFullException exc){
			System.out.println(exc);
		}
		System.out.println();
		
		try{
			for (int i=0; i<5; i++){
				System.out.print("Getting next Integer from q: ");
				iVal = q.get();
				System.out.println(iVal);
			}
		}catch (QExc.QueueEmptyException exc){
			System.out.println(exc);
		}
		System.out.println();
		
		//Double
		Double dStore[] = new Double [10];
		GenQueue<Double> q2 = new GenQueue<Double> (dStore);
		
		Double dVal;
		
		System.out.println("Demonstrate a queue of Doubles.");
		try{
			for (int i=0; i<5; i++){
				System.out.println("Adding " + (double)i/2 + " to the q2.");
				q2.put((double)i/2);
			}
		}catch (QExc.QueueFullException exc){
			System.out.println(exc);
		}
		System.out.println();
		
		try{
			for (int i=0; i<5; i++){
				System.out.print("Getting next Double from q: ");
				dVal = q2.get();
				System.out.println(dVal);
			}
		}catch (QExc.QueueEmptyException exc){
			System.out.println(exc);
		}
	}

}
