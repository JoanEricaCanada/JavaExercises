
public class GenQueue <T> implements IGenQ<T>{
	private T q[];
	private int putloc, getloc;
	private QExc ex = new QExc();
	
	public GenQueue(T[] aRef){
		q = aRef;
		putloc = getloc = 0;
	}
	
	public void put(T obj)throws QExc.QueueFullException{
		if(putloc == q.length-1)
			throw ex.new QueueFullException(q.length-1);
		putloc++;
		q[putloc] = obj;
	}
	
	public T get() throws QExc.QueueEmptyException{
		if(getloc == putloc)
			throw ex.new QueueEmptyException();
		getloc++;
		return q[getloc];
	}
}
