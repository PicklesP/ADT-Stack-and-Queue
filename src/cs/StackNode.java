package cs;

public class StackNode<T> implements StackInterface {

	private Node topNode;
	private int numElements;
	
	public StackNode(){
		topNode = null;
	}
	
	@Override
	public void push(Object newEntry) {
		Node newNode;
		if(isEmpty())
			newNode = new Node(newEntry);
		else
			newNode = new Node(newEntry, topNode);
		topNode = newNode;
	}
	@Override
	public Object pop() {
		if(isEmpty())
			return null;
		T obj = (T) topNode.getData();
		topNode = topNode.getNextNode();
		return obj;
	}
	@Override
	public Object peek() {
		return topNode;
	}
	@Override
	public boolean isEmpty() {
		return (topNode == null);
	}
	@Override
	public void clear() {
		topNode = null;
	}

	private class Node<T> {
		private T data;
		private Node next;
		
		public Node(T item, Node nextNode){
			data = item;
			next = nextNode;
		}
		
		public Node(T item){
			this(item, null);
		}
		
		public T getData(){
			return data;
		}
		
		public void setData(T newData){
			data = newData;
		}
		
		private Node getNextNode(){
			return next;
		}
		
		private void setNextNode(Node nextNode){
			next = nextNode;
		}
	}
}
