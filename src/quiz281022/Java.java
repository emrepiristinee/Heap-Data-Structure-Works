package quiz281022;

public class Java {

	public static void main(String[] args) {
		
		// Add values to queue
		PriorityQueue priorityQ = new PriorityQueue("Berker", 5);
		priorityQ.insert("Kemal", 20);
		priorityQ.insert("Elif", 70);
		priorityQ.insert("Fatma", 80);
		priorityQ.insert("Murat", 60);
		priorityQ.insert("Sevgi", 100);
		priorityQ.insert("Mustafa", 10);
		priorityQ.insert("Merve", 80);
		
		// Show queue
		priorityQ.showQueue();
		System.out.println();
		
		// Print max priority customer name
		System.out.println(priorityQ.getMaxPriority().getData()); //getData demezsem quiz281022.Node@156643d4 gelir
		System.out.println();
		
		// Delete max priority data
		priorityQ.removeMaxPriority();
		System.out.println();
		
		// Show queue
		priorityQ.showQueue();
		System.out.println();
		
		// Delete and print all customers in a loop
		while (!priorityQ.isEmpty()) {
			System.out.println("Removed " + priorityQ.getMaxPriority().getData());
			priorityQ.removeMaxPriority();
		}
	}
}
