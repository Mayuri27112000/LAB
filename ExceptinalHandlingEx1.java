
public class ExceptinalHandlingEx1 
{
	
	    public static void main(String[] args)
	    {
	        try {
	            // Array Index Out of Bounds
	            int[] arr = { 1, 2, 3 };
	            System.out.println(arr[3]); 
	            // Throws ArrayIndexOutOfBoundsException

	            // Arithmetic Exception
	            int numerator = 10;
	            int denominator = 0;
	            int result = numerator / denominator; 
	            // Throws ArithmeticException
	            
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index out of bounds: " + e.getMessage());
	        } 
	        catch (ArithmeticException e) 
	        {
	            System.out.println("Arithmetic exception: " + e.getMessage());
	        } 
	        finally 
	        {
	            System.out.println("Cleanup tasks in the finally block.");
	        }
	    }
	
	
}
