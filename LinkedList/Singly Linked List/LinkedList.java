/***********************************************
 * @author Prashish Rajbhandari
 * @file LinkedList.java
 * @desc Basic linkedlist with node creation
 		 and basic operations.
***********************************************/

public class LinkedList {
	
	Node head = null;
	Node tail = null;

	public LinkedList() {};

	public void addAtEnd( int d ) {
		
		// create temp node to add
		Node temp = new Node();
		temp.data = d;

		// empty, add first element
		if( head == null ) {
			head = temp;	// change head to the newly created node
			head.next = tail;	// point head to tail (last node)
			tail = head;	// tail points to head (as head is the last node)
		} else {
			tail.next = temp;
			tail = tail.next;
		}
	}

	public void printAllNodes() {
		Node current = head;

		while( current != null ) {
			System.out.println(current.data);
			current = current.next;
		}
	}

    public static void main( String args[] ) {
    	LinkedList l = new LinkedList();
    	l.addAtEnd( 1 );
    	l.addAtEnd( 1 );
    	l.addAtEnd( 1 );
    	l.printAllNodes();
    } 
}