package javabeginner;

public interface ICharQ {
    // Put a character into the queue.
    void put(char ch) throws QueueEmptyException, QueueFullException;

    // Get a character from the queue.
    char get() throws QueueEmptyException;
}
