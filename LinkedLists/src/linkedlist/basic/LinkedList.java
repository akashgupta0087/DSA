package linkedlist.basic;

import java.util.HashMap;

public class LinkedList {
	
	private int size;
	private Node start;
	
	public int getSize() {
		return size;
	}
	
	public Node getStart() {
		return start;
	}

	public void setStart(Node start) {
		this.start = start;
	}

	public void insertAtFirst(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(start);
		start = node;
		size++;
	}
	
	public void viewList() {
		Node n = start;
		if(n == null) {
			System.out.println("List is empty!!");
		}
		while(n != null) {
			System.out.print(" " + n.getData());
			n = n.getNext();
		}
	}
	
	public void insertAtLast(int data) {
		Node temp = start;
		
		if(temp == null) {
			insertAtFirst(data);
		} else {
			while(temp != null) {
				if(temp.getNext() == null) {
					Node node = new Node();
					node.setData(data);
					temp.setNext(node);
					size++;
					break;
//					temp = node; // we can use both either break or point the
					             // temp variable to the new node.
					             // new node's next will always be null.
				}
				temp = temp.getNext();
			}
		}
	}
	
	public void insertAtPosition(int data, int pos) throws Exception {
		if(pos <= size) {
			Node temp = start;
			int count = 1;
			while(temp != null) {
				if(count == (pos-1)) {
					Node node = new Node();
					node.setData(data);
					node.setNext(temp.getNext());
					temp.setNext(node);
					size++;
					break;
				}
				temp = temp.getNext();
				count++;
			}
		} else if(pos == size+1) {
			insertAtLast(data);
		} else {
			throw new Exception("Position is greater than the size of the list");
		}
	}
	
	public void deleteAtFirst() {
		if(start == null) {
			System.out.println("List is already empty");
		} else {
			start = start.getNext();
			size--;
		}
	}
	
	public void deleteAtLast() {
		if(start == null) {
			System.out.println("List is already empty");
		} else {
			Node temp = start;
			for(int i=1; i< size-1; i++)
				temp = temp.getNext();
			temp.setNext(null);
			size--;
		}
	}
	
	public void deleteAtPosition(int pos) {
		Node posNode = null;
		Node beforePosNode = start;
		if(start == null)
			System.out.println("List is already empty");
		else if(pos == 1) {
			deleteAtFirst();
		} else if (pos == size) {
			deleteAtLast();
		}
		else if(pos <= size && pos > 0) {
			for(int i=1; i<pos-1; i++)
				beforePosNode = beforePosNode.getNext();
			
			posNode = beforePosNode.getNext();
			beforePosNode.setNext(posNode.getNext());
			size--;
		} else {
			System.out.println("No such position exist");
		}
		
	}
	
}


