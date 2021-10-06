package linkedlist.operations;

import linkedlist.basic.Node;

public class LinkedListSearch {

	public boolean isKeyPresentIterative(Node temp, int key) {
		
		while(temp!= null) {
			if(temp.getData() == key) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
	
	public boolean isKeyPresentRecursive(Node temp, int key) {
		
		if(temp == null)
			return false;
		
		if(temp.getData() == key) 
			return true;
		
		return isKeyPresentRecursive(temp.getNext(), key);
	}

}
