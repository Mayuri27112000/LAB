//Class MyRunnable that implements the Runnable interface
public class MyRunnable implements Runnable
{
	    // Override the run method
	     public void run() 
	     {
	        try 
	        {
	            // Print a message
	            System.out.println("Thread is running...");

	            //thread sleep for 2 seconds
	            Thread.sleep(2000);

	            // Print a message
	            System.out.println("Thread has woken up after sleeping for 2 seconds.");
	        } 
	        catch (InterruptedException e) 
	        {
	            // Print a message 
	            System.out.println("Thread was interrupted.");
	        }
	    }

	    // Main method
	    public static void main(String[] args) 
	    {
	        // Create an instance of MyRunnable
	        MyRunnable myRunnable = new MyRunnable();

	        // Create a new Thread object
	        Thread thread = new Thread(myRunnable);

	        // Start the thread by calling the start method
	        thread.start();
	    }
}
