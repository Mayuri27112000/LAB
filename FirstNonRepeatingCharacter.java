import java.util.HashMap;

public class FirstNonRepeatingCharacter 
{

	public static int findFirstNonRepeating(String s) 
    {
        //Create a hash map to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map with character frequencies
        for (char c : s.toCharArray()) 
        {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Step 3: Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) 
        {
            if (frequencyMap.get(s.charAt(i)) == 1) 
            {
                return i; // Return the index of the first non-repeating character
            }
        }
        
        // If no non-repeating character is found, return -1
        return -1;
    }

    public static void main(String[] args) 
    {
        // Example input
        String input = "abcaba";
        
        // Call the findFirstNonRepeating method 
        int result = findFirstNonRepeating(input);
        //print the result
        System.out.println("First non-repeating character index: " + result); 
    }
}
