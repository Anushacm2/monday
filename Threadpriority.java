package assessment;
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for half a second to simulate work
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
        System.out.println(getName() + " completed.");
    }
}

public class Threadpriority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("High Priority Thread");
        MyThread t2 = new MyThread("Low Priority Thread");
        MyThread t3 = new MyThread("Normal Priority Thread");

        t1.setPriority(Thread.MAX_PRIORITY); 
        t2.setPriority(Thread.MIN_PRIORITY); 
        t3.setPriority(Thread.NORM_PRIORITY); 

        t1.start();
        t2.start();
        t3.start();
    }
}

