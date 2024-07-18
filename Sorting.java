import java.util.ArrayList;
import java.util.Collections;

//Sorting class
public class Sorting 
{
	    
	    //main method
	    public static void main(String[] args) 
	    {
	    	
	    	//create an array list of strings
	        ArrayList<String> countries = new ArrayList<>();
	        
	        //add elements to ArrayList
	        countries.add("India");
	        countries.add("Pakistan");
	        countries.add("Sri Lanka");
	        countries.add("USA");
	        countries.add("Australia");
	        countries.add("Japan");
            
	        //print original list
	        System.out.println("Before Sorting: "  + countries);
	        
	        //sort the ArrayList
	        Collections.sort(countries);
	        
	        //print sorted ArrayList
	        System.out.println("After Sorting : "  + countries);
	    }
	


}
