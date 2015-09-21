

public class QExcDemo {
	public static void main(String [] args){
		FixedQueue q = new FixedQueue (10);
		int i;
		
		//putting characters to q
		try{
			for (i = 0; i <11; i++){
				System.out.print("Attempting to store: " + (char)('A' + i));
				q.put((char) ('A' + i));
				System.out.println(" - OK");
			}
		}catch (QueueFullException exc){
			System.out.println(exc);
		}
		System.out.println();
		
		//getting characters from q
		try{
			for (i = 0; i <11; i++){
				System.out.print("Getting next char: ");
				char ch = q.get();
				System.out.println(ch);
			}
		}catch (QueueEmptyException exc){
			System.out.println(exc);
		}
		System.out.println();
	}
}
