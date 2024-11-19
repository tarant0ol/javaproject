package pr31;
class TwoThreeTree {
    private static class Node {
        int[] keys = new int[2];  // Хранение до двух ключей
        Node[] children = new Node[3];  // До трех дочерних узлов
        int keyCount = 0;  // Текущее количество ключей
        boolean isLeaf = true;

        boolean isFull() {
            return keyCount == 2;
        }
    }

    private Node root;

    public TwoThreeTree() {
        root = new Node();
    }

    public void insert(int key) {
        if (root.isFull()) {
            Node newRoot = new Node();
            newRoot.isLeaf = false;
            newRoot.children[0] = root;
            splitChild(newRoot, 0, root);
            root = newRoot;
        }
        insertNonFull(root, key);
    }

    private void insertNonFull(Node node, int key) {
        if (node.isLeaf) {
            int i = node.keyCount - 1;
            while (i >= 0 && key < node.keys[i]) {
                node.keys[i + 1] = node.keys[i];
                i--;
            }
            node.keys[i + 1] = key;
            node.keyCount++;
        } else {
            int i = node.keyCount - 1;
            while (i >= 0 && key < node.keys[i]) {
                i--;
            }
            i++;
            if (node.children[i].isFull()) {
                splitChild(node, i, node.children[i]);
                if (key > node.keys[i]) {
                    i++;
                }
            }
            insertNonFull(node.children[i], key);
        }
    }

    private void splitChild(Node parent, int index, Node child) {
        Node newChild = new Node();
        newChild.isLeaf = child.isLeaf;
        newChild.keyCount = 1;
        newChild.keys[0] = child.keys[1];

        if (!child.isLeaf) {
            newChild.children[0] = child.children[1];
            newChild.children[1] = child.children[2];
        }

        child.keyCount = 1;

        for (int j = parent.keyCount; j > index; j--) {
            parent.children[j + 1] = parent.children[j];
            parent.keys[j] = parent.keys[j - 1];
        }

        parent.keys[index] = child.keys[0];
        parent.children[index + 1] = newChild;
        parent.keyCount++;
    }

    public void printTree() {
        printTree(root, "", true);
    }

    private void printTree(Node node, String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + keysToString(node));
        if (!node.isLeaf) {
            for (int i = 0; i <= node.keyCount; i++) {
                printTree(node.children[i], prefix + (isTail ? "    " : "│   "), i == node.keyCount);
            }
        }
    }

    private String keysToString(Node node) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < node.keyCount; i++) {
            if (i > 0) sb.append(", ");
            sb.append(node.keys[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TwoThreeTree tree = new TwoThreeTree();
        int[] keys = {2, 5, 6, 1};
        for (int key : keys) {
            tree.insert(key);
        }
        tree.printTree();
    }
}

