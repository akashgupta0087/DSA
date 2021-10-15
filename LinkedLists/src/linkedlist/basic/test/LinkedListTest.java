package linkedlist.basic.test;

import linkedlist.basic.LinkedList;
import linkedlist.basic.Node;
import linkedlist.operations.LinkedListReverse;
import linkedlist.operations.LinkedListSearch;

public class LinkedListTest {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.viewList();
		
//		list.deleteAtFirst();
		
		
//		list.insertAtFirst(1);
		list.insertAtLast(1);
//		list.deleteAtPosition(4);
		list.insertAtLast(2);
		list.insertAtLast(3);
		list.insertAtLast(4);
		list.insertAtLast(5);
		list.insertAtLast(6);
		
		list.viewList();
		
		try {
			list.insertAtPosition(7, 4);
			System.out.println("");
			list.viewList();
			list.insertAtPosition(8, 8);
			
			System.out.println("");
			list.viewList();
			list.insertAtPosition(9, 10);
			list.insertAtPosition(9, 9); // This line will not be executed, because above line will throw an error and the control will go in catch.
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("");
			System.out.println(e.getMessage());
		}
		
		list.insertAtFirst(0);
		
		System.out.println("");
		list.viewList();
		
		System.out.println(" Size : " + list.getSize());
		list.deleteAtFirst();
		System.out.println("");
		list.viewList();
		System.out.println(" Size : " + list.getSize());
		
		list.deleteAtLast();
		System.out.println("");
		list.viewList();
		System.out.println(" Size : " + list.getSize());
		
		list.deleteAtPosition(4);
		System.out.println("");
		list.viewList();
		System.out.println(" Size : " + list.getSize());
		
		list.deleteAtPosition(0);
		System.out.println("");
		list.viewList();
		System.out.print(" Size : " + list.getSize());
		
		LinkedListSearch listSearch = new LinkedListSearch();
		
		System.out.println("\nIs Key Present Iterative : " + listSearch.isKeyPresentIterative(list.getStart(), 5));
		System.out.println("Is Key Present Recursive : " + listSearch.isKeyPresentRecursive(list.getStart(), 5));
		
		LinkedListReverse reverse =new  LinkedListReverse();
		Node head = reverse.reverseList(list.getStart());
		
		reverse.viewList(head);
	}

}
