package pr30_2;

public class Main {
    public static void main(String[] args) {
        BSTree tree = new BSTree();

        tree.print();

        tree.insert(10);
        tree.insert(6);
        tree.insert(2);
        tree.insert(15);
        tree.insert(1);
        tree.insert(4);
        tree.insert(3);
        tree.insert(1);
        tree.insert(5);

        System.out.println("Tree node count = " + tree.nodeCount());
        tree.print();

        tree.delete(2);
        System.out.println("======================");
        System.out.println("Tree node count = " + tree.nodeCount());
        tree.print();

    }
}
