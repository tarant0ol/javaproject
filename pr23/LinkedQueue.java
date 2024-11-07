package pr23;


public class LinkedQueue extends QueueAbstract{
    private LinkedList list;

    public LinkedQueue() {
        super(100);
        this.list = new LinkedList();
    }

    public void enQueue(int num) {
        if (isFull()) {
            throw new QueueOverflow("Cannot enQueue: Queue is full");
        } else {
            if (front == -1) { front = 0; }
            rear++;
            list.insert(num);
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            throw new QueueEmpty("Cannot deQueue: Queue is empty");
        } else {
            int res = list.head.num;
            if (front == rear) {
                list.head = null;
                front = -1;
                rear = -1;
            } else { front++; list.head = list.head.next; }
            return res;
        }
    }


    public void printQueue() {
        list.print_list();
    }

    @Override
    public void clear() {
        list.remove_all();
    }
}
