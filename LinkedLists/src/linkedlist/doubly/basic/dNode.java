package linkedlist.doubly.basic;

public class dNode {
	private int data;
	private dNode next;
	private dNode prev;
	
	public dNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public dNode getNext() {
		return next;
	}

	public void setNext(dNode next) {
		this.next = next;
	}

	public dNode getPrev() {
		return prev;
	}

	public void setPrev(dNode prev) {
		this.prev = prev;
	}
	
}
