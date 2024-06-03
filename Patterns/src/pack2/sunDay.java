package pack2;

public class sunDay {

	
	public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 is running");
            // Perform some task
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
            // Perform some task
        });
        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3 is running");
            // Perform some task
        });
        Thread t4 = new Thread(() -> {
            System.out.println("Thread 4 is running");
            // Perform some task
        });
        Thread t5 = new Thread(() -> {
            System.out.println("Thread 5 is running");
            // Perform some task
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
       
        System.out.println("All threads have completed their execution");

       // t1.join(); // Main thread waits for t1 to complete
       // t2.join(); // Main thread waits for t2 to complete

        
        // Continue with the main thread's execution
    }
	
	
	
	
}