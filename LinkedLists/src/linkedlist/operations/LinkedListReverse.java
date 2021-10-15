package linkedlist.operations;

import linkedlist.basic.Node;

public class LinkedListReverse {
	
	public Node reverseList(Node head) {
		Node current = head;
		Node previous = null;
		Node next = null;
		
		while(current != null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public void viewList(Node head) {
		Node n = head;
		if(n == null) {
			System.out.println("List is empty!!");
		}
		while(n != null) {
			System.out.print(" " + n.getData());
			n = n.getNext();
		}
	}
}	
