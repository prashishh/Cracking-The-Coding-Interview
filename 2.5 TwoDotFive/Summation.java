/***********************************************
 * @author Prashish Rajbhandari
 * @file LinkedList.java
 * @desc You have two numbers representated by a linked list, where each node contains a single digit. The digit are stored in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two number and returns the sum as a linked list.
***********************************************/

public class Summation {
	
	Node head = null;
	Node tail = null;

	public Summation() {};

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

	public int size() {
		Node current = head;
		int count = 0;
		while( current != null ) {
			count++;
			current = current.next;
		}

		return count;
	}

    public void add( Summation list1, Summation list2 ) {
    	Node firstNumb, secondNumb;
		int temp = 0;

    	if( list1.size() > list2.size() ) {
    		firstNumb = list1.head;
    		secondNumb = list2.head;
    	} else {
    		firstNumb = list2.head;
    		secondNumb = list1.head;
    	}

    	while ( firstNumb != null ) {

	    	if( secondNumb.next != null ) {
	    		
	    		int sum = firstNumb.data + secondNumb.data;
	    		if( temp != 0 ) {
	    			sum = sum + temp;
	    			temp = 0;
	    		}
	    		String sumChar = Integer.toString(sum);
	    		if( sumChar.length() > 1 ) {
	    			temp = Character.getNumericValue(sumChar.charAt(0));
	    			this.addAtEnd(Character.getNumericValue(sumChar.charAt(1)));
	    		} else {
	    			this.addAtEnd(sum);
	    		}

	    		firstNumb = firstNumb.next;
				secondNumb = secondNumb.next;
			} else {
    			this.addAtEnd(firstNumb.data);
    			firstNumb = firstNumb.next;
			}
    	}
    }


    public static void main( String args[] ) {
		Summation list1 = new Summation();
		Summation list2 = new Summation();
		Summation result = new Summation();


		list1.addAtEnd(1);
		list1.addAtEnd(1);
		list1.addAtEnd(1);
		list1.addAtEnd(1);


		list2.addAtEnd(9);
		list2.addAtEnd(2);
		list2.addAtEnd(1);

		result.add(list1, list2);
		result.printAllNodes();

    } 
}