package beginnersguide;

public class MyThread2 implements Runnable{
    Thread thrd;

    // Construct a new thread using this Runnable and give it a name.
    MyThread2(String name) {
        thrd = new Thread(this, name);
    }

    // A factory method that creates and starts a thread.
    public static MyThread2 createAndStart(String name) {
        MyThread2 myThrd = new MyThread2(name);

        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    // Entry point of threa.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(("In " + thrd.getName() +
                        ", count is " + count));
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }

}
