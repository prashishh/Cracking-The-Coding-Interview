/***********************************************
 * @author Prashish Rajbhandari
 * @file Duplicates1.java
 * @desc Find and remove duplicates
***********************************************/

public class Duplicates1 {
	
	Node head = null;
	Node tail = null;

	public Duplicates1() {};

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

	public void removeDuplicates() {
    	Node slow = head;
    	Node fast = head;

    	while ( slow != null ) {
    		fast = slow;
    		
    		while( fast.next != null ) {
    			if( fast.next.data == slow.data )
    				fast.next = fast.next.next;
    			else
    				fast = fast.next;
    		}
    		slow = slow.next;
    	}
    }   


    public static void main( String args[] ) {
		Duplicates1 unsortedList = new Duplicates1();
    	unsortedList.addAtEnd(5);
    	unsortedList.addAtEnd(5);
    	unsortedList.addAtEnd(2);
    	unsortedList.addAtEnd(2);
    	unsortedList.addAtEnd(4);
    	unsortedList.addAtEnd(1);
    	unsortedList.addAtEnd(2);
    	unsortedList.addAtEnd(1);
    	unsortedList.addAtEnd(5);
    	unsortedList.addAtEnd(5);
    	unsortedList.addAtEnd(5);

    	unsortedList.printAllNodes();

    	System.out.println("\n");
    	//unsortedList.deleteNodePos(0);
    	unsortedList.removeDuplicates();

    	unsortedList.printAllNodes();


    	
    } 
}