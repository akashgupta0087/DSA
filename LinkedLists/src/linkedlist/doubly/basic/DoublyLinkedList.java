package linkedlist.doubly.basic;

public class DoublyLinkedList {

	private dNode head;
	private int size;
	
	public dNode getHead() {
		return head;
	}
	public void setHead(dNode head) {
		this.head = head;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void insertAtFirst(int data) {
		dNode node = new dNode(data);
		node.setNext(head);
		if(head != null) {
			head.setPrev(node);
		} 
		head = node;
		size++;
	}
	
	public void insertAtLast(int data) {
		if(head==null) {
			insertAtFirst(data);
		} else {
			dNode temp = head;
			while(temp != null) {
				if(temp.getNext() == null) {
					dNode node = new dNode(data);
					temp.setNext(node);
					node.setPrev(temp);
					size++;
					temp = node;   // pointing the temp pointer to the last node.
				}
				temp = temp.getNext();
			}
		}
	}
	
	public void viewList(dNode head) {
		dNode temp = head;
		while(temp != null) {
			System.out.print(" " + temp.getData());
			temp = temp.getNext();
		}
	}
	
	public void insertAfterNode(dNode prev_Node, int data) {
		dNode node = new dNode(data);
		node.setNext(prev_Node.getNext());
		node.setPrev(prev_Node);
		prev_Node.setNext(node);
		
		if(node.getNext() != null) {
			node.getNext().setPrev(node);
		}
	}
	
	public void insertBeforeNode(dNode next_Node, int data) {
		dNode node = new dNode(data);
		node.setNext(next_Node);
		node.setPrev(next_Node.getPrev());
		next_Node.setPrev(node);
		
		if(node.getPrev() != null) {
			node.getPrev().setNext(node);
		} else {
			head = node;
		}
	}
	
}
