/**
   An implementation of ADT Stack using Vector
   @author Angel Jauregui
   @version 1.0
*/

package cs;

import java.util.Vector;

public class StackVector<T> implements StackInterface{

	private final Vector vector;
	private int numElements;
	
	public StackVector(){
		@SuppressWarnings("unchecked")
		Vector tempVector = new Vector(0, 1);
		vector = tempVector;
	}
	
	@Override
	public void push(Object newEntry) {
		vector.add(newEntry);
		numElements = vector.size();
	}

	@Override
	public Object pop() {
		Object obj = vector.lastElement();
		vector.removeElementAt(numElements);
		numElements = vector.size();
		return obj;
	}

	@Override
	public Object peek() {
		return vector.elementAt(numElements);
	}

	@Override
	public boolean isEmpty() {
		return (vector.isEmpty());
	}

	@Override
	public void clear() {
		vector.clear();
	}

}
