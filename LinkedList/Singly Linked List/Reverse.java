/***********************************************
 * @author Prashish Rajbhandari
 * @file Reverse.java
 * @desc Reverse Linkedlist.
***********************************************/

public class Reverse {
	
	Node head = null;
	Node tail = null;

	public Reverse() {};

	// add node at the end
	public void addAtEnd( int d ) {
		if( head == null ) {
			Node temp = new Node();
			temp.data = d;

			head = tail = temp;

		} else {
			Node temp = new Node();
			temp.data = d;

			tail.next = temp;
			tail = tail.next;
		}
	}

	// print all the nodes
	public void printAllNodes() {
		Node current = head;

		while( current != null ) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	// function to reverse linkedlist
	// the trick is to have a temp node (nextNode) which stores the next node
	// change current node's next to previous
	// then change previous to current node 
	// then change current node to the saved temp node (for further iteration as we erased it had location)
	public void rLink() {
		Node prev = tail = null;

		while ( head != null ) {
			// store the next node
			Node nextNode = head.next;

			// point head node to prev
			head.next = prev;

			// change prev to head node
			prev = head;

			//
			head = nextNode;
		}

		head = prev;

	}

    public static void main( String args[] ) {
    	Reverse listInst = new Reverse();
    	listInst.addAtEnd( 1 );
    	listInst.addAtEnd( 2 );
    	listInst.addAtEnd( 6 );
    	listInst.addAtEnd( 3 );
    	listInst.printAllNodes();

    	listInst.rLink();
    	listInst.printAllNodes();
    } 
}