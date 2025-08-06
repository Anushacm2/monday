package assessment;

public class Thread1 {
	
	    public static void main(String[] args) {
	        Thread t1 = new Thread(() -> {
	            System.out.println("Thread name: " + Thread.currentThread().getName());
	        });

	        Thread t2 = new Thread(() -> {
	            System.out.println("Thread name: " + Thread.currentThread().getName());
	        });

	        t1.setName("Scooby");
	        t2.setName("Shaggy");

	        t1.start();
	        t2.start();
	    }
	}


