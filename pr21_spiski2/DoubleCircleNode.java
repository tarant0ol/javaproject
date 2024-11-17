package pr21_spiski2;

public class DoubleCircleNode {
    int num;
    DoubleCircleNode next;
    DoubleCircleNode prev;

    public DoubleCircleNode(int num) {
        this.num = num;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "DoubleCircleNode{" +
                "num=" + num +
                '}';
    }
}
