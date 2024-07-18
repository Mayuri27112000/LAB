
public class SubstringCheck 
{
	public static void main(String[] args) 
    {
     
        String String1 = "Java Programming";
        String subString = "Programming";
        
          boolean contains =String1.contains(subString);
        
        
        if (contains) 
         {
            System.out.println("YES it contain");
        }
       else 
        {
            System.out.println("NO");
        }
    }
}
