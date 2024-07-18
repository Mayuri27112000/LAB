// Thread class to find the average of the first 50 numbers
class AverageThread implements Runnable 
{
    
    public void run() 
    {
        // Initialize the sum variable
        int sum = 0;
        
        // Loop to calculate the sum of the first 50 numbers
        for (int i = 1; i <= 50; i++) 
        {
            sum += i;
        }
        
        // Calculate the average
        double average = sum / 50.0;
        
        // Print the average
        System.out.println("Average of the first 50 numbers: " + average);
    }
}

// Thread class to print the square of numbers in an array
class SquareThread implements Runnable 
{
    private int[] arr;

    // Constructor to initialize the array
    public SquareThread(int[] arr) 
    {
        this.arr = arr;
    }

    
    public void run() 
    {
        // Loop through each number in the array
        for (int num : arr) {
            // print the square of the number
            System.out.println("Square of " + num + ": " + (num * num));
        }
    }
}

//main class
public class MainThreads2 
{

	public static void main(String[] args) 
    {
        // Array of numbers
        int[] arr = {10, 15, 20, 25, 30};

        // Create instances of the thread classes
        AverageThread averageTask = new AverageThread();
        SquareThread squareTask = new SquareThread(arr);

        // Create Thread objects
        Thread thread1 = new Thread(averageTask);
        Thread thread2 = new Thread(squareTask);

        // call the threads
        thread1.start();
        thread2.start();
    }
}
