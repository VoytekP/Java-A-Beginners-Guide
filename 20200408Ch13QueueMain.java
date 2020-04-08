package beginnersjavaguide;

public interface IGenQ<T> {
    void put(T ch) throws QueueFullException;

    T get() throws QueueEmptyException;
}

class QueueEmptyException extends Exception {

    public String toString() {
        return "\nQueue is empty.";
    }
}

class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {size = s; }

    public String toString() {
        return "\nQueue is full. Maximum size is " + size;
    }
}

class GenQueue<T> implements IGenQ<T> {
    private T q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    public GenQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    public void put(T obj)
        throws QueueFullException {
        if (putloc == q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = obj;
    }

    // Get a character from the queue.
    public T get()
        throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}

class GenQDemo {
    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a quee of Integers.");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + i + " to q.");
                q.put(i);
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Getting next Integer for q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();

        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);

        Double dVal;

        System.out.println("Demonstrate a queue of Double.");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + (double) i/2 +
                                    " to q2.");
                q2.put((double) i / 2);
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Getting next Double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}