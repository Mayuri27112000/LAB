import java.util.Arrays;

public class CountElementsLessThan
{
	
	// Method to count the number of elements in a sorted array
	public static int countLessThan(int[] arr, int value)
    {
        int count = 0;
        for (int num : arr) 
        {
            if (num < value) 
            {
                count++;
            } 
            else 
            {
                break; 
                // Since the array is sorted, we can stop early when an element >= value is found
            }
        }
        return count;
    }
 
    //main method
    public static void main(String[] args) 
    {
        // Example array (not sorted initially)
        int[] arr = {2, 3, 5, 6, 1, 8, 9};
        int value = 15;

        // Sort the array to ensure the method works correctly
        Arrays.sort(arr);

        // Print the number of elements less than the given value
        System.out.println("Number of elements less than " + value + ": " + countLessThan(arr, value));
    }

}
