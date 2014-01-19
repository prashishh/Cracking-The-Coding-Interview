/***********************************************
 * @author Prashish Rajbhandari
 * @file Queue.java
 * @desc Queue class with basic operations like
 	enqueue and dequeue.
***********************************************/

public class QueueClass {
	Node head, tail;

	public QueueClass() {};
	public void enqueue( int d ) {
		// check if it is the first entry
		if( head == null ) {
			Node temp = new Node();
			temp.data = d;

			tail = temp;
			head = tail;
		} else {
			Node temp = new Node();
			temp.data = d;
			tail.next = temp;
			tail = tail.next;
		}
	}	

	public void dequeue() {
		if( head == null )
			return;
		else {
			int temp = head.data;
			head = head.next;
		}
	}

	public int peek() {
		return head.data;
	}

	public static void main( String args[] ) {
		QueueClass queueList = new QueueClass();
		queueList.enqueue(5);
		queueList.enqueue(4);
		queueList.enqueue(3);
		System.out.println(queueList.peek());
		queueList.dequeue();
		System.out.println(queueList.peek());
	}

}