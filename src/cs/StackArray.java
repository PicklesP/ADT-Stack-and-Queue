/**
   An implementation of an ADT Stack using a fixed size array.
   @author Angel Jauregui
   @version 1.0
*/

package cs;

public class StackArray<T> implements StackInterface {
	
	private final T[] array;
	private int numElements;
	
	public StackArray(){
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[]) new Object[10];
		array = tempArray;
		numElements = 0;
	}

	@Override
	public void push(Object newEntry) {
		if(numElements >= array.length)
			throw new IllegalStateException("Unable to add a new object to stack, stack is full.");
		array[numElements] = (T) newEntry;
		numElements++;
	}

	@Override
	public Object pop() {
		Object obj = array[numElements];
		array[numElements] = null;
		numElements--;
		return obj;
	}

	@Override
	public Object peek() {
		return array[numElements];
	}

	@Override
	public boolean isEmpty() {
		return (numElements == 0);
	}

	@Override
	public void clear() {
		for(int i = numElements; i >= 0; i--)
			array[numElements] = null;
	}
}
