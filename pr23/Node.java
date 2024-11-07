package pr23;

public class Node {
    int num;
    Node next;

    public Node(int num) {
        this.num = num;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "num=" + num +
                '}';
    }
}
