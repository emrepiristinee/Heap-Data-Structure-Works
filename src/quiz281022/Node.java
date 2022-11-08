package quiz281022;

public class Node {
	private String data;
	private int priority;
	private Node next;

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node node) {
		this.next = node;
	}
}
