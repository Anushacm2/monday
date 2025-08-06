package assessment;


	class EvenThread extends Thread {
	    public void run() {
	        for (int i = 2; i <= 20; i += 2) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	}

	class OddThread extends Thread {
	  public void run() {
	        for (int i = 1; i <= 20; i += 2) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	}

	public class EvenOddWithJoin {
	    public static void main(String[] args) {
	        EvenThread evenThread = new EvenThread();
	        OddThread oddThread = new OddThread();

	        try {
	            evenThread.start();  
	            evenThread.join();    

	            oddThread.start();    
	            oddThread.join();     
	        } 
	        catch (InterruptedException e) {
	            System.out.println("Thread interrupted: " + e.getMessage());
	        }

	        System.out.println("All numbers printed.");
	    }
	}


