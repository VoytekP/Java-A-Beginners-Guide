package beginnersguide;
// Suspending, resuming, and stopping a thread.
public class MyThread4 implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;

    MyThread4(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    // A factory method that creates and starts a thread.
    public static MyThread4 createAndStart(String name) {
        MyThread4 myThrd = new MyThread4(name);

        myThrd.thrd.start(); // start the tread
        return myThrd;
    }

    // Entry point of thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                // Use synchronized block to check suspended and stopped.
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " exiting.");
    }

    // Stop the thread.
    synchronized void mystop() {
        stopped = true;

        // The following ensures that a suspended thread can be stopped.
        suspended = false;
        notify();
    }

    // Suspend the thread.
    synchronized void mysuspended() {
        suspended = true;
    }

    // Resume the thread.
    synchronized  void myresume() {
        suspended = false;
        notify();
    }
}

class Suspend{
    public static void main(String[] args) {
        MyThread4 mt1 = MyThread4.createAndStart("My Thread");

        try {
            Thread.sleep(1000); // let ob1 thread start executing

            mt1.mysuspended();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            mt1.mysuspended();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.mysuspended();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        // wait for thread to finish
        try {
            mt1.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}