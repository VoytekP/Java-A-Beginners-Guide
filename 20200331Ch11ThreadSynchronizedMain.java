package guide.chapter.ten;

public class Sync {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread2 mt1 = MyThread2.createAndStart("Child #1", a);
        MyThread2 mt2 = MyThread2.createAndStart("Child #2", a);

        try{
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
