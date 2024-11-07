package pr23;

public class ArrayQueue extends QueueAbstract {
    private int size;
    private final int[] arr;

    public ArrayQueue(int size) {
        super(size);
        this.arr = new int[size];
    }

    public void enQueue(int num) {
        if (isFull()) {
            throw new QueueOverflow("Cannot enQueue: Queue is full");
        } else {
            if (front == -1) { front = 0; }
            //System.out.println("front = " + front + ", rear = " + rear + "num entered = " + num);
            arr[++rear] = num;
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            throw new QueueEmpty("Cannot deQueue: Queue is empty");
        } else {
            int res = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else { front++; }
            return res;
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("[ ]");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }
}
