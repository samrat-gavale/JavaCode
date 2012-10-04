package linked_lists;

public class Node {
	private int val = 0;
	private Node next = null;
	public Node(int n) {
		// TODO Auto-generated constructor stub
		setVal(n);
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
}
