public class OnlineShoppingApp 
{
	//main method
    public static void main(String[] args) throws InterruptedException 
    {
        final OrderProcessor orderProcessor = new OrderProcessor();

        // threads for order confirmation  
        Thread orderThread = new Thread(() -> 
        {
            try 
            {
                orderProcessor.confirmOrder();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        });

        //threads for payment completion
        Thread paymentThread = new Thread(() -> 
        {
            try 
            {
                orderProcessor.completePayment();
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        });

        // Start both threads
        orderThread.start();
        paymentThread.start();

        // Wait for both threads to finish
        orderThread.join();
        paymentThread.join();
    }

    // Class for order processing 
    static class OrderProcessor 
    {
        public synchronized void confirmOrder() throws InterruptedException 
        {
            System.out.println("Order confirmation process started.");
            // Simulate some processing time
            Thread.sleep(1000);
            System.out.println("Order confirmed.");
            // Notify the payment thread
            notify();
        }

        public synchronized void completePayment() throws InterruptedException
        {
            // Wait for order confirmation
            wait();
            System.out.println("Payment process started.");
            Thread.sleep(2000);
            //print msg
            System.out.println("Payment completed. Order confirmed.");
        }
    }

}
