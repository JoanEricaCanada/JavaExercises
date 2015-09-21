/*
public class IQDemo {
	public static void main (String [] args){
		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircularQueue q3 = new CircularQueue(10);
		
		//add and view content to fixed queue(q1)
		addContent('A', q1, 10, 0);
		viewContent(q1, "Contents of fixed queue: ", 10);
		
		//add and view content to dynamic queue(q2)
		addContent('Z', q2, 10, 0);
		viewContent(q2, "Contents of dynamic queue: ", 10);
		
		//add and view content to circular queue(q3)
		addContent('A', q3, 10, 0);
		viewContent(q3, "Contents of circular queue: ", 10);
		
		//adding more contents
		addContent('A', q3, 20, 10);
		viewContent(q3, "Contents of circular queue: ", 10);
		
		//store and consume
		System.out.println("Store and consume from circular queue.");
		for(int i = 0; i < 20; i++){
				q3.put((char) ('A' + i));
				System.out.print(q3.get());
		}
	}
	
	static void viewContent(ICharQ i, String msg, int size){
		char c;
		System.out.print(msg);
		for(int ctr = 0; ctr < size; ctr++){
			c = i.get();
			System.out.print(c);
		}
		System.out.println();
	}
	
	static void addContent(char start, ICharQ i, int size, int loc){
		for(; loc < size; loc++){
			if (start == 'Z')
				i.put((char) (start - loc));
			else
				i.put((char) (start + loc));
		}
	}
}
*/