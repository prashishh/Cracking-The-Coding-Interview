/***********************************************
 * @author Prashish Rajbhandari
 * @file LinkedList.java
 * @desc Implement an algorithm to find the kth to the last element of a singly linked list.
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

    public int findSize() {
        Node current = head;
        int size = 0;

        while( current != null ) {
            size++;
            current = current.next;
        }

        return size;
    }

    public Node findreversek( int pos ) {
        Node leading = head;
        Node kth = head;

        int size = this.findSize();

        if ( pos > size )
            return null;

        for( int i = 1; i < pos; i++ )
            leading = leading.next;

        while( leading.next != null ) {
            kth = kth.next;
            leading = leading.next;
        }

        return kth;
    }


    public static void main( String args[] ) {
		LinkedList unsortedList = new LinkedList();
    	unsortedList.addAtEnd(1);
    	unsortedList.addAtEnd(5);
    	unsortedList.addAtEnd(2);
    	unsortedList.addAtEnd(2);
    	unsortedList.addAtEnd(4);
    	unsortedList.addAtEnd(1);
    	unsortedList.addAtEnd(2);
    	unsortedList.addAtEnd(1);
    	unsortedList.addAtEnd(7);
    	unsortedList.addAtEnd(8);
    	unsortedList.addAtEnd(9);

    	System.out.println(unsortedList.findreversek(10).data);


    	
    } 
}