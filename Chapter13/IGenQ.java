
public interface IGenQ<T> {
	void put (T ch) throws QExc.QueueFullException;
	T get() throws QExc.QueueEmptyException;

}
