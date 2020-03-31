package guide.chapter.ten;

public class SumArray {
    private int sum;

    synchronized int SumArray(int nums[]) {
        sum = 0; // reset sum

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " +
                                Thread.currentThread().getName() +
                                " is " + sum);
            try {
                Thread.sleep(10); // allow task-switch
            }
            catch (InterruptedException exc) {
                System.out.println("Thread interrupted");
            }
        }
        return sum;
    }

    public int sumArray(int[] a) {
        return 0;
    }
}
