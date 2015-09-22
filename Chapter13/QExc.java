
public class QExc {
	public class QueueFullException extends Exception{
		int size;
		QueueFullException(int s){size = s;}
		
		public String toString(){
			return "\nQueue is full. Maximumsize is " + size;
		}
	}
	
	public class QueueEmptyException extends Exception{
		public String toString(){
			return "\nQueue is empty.";
		}
	}
	
	
}
