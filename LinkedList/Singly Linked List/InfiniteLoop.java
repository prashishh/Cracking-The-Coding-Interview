/***********************************************
 * @author Prashish Rajbhandari
 * @file InfiniteLoop.java
 * @desc To check if a linkedlist has infinite loop or not.
***********************************************/

public class InfiniteLoop {

	public InfiniteLoop() {}

	public void createLoop( LinkedList sampleList ) {
		Node current = sampleList.head;
		
		// iterates to the last node	
		while( current.next != null ) 
			current = current.next;

		// last node's next is the first node (head)
		current.next = sampleList.head;
	} 

	// implementation of Floyd's Algorithm
	// hare - moves two steps
	// tortoise - moves one steps
	public boolean loopExists( LinkedList sampleList ) {
		Node tortoise = sampleList.head;
		Node hare = sampleList.head;

		while( hare != null ) {
			try {
				hare = hare.next.next;	// moves two steps
				tortoise = tortoise.next;

				if( hare == tortoise )
					return true;

			} catch (NullPointerException ne) {
				return false;
			}
		}

		return false;
	}

	public static void main( String args[] ) {
		LinkedList sampleList = new LinkedList();
		sampleList.addAtEnd( 1 );
		sampleList.addAtEnd( 2 );
		sampleList.addAtEnd( 3 );

		InfiniteLoop findme = new InfiniteLoop();

		System.out.println(findme.loopExists(sampleList));
		findme.createLoop( sampleList );
		System.out.println(findme.loopExists(sampleList));
	}
}