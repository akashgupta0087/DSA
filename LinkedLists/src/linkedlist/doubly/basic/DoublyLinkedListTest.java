package linkedlist.doubly.basic;

public class DoublyLinkedListTest {
	
	public static void main(String[] args) {
		DoublyLinkedList doubly = new DoublyLinkedList();
		doubly.insertAtFirst(1);
		doubly.insertAtLast(2);
		doubly.insertAtLast(3);
		doubly.insertAtLast(4);
		doubly.insertAtLast(5);
		doubly.viewList(doubly.getHead());
	}
}
