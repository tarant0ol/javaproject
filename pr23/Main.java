package pr23;



public class Main {
    public static void main(String[] args) {
        // ArrayQueue test
        System.out.println("===================== ArrayQueue:");
        ArrayQueue queue = new ArrayQueue(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.printQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.printQueue();
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);
        queue.enQueue(10);
        queue.printQueue();
        queue.clear();
        queue.printQueue();

        System.out.println("===================== LinkedQueue:");
        LinkedQueue queue1 = new LinkedQueue();
        queue1.enQueue(1);
        queue1.enQueue(2);
        queue1.enQueue(3);
        queue1.enQueue(4);
        queue1.enQueue(5);
        queue1.printQueue();
        queue1.deQueue();
        queue1.deQueue();
        queue1.deQueue();
        queue1.deQueue();
        queue1.deQueue();
        queue1.printQueue();
        queue1.enQueue(6);
        queue1.enQueue(7);
        queue1.enQueue(8);
        queue1.enQueue(9);
        queue1.enQueue(10);
        queue1.printQueue();
        queue1.clear();
        queue1.printQueue();

    }
}
