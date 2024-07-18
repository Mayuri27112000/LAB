
public class ExceptionalHandling 
{
	public static void main(String[] args)
    {
        int[] numbers = {1, 22, 30};
        int divisor = 0;

        try
        {
            // Array index out of bounds
            System.out.println("Accessing element at index 5: " + numbers[5]);

            // Arithmetic exception
            int result = numbers[1] / divisor;
            System.out.println("Result of division: " + result);
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues to execute normally.");
    }
  
}