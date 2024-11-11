package pr30;

public class Tree {
    private Node root;

    public Tree() {
        this.root = null;
    }

    public void insert(int data) {
        if (root == null) { root = new Node(data); }
        else { recursive_insert(root, data); }
    }

    private void recursive_insert(Node curr, int data) {
        if (curr.data != data) {
            if (data < curr.data) {
                if (curr.left == null) { curr.left = new Node(data);}
                else { recursive_insert(curr.left, data);}
            } else {
                if (curr.right == null) { curr.right = new Node(data);}
                else { recursive_insert(curr.right, data);}
            }
        }
    }

    public void delete(int data) {
        this.root = recursive_delete(this.root, data);
    }

    public Node recursive_delete(Node curr, int data) {
        if (curr == null) { return null;}
        if (data < curr.data) {
            curr.left = recursive_delete(curr.left, data);
        } else if(data > curr.data) {
            curr.right = recursive_delete(curr.right, data);
        } else {
            if (curr.left == null) {
                return curr.right;
            } else if (curr.right == null) {
                return curr.left;
            }

            Node min_larger_node = find_min(curr.right);
            curr.data = min_larger_node.data;
            curr.right = recursive_delete(curr.right, min_larger_node.data);
        }
        return curr;
    }


    private Node find_min(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }


    /*
    public void remove(int data) {
        if (root == null) {System.out.println("Can't"); return; }
        if (root.data == data) {System.out.println("Can't2"); return; }
        boolean isRight;

        Node curr = root;
        while (true) {
            if (curr.left.data == data) {isRight = false; break;}
            if (curr.right.data == data) {isRight = true; break;}
            if (data < curr.data) {curr = curr.left; }
            else { curr = curr.right; }
        }
        //System.out.println("Parent = " + curr + ", Onright? = " + isRight);

        if (isRight) {
            if (curr.right.right == null) { curr.right = curr.right.left; return;}
            else if (curr.right.left == null) {curr.right = curr.right.right; return;}
            else {

            }
        } else {
            if (curr.left.right == null) { curr.left = curr.left.left; return;}
            else if (curr.left.left == null) {curr.right = curr.left.right; return;}
        }
    }
     */

    private static void walk(Node node, int depth) {
        if (node == null) { return; }
        walk(node.left, depth + 1);
        System.out.println(" ".repeat(6 * depth) + node );
        walk(node.right,depth+1);
    }

    public void print() {
        walk(this.root, 0);
    }
}
