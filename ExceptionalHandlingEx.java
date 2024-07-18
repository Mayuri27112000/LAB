import java.util.Scanner;
public class ExceptionalHandlingEx 
{
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(sc.nextLine());
            if (99 % n == 0)
                System.out.println(n + " is a factor of 99");
        } 
        catch (NumberFormatException | ArithmeticException ex) 
        {
            System.out.println("Exception encountered " + ex);
        } 
        finally
        {
            System.out.println("Finally block executed, performing cleanup tasks.");
        }
    }
	

}
