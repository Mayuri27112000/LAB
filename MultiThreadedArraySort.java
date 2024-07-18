import java.util.Arrays;

public class MultiThreadedArraySort 
{
	//main method
    public static void main(String[] args) 
    {
        //array list
        int[] arr = {11, 43, 24, 56, 12, 65, 90, 12, 53, 23};
        int numThreads = 2; 

        multiThreadSort(numThreads, arr, 0, arr.length);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void multiThreadSort(int threads, int[] arr, int start, int stop) 
    {
        if (threads > 1) 
        {
            int midpoint = partition(arr, start, stop);
            
            // Create two threads to sort the two halves of the array
            new Thread(() -> multiThreadSort(threads - 1, arr, start, midpoint)).start();
            new Thread(() -> multiThreadSort(threads - 1, arr, midpoint, stop)).start();
        }
        else 
        {
            //// Sort the remaining
            Arrays.sort(arr, start, stop); 
        }
    }

    public static int partition(int[] arr, int start, int stop) 
    {
        // Implement your partition logic 
        return (start + stop) / 2;
    }

}
