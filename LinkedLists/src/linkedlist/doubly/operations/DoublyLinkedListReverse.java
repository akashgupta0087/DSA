package linkedlist.doubly.operations;

import linkedlist.doubly.basic.DoublyLinkedList;
import linkedlist.doubly.basic.dNode;

public class DoublyLinkedListReverse {
	
	public dNode reverseDoublyList(dNode head) {
		dNode temp = null;
		dNode current = head;
		
		while(current != null) {
			temp = current.getPrev();
			current.setPrev(current.getNext());
			current.setNext(temp);
			current = current.getPrev();
		}
		
		if(temp != null) 
			return temp.getPrev();
		
		return null;
	}
}
