/***********************************************
 * @author Prashish Rajbhandari
 * @file Node.java
 * @desc Basic linkedlist with node creation
 		 and printing.
***********************************************/

public class Node {
	Node next;
	int data;

	public Node( int d ) {
		data = d;
	}

	// method to add node at the end of linkedlist
	public void addEnd( int d ) {
		Node current = this;
		while ( current.next != null ) {
			current = current.next;
		}

		Node new_node = new Node(d);
		current.next = new_node;
	}

	// prints all nodes
	public void printAllNodes() {
		Node current = this;
		while( current.next != null ) {
			System.out.println(current.data);
			current = current.next;
		}

		System.out.println(current.data);
	}

	// print kth position 
	public Node printNode( int pos ) {
		Node current = this;
		int count = 1;
		while( current.next != null ) {
			if (count == pos)
				return current;
			current = current.next;
			count++;
		}

		return null;
	}

    public static void main( String args[] ) {
    	Node n = new Node(1);
    	n.addEnd(2);
    	n.addEnd(3);
    	n.addEnd(4);
    	n.printAllNodes();

    	System.out.println(n.printNode(2).data);;
    } 
}