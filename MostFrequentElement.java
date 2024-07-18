import java.util.HashMap;

public class MostFrequentElement 
{

	// Method to find the most frequent element in the array
    public static int findMostFrequent(int[] arr) 
    {
        // Create a HashMap to store element frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map with element counts
        for (int num : arr) 
        {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Initialize variables to track the most frequent element
        int maxCount = 0;
        int mostFrequentElement = -1;

        // Traverse the hash map to find the most frequent element
        for (int num : frequencyMap.keySet()) 
        {
            int count = frequencyMap.get(num);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentElement = num;
            }
        }

        // Return the most frequent element found
        return mostFrequentElement;
    }

    // Main method to test the findMostFrequent function
    public static void main(String[] args) 
    {
        // input array
        int[] input = {1, 3, 2, 2, 2,5, 2, 3, 4,1};
        
        // Call the findMostFrequent method and print the result
        int result = findMostFrequent(input);
        System.out.println("Most frequent element: " + result); 
    }
}
