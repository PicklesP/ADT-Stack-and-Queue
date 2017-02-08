package cs;

import cs.QueueSingleLinked.Node;

public class QueueCircularLinked {

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
