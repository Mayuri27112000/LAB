import java.util.ArrayList;

public class ReplaceSecondElement 
{
	    public static void main(String[] args) 
	    {
	    	
	    	//Create an ArrayList
	        ArrayList<String> colorList = new ArrayList<>();
	        
	        //Add elements to ArrayList
	        colorList.add("Red");
	        colorList.add("Green");
	        colorList.add("White");
	        colorList.add("Yellow");
	        
            //print original ArrayList
	        System.out.println("Original array list: " + colorList);

	        //Replaced Element
	        String newColor = "Black";
	        colorList.set(1, newColor);

	        //After Replacing
	        System.out.println("Replace second element with black:" +colorList);
	        
	    }
}
