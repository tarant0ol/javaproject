package pr30_1;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "{" +
                "data=" + this.data +
                '}';
    }
}
