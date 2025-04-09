package pr30_1;

import java.util.ArrayDeque;

public class BTree {
    private Node root;

    public BTree() {
        this.root = null;
    }

    public BTree(String name, int data) {
        this.root = new Node(name, data);
    }

    public BTree(int data) {
        this.root = new Node("", data);

    }


    // adding to full
    public void insert(int data) {
        if (this.root == null) { this.root = new Node(data); }
        else {
            ArrayDeque<Node> queue = new ArrayDeque<>();
            queue.add(this.root);
            while (!queue.isEmpty()) {
                Node node = queue.pop();
                if (node.left == null) {node.left = new Node(data); return;}
                else {queue.add(node.left);}

                if (node.right == null) { node.right = new Node(data); return; }
                else {queue.add(node.right);}
            }

        }
    }

    public void insertByPath(int data, String path) {
        if (this.root == null) { this.root = new Node(data);}
        else { IBP(this.root, data, path); }
    }

    private void IBP(Node curr, int data, String path) {
        for (int i = 0; i < path.length()-1; i++) {
            int p = Integer.parseInt(path.substring(i, i+1));
            if (p == 1) { curr = curr.right; }
            else if (p == 0) { curr = curr.left; }
            if (curr == null) { System.err.println("Wrong path"); return; }
        }
        if (curr == null) { System.err.println("Wrong path"); return; }
        if (path.substring(path.length()-1).equals("1")) {
            curr.right = new Node(data);
        } else if (path.substring(path.length()-1).equals("0")) {
            curr.left = new Node(data);
        }
    }

    public void extendByPath(BTree tree, String path) {
        if (this.root == null) { this.root = tree.root; }
        else { EBP(this.root, tree, path);}
    }

    private void EBP(Node curr, BTree tree, String path) {
        for (int i = 0; i < path.length()-1; i++) {
            int p = Integer.parseInt(path.substring(i, i+1));
            if (p == 1) { curr = curr.right; }
            else if (p == 0) { curr = curr.left; }
            if (curr == null) { System.err.println("Wrong path"); return; }
        }
        if (curr == null) { System.err.println("Wrong path"); return; }
        if (path.substring(path.length()-1).equals("1")) {
            curr.right = tree.root;
        } else if (path.substring(path.length()-1).equals("0")) {
            curr.left = tree.root;
        }
    }

    public void remove(int data) {
        this.root = recRemove(this.root, data);
    }

    private Node recRemove(Node curr, int data) {
        if (curr == null) { return null; }
        if (curr.data == data) {
            if (curr.left == null) {
                return curr.right;
            } else if (curr.right == null) {
                return curr.left;
            }

            Node last = findLast(curr.right);
            curr.data = last.data;
            curr.right = recRemove(curr.right, last.data);

        } else {
            curr.left = recRemove(curr.left, data);
            curr.right = recRemove(curr.right, data);
        }
        return curr;
    }

    private Node findLast(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public int size() {
        return recSize(this.root);
    }

    private int recSize(Node curr) {
        if (curr == null) {return 0;}
        else { return recSize(curr.left) + recSize(curr.right) + 1; }
    }

    private boolean isleaf(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        walk(this.root, 0);
    }

    public String leafSearch(String name) {
        if (this.root == null) { System.err.println("Cannot search in empty list"); return "";}
        else { return recSearch(this.root, name, ""); }
    }

    private String recSearch(Node curr, String name, String path) {

        if (curr == null || curr.name == null || name == null) { return ""; }

        else if (curr.name.equals(name) && isleaf(curr)) {

            return path; }
        else {
            String p1 = recSearch(curr.left, name, path+"0");
            String p2 = recSearch(curr.right, name, path+"1");
            if (!p1.equals("")) { return p1; }
            else if (!p2.equals("")) { return p2; }
        }
        return "";
    }

    private void walk(Node node, int depth) {
        if (node == null) { return; }
        walk(node.left, depth + 1);
        System.out.println(" ".repeat(6 * depth) + node );
        walk(node.right,depth+1);
    }

    private int heightWalk(Node node, int depth) {
        if (node == null) { return depth; }
        int depth1 = heightWalk(node.left, depth + 1);
        int depth2 = heightWalk(node.right,depth + 1);
        if ( depth1 > depth2 ) { return depth1; }
        if ( depth1 < depth2 ) { return depth2; }
        else { return depth1; }
    }

    public int getHeight() {
        return heightWalk(this.root, 0);
    }

    public boolean equals(BTree tree) {
        if (this.root == null && tree.root == null) { return true; }
        else if (this.root == null || tree.root == null) { return false; }
        else if (this.root.data != tree.root.data ) { return false;}
        else {
            ArrayDeque<Node> queue1 = new ArrayDeque<>();
            ArrayDeque<Node> queue2 = new ArrayDeque<>();
            queue1.add(this.root);
            queue2.add(tree.root);
            while (!queue1.isEmpty() && !queue2.isEmpty()) {
                boolean added1l = false, added1r = false, added2l = false, added2r = false;
                Node node1 = queue1.pop();
                Node node2 = queue2.pop();
                if (node1.data != node2.data) { return false; }

                if (node1.left != null) {queue1.add(node1.left); added1l = true;}
                if (node1.right != null) {queue1.add(node1.right); added1r = true;}

                if (node2.left != null) {queue2.add(node2.left); added2l = true;}
                if (node2.right != null) {queue2.add(node2.right); added2r = true;}

                if (added1l != added2l || added1r != added2r) { return false; }
            }
        }
        return true;
    }

    public Node getRoot() { return root; }
}
