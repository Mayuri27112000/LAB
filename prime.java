import java.util.Scanner;//importing
public class prime 
{
	static void primeCal(int num)//return type
	 {
		int count=0; //data type
		for(int i=1;i<=num;i++)
		{
		   if(num%i==0)
		   {
		        count++;	        
		   }
		}
		if(count==2) 
		       System.out.println("prime number ");
		else
		{
			System.out.println("Not a prime number ");     
		}
	}
	public static void main(String arg[])	
	{

	System.out.print("Enter a number: ");
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(); //object
	primeCal(n);//calling
	}
}
