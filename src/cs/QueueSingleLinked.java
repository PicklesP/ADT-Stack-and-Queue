package cs;

public class QueueSingleLinked<T> implements QueueInterface {

	private Node firstNode;
	private Node lastNode;
	
	public QueueSingleLinked(){
		firstNode = null;
		lastNode = null;
	}
	
	@Override
	public void enqueue(Object newEntry) {
		Node newNode = new Node(newEntry, null);
		if(isEmpty())
			firstNode = newNode;
		else
			lastNode.setNextNode(newNode);
		
		lastNode = newNode;
		
	}

	@Override
	public Object dequeue() {
		T front = null;
		if(!isEmpty()){
			front = (T) firstNode.getData();
			firstNode = firstNode.getNextNode();
			
			if(firstNode == null)
				lastNode = null;
		}
		return front;
	}

	@Override
	public Object getFront() {
		T front = null;
		if(!isEmpty()){
			front = (T) firstNode.getData();
		}
		return front;
	}

	@Override
	public boolean isEmpty() {
		return(firstNode == null && lastNode == null);
	}

	@Override
	public void clear() {
		firstNode = null;
		lastNode = null;
		
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
