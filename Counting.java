
public class Counting 
{
	
	    public static void main(String[] args) 
	    {
	        String str = " Pathuri Mayuri Goud";
	        int vowels = 0, consonants = 0;
	        
	        // Convert the string to lowercase to handle both uppercase and lowercase characters
	        str = str.toLowerCase();
	        
	        for (int i = 0; i < str.length(); i++) 
	        {
	            char ch = str.charAt(i);
	            
	            // Check if the character is a letter
	            if (Character.isLetter(ch)) 
	            {
	                // Check if the character is a vowel
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
	                {
	                    vowels++;
	                }
	                else 
	                {
	                    consonants++;
	                }
	            }
	        }
	        
	        System.out.println("vowels=" + vowels);
	        System.out.println("consonants=" + consonants);
	    }
	

}
