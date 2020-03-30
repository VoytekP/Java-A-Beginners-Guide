package beginnersguide;

public class MyThread3 extends Thread {
    // Construct a new thread.
    MyThread3(String name) {
        super(name); // name thread
    }

    // Entry point of thread.
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int count = 0; count < 100; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                                    ", count is " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}
