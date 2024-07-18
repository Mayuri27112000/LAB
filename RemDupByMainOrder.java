import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemDupByMainOrder 
{
	    //main method
	    public static void main(String[] args) 
	    {
	        List<Integer> inputList = new ArrayList<>();
	        //Enter list numbers
	        inputList.add(7);
	        inputList.add(5);
	        inputList.add(1);
	        inputList.add(7);
	        inputList.add(1);
	        inputList.add(2);
	        inputList.add(1);

	        // Remove duplicates while maintaining order
	        List<Integer> outputList = new ArrayList<>(new LinkedHashSet<>(inputList));
            
	        //printing after removing
	        System.out.println(outputList);
	    }
	

}
