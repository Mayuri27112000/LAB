
public class EmailExtractor 
{
	
	public static void main(String[] args) 
    {
        //text containing email
        String text = "Hey, there how are you? this is my email id  great123@gmail.com";
        
        //string method
        String[] words = text.split(" ");

        for (String word : words) 
        {
            if (word.contains("@") && word.contains(".")) 
            {
                System.out.println("Email found: " + word);
                return;
            }
        }
        System.out.println("No email found.");
    }
		
}
