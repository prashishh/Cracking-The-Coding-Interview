/***********************************************
 * @author Prashish Rajbhandari
 * @file LinkedList.java
 * @desc Linkedlist with basic operations.
***********************************************/

public class LinkedList {
	
	Node head = null;
	Node tail = null;

	public LinkedList() {};

	// add node at the end
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
			tail.next = temp;	// change tail to the new node
			tail = tail.next;	// change tail's next to the new node
		}
	}

	// add node at a specific position
	public void addNodeAtMid( int pos, int d ){
		Node current = head; 
		int count = 1;

		while( count < pos-1 ) {
			current = current.next;
			count++;
		}

		Node temp = new Node();
		temp.data = d;

		temp.next = current.next;
		current.next = temp;
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
    	l.addAtEnd( 4 ); 
    	l.addAtEnd( 2 );
    	l.addAtEnd( 3 );
       	l.addAtEnd( 1 );
    	l.printAllNodes();

    	System.out.println("\n");

    	l.addNodeAtMid(2,31);
    	l.printAllNodes();

    } 
}