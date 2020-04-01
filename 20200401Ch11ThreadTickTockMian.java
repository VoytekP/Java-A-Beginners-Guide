package beginnersguide;
// Use wait() and notify() to crate a ticking clock.
public class TickTock {

    String state; // contains the state of the clock

    synchronized void tick(boolean running) {
        if (!running) { // stop the clock
            state = "ticked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.print("Tick ");

        state = "ticked"; // set the current state to ticked

        notify(); // let tock() run
        try {
            while (!state.equals("tocked"))
                wait(); // wait for tock() to complete
        }
        catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized  void tock(boolean running) {
        if (!running) { // stop the clock
            state = "Tocked";
            notify(); // notify any waiting threads
            return;
        }

        System.out.println("Tock");

        state = "tocked";   // set the current state to tocked

        notify(); // let tick() run

        try {
            while (!state.equals("ticked"))
                wait(); // wait for tick to complete
        }
        catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}

class MyThread implements Runnable {
    Thread thrd;
    TickTock ttOb;

    // Construct a new thread.
    MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    // A factory method that creates and starts a thread.
    public static MyThread crateAndStart(String name, TickTock tt) {
        MyThread myThread = new MyThread(name, tt);

        myThread.thrd.start(); // start the thread
        return myThread;
    }

    // Entry point of thread.
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) ttOb.tick(true);
            ttOb.tick(false);
        } else {
            for (int i = 0; i < 5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread mt1 = MyThread.crateAndStart("Tick", tt);
        MyThread mt2 = MyThread.crateAndStart("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}