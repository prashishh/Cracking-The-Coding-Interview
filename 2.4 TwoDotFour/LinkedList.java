/***********************************************
 * @author Prashish Rajbhandari
 * @file LinkedList.java
 * @desc Write a code to partition a linkedlist around a value of x, such that all nodes less than x come before all nodes greater or equal to x.
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

	// print all the nodes
	public void printAllNodes() {
		Node current = head;

		while( current != null ) {
			System.out.println(current.data);
			current = current.next;
		}
	}


    public void partition( int val ) {

    }


    public static void main( String args[] ) {
		LinkedList unsortedList = new LinkedList();
    	unsortedList.addAtEnd(1);
    	unsortedList.addAtEnd(5);
    	unsortedList.addAtEnd(2);
    	unsortedList.addAtEnd(3);
    	unsortedList.addAtEnd(4);

        unsortedList.printAllNodes();

        unsortedList.deleteNode(unsortedList.head.next.next);

        System.out.println("\n");

        unsortedList.printAllNodes();

    	
    } 
}