package quiz281022;

public class PriorityQueue {
	public Node headNode;

	public PriorityQueue(String data, int priority) {
		headNode = new Node();
		headNode.setData(data);
		headNode.setPriority(priority);
		headNode.setNext(null);
	}

	// Return the max priority node
	public Node getMaxPriority() {
		return headNode;
	}

	// Remove and return the max priority node
	public Node removeMaxPriority() {
		(headNode) = (headNode).getNext();
		return headNode;
	}

	// Check is list is empty
	public boolean isEmpty() {
		return ((headNode) == null) ? true : false;
	}

	// Insert according to priority
	public Node insert(String data, int priority) {
		// Create new Node
		Node temp = new Node();
		temp.setData(data);
		temp.setPriority(priority);
		// Special Case: The head of list has lesser
		// priority than new node. So insert new
		// node before head node and change head node.
		if ((this.headNode).getPriority() > priority) {
			// Insert New Node before head
			temp.setNext(this.headNode);
			(this.headNode) = temp;
		} else {
			Node start = headNode;
			// Traverse the list and find a
			// position to insert new node
			while (start.getNext() != null && start.getNext().getPriority() < priority) {
				start = start.getNext();
			}
			// Either at the ends of the list
			// or at required position
			temp.setNext(start.getNext());
			start.setNext(temp);
		}
		return headNode;
	}

	// Show data and priority all queue list
	public void showQueue() {
		Node start = headNode;
		// Traverse the list and find a
		// position to insert new node
		do {
			System.out.println("Data : " + start.getData());
			System.out.println("Priority : " + start.getPriority());
			start = start.getNext();
		} while (start.getNext() != null);
		// Show last
		System.out.println("Data : " + start.getData());
		System.out.println("Priority : " + start.getPriority());
	}

}
