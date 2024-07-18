import java.util.TreeSet;
import java.util.Iterator;

public class RemoveGreaterThan 
{
	
	public static void main(String[] args) 
    {
        // Create a TreeSet and add some elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(9);

        // Specify the element
        int specifiedElement = 5;

        // Print the original TreeSet
        System.out.println("Original TreeSet: " + treeSet);

        // Create an iterator for the TreeSet
        Iterator<Integer> iterator = treeSet.iterator();

        // Remove elements greater than the specified element
        while (iterator.hasNext()) 
        {
            if (iterator.next() > specifiedElement) 
            {
                iterator.remove();
            }
        }

        // Print the modified TreeSet
        System.out.println("Modified TreeSet: " + treeSet);
    }

}
