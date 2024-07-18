import java.util.Deque;
import java.util.ArrayDeque;

public class SimpleDequeExample 
{
	
	public static void main(String[] args) 
    {
        // Create a Deque using ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(30);

        // Print the deque
        System.out.println("Deque after adding elements: " + deque);

        // Remove elements from the deque
        int firstRemoved = deque.removeFirst();
        int lastRemoved = deque.removeLast();

        // Print the removed elements
        System.out.println("Removed first element: " + firstRemoved);
        System.out.println("Removed last element: " + lastRemoved);

        // Print the deque after removals
        System.out.println("Deque after removing elements: " + deque);
    
    }

}
