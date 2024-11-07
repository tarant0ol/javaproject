package pr23;

public interface QueueInterface {
    void enQueue(int num);
    int deQueue();
    int getSize();
    boolean isEmpty();
    boolean isFull();
    void clear();
    void printQueue();
}
