package pr30;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.print();

        tree.insert(10);
        tree.insert(6);
        tree.insert(2);
        tree.insert(15);
        tree.insert(1);
        tree.insert(4);
        tree.print();

        tree.delete(2);
        System.out.println("======================");
        tree.print();

    }
}
