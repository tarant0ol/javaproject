package pr30_1;

public class Node {
    String name;
    int data;
    Node left;
    Node right;

    public Node(String name, int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.name = name;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.name = "";
    }

    @Override
    public String toString() {
        if (this.name.isEmpty()) {
            return "{" + this.data + "}";
        } else {
            return "{" +
                    this.name + ":" + this.data +
                    '}';
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
