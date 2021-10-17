package linkedlist.doubly.basic;

import linkedlist.doubly.operations.DoublyLinkedListReverse;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		DoublyLinkedList doubly = new DoublyLinkedList();
		doubly.insertAtFirst(1);
		doubly.insertAtLast(2);
		doubly.insertAtLast(3);
		doubly.insertAtLast(4);
		doubly.insertAtLast(5);
		doubly.viewList(doubly.getHead());

		DoublyLinkedListReverse reverseDoublyList = new DoublyLinkedListReverse();
		dNode head = reverseDoublyList.reverseDoublyList(doubly.getHead());
		doubly.setHead(head);
		System.out.println();
		doubly.viewList(head);
		
		doubly.deleteAtFirst(); 
		doubly.deleteAtLast();
		  
		System.out.println(); 
		doubly.viewList(doubly.getHead());
		  
		doubly.deleteNode(doubly.getHead().getNext()); 
		System.out.println();
		doubly.viewList(doubly.getHead());
		
		doubly.insertAtPos(0, 1);
		System.out.println();
		doubly.viewList(doubly.getHead());
		
		doubly.insertAtPos(2, 5);
		System.out.println();
		doubly.viewList(doubly.getHead());
		
		doubly.insertAtPos(5, 5);
		System.out.println();
		doubly.viewList(doubly.getHead());
		 
	}
}
