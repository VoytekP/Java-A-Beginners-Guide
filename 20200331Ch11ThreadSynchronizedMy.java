package guide.chapter.ten;

public class MyThread2 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    // Construct a new thread.
    MyThread2(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
    }

    // A factory method that creates and starts a thread.
    public static MyThread2 createAndStart(String name, int nums[]) {
        MyThread2 myThrd = new MyThread2(name, nums);

        myThrd.thrd.start(); // start the tread
        return myThrd;
    }

    // Entry point of thread.
    public void run() {
        int sum;

        System.out.println(thrd.getName() + "starting.");

        answer = sa.SumArray(a);
        System.out.println("Sum for " + thrd.getName() +
                            " is " + answer);

        System.out.println(thrd.getName()  +  " terminating.");
    }
}
