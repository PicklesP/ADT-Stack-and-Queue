package cs;

public class QueueArray<T> implements QueueInterface{

	private final T[] array;
	private int numElements;
	private int front;
	private int back;
	
	public QueueArray(){
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[]) new Object[10];
		array = tempArray;
		numElements = 0;
		front = 0;
		back = 1;
	}
	
	@Override
	public void enqueue(Object newEntry) {
		int newBack;
		if(back == array.length - 1)
			newBack = 0;
		else
			newBack = back + 1;
		if(array[newBack] != null)
			throw new IllegalStateException("Cannot add to the queue, this queue is currently full.");
		back = newBack;
		array[back] = (T) newEntry;
	}

	@Override
	public Object dequeue() {
		int newFront;
		if(front == array.length - 1;)
			newFront = 0;
		else
			newFront = front + 1;
		if(array[newFront] == null)
			throw new IllegalStateException("Cannot dequeue, since there is nothing in the queue");
		Object obj = array[front];
		array[front] = null;
		front = newFront;
		return obj;
	}

	@Override
	public Object getFront() {
		return array[front];
	}

	@Override
	public boolean isEmpty() {
		return (front == back);
	}

	@Override
	public void clear() {
		for(int i = 0; i < array.length; i++)
			array[i] = null;
		front = 0;
		back = 0;
	}

}
