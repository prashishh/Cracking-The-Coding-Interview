/***********************************************
 * @author Prashish Rajbhandari
 * @file Stack.java
 * @desc Stack class with basic operations like
 	push, pop and peek.
***********************************************/

public class Stack {
	Node top;
	int size;

	public int pop() {
		int temp = top.data;
		top = top.next;
		return temp;
	}

	public void push( int d ) {
		Node temp = new Node();
		temp.data = d;
		temp.next = top;
		top = temp;
	}

	public int stackSize() {
		return size;
	}

	public int peek() {
		return top.data;
	}

	public static void main( String args[] ) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.pop();
		System.out.println(s.peek());
	}

}