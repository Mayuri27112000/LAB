import java.util.*;

public class TopKFrequentWords 
{
	public static List<String> topKFrequent(String[] words, int k) 
    {
        // Create two HashMaps to store frequencies and first occurrence indices
        Map<String, Integer> freq = new HashMap<>(); 
        Map<String, Integer> occurrence = new HashMap<>();
        int uniqueId = 1; 
        
        // Populate the frequency map and occurrence map
        for (String word : words) {
            occurrence.putIfAbsent(word, uniqueId++); 
            freq.put(word, freq.getOrDefault(word, 0) + 1); 
        }
        
        // Convert the keys of frequency map into a list
        List<String> result = new ArrayList<>(freq.keySet());
        
     //Sort the list 
        result.sort((a, b) -> {
            int cmp = freq.get(b) - freq.get(a); // Compare frequencies in descending order
            if (cmp == 0) {
                return occurrence.get(a) - occurrence.get(b); 
            }
            return cmp; 
        });

        //Return the top k elements from the sorted list
        return result.subList(0, k);
    }

    public static void main(String[] args) 
    {
        //input
        String[] words = {"my", "pet", "chikku", "chikku", "love", "dog"};
        int k = 1;
        
        // Call the topKFrequent method and print the result
        List<String> result = topKFrequent(words, k);
        System.out.println("Top " + k + " frequent words: " + result); 
    }

}
