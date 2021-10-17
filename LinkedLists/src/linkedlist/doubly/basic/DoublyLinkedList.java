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
		if(temp == null)
			System.out.println("List is empty!!");
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
		size++;
		
		if(node.getNext() != null) {
			node.getNext().setPrev(node);
		}
	}
	
	public void insertBeforeNode(dNode next_Node, int data) {
		dNode node = new dNode(data);
		node.setNext(next_Node);
		node.setPrev(next_Node.getPrev());
		next_Node.setPrev(node);
		size++;
		
		if(node.getPrev() != null) {
			node.getPrev().setNext(node);
		} else {
			head = node;
		}
	}
	
	public void deleteAtFirst() {
		if(head == null)
			System.out.println("List is Empty!!");
		
		if(head.getNext() != null) 
			head.getNext().setPrev(null);
		
		head = head.getNext();
		size--;
		
	}
	
	public void deleteAtLast() {
		if(head == null)
			System.out.println("List is Empty!!");
		else {
			dNode temp = head;
			for(int i = 1; i < size-1; i++)
				temp = temp.getNext();
			temp.getNext().setPrev(null);
			temp.setNext(null);
			size--;
		}
	}
	
	public void deleteNode(dNode del) {
		if(head==null || del == null)
			return;
		
		if(head == del)
			head = head.getNext();
		
		if(del.getNext() != null)
			del.getNext().setPrev(del.getPrev());
		
		if(del.getPrev() != null) 
			del.getPrev().setNext(del.getNext());
		
		size--;
		return;
	}
	
	public void insertAtPos(int pos, int data) {
		dNode temp = head;
		if(head == null)
			System.out.println("List is empty!!");
		
		else if(pos < 0 || pos > (size + 1))
			System.out.println("Invalid position!!");
		
		else if(pos == (size + 1)) 
			insertAtLast(data);
		
		else {
			for(int i = 1; i < pos; i++)
				temp = temp.getNext();
			insertBeforeNode(temp, data);
		}
		
	}
	
}
