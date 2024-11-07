package pr23;

public abstract class QueueAbstract implements QueueInterface {
    int front, rear, size;

    public QueueAbstract(int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    public boolean isEmpty() { return front == -1; }
    public boolean isFull() { return front == 0 && rear == size - 1; }
    public int getSize() { return size; }
    public void clear() { front = -1; rear = -1; }
}
