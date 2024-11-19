import pr20.T5.Matrix;
import pr22.Stack;
import pr7.T7.Printable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Enter number of Practice you want to see (25 - 32) (to stop enter -1) : ");

            number = scanner.nextInt();
            if (number == -1) {break;}
            switch (number) {
                case (25):
                    System.out.println("Practice 25: Regular expressions");
                    RegExp solRegExp = new RegExp();
                    System.out.print("Choose number of task (1 - 4): ");
                    int regnum = scanner.nextInt();
                    switch (regnum) {
                        case (1):
                            solRegExp.T1();
                            break;
                        case (2):
                            solRegExp.T2();
                            break;
                        case (3):
                            solRegExp.T3();
                            break;
                        case (4):
                            solRegExp.T4();
                            break;
                        default:
                            System.err.println("Something went wrong...");
                    }
                    break;
                case(26):
                    System.out.println("Practice 26: Collections");
                    Collections solCollections = new Collections();
                    System.out.print("Choose number of task (1 - 2): ");
                    int colnum = scanner.nextInt();
                    switch(colnum){
                        case(1):
                            solCollections.T1();
                            break;
                        case(2):
                            solCollections.T2();
                            break;
                        default:
                            System.err.println("Something went wrong...");
                    }
                    break;
                case (27):
                    System.out.println("Practice 27: nonlinear data structures");
                    HashTab table = new HashTab();
                    table.hashtabAdd("a", 1);
                    table.hashtabAdd("b", 2);
                    table.hashtabAdd("c", 3);
                    table.hashtabAdd("d", 4);
                    table.hashtabAdd("e", 5);
                    table.hashtabAdd("f", 6);
                    table.hashtabAdd("g", 7);
                    table.hashtabAdd("h", 8);
                    table.hashtabAdd("i", 9);
                    table.hashtabAdd("j", 10);
                    System.out.println("Hashtable after adding:");
                    table.print();
                    table.hashtabDelete("b");
                    table.hashtabDelete("d");
                    table.hashtabDelete("f");
                    table.hashtabDelete("h");
                    table.hashtabDelete("j");
                    System.out.println("Hashtable after deleting some keys: ");
                    table.print();
                    System.out.println("Value on key 'c' " + table.hashtabLookUp("c"));
                    System.out.println("Value on key 'i' " + table.hashtabLookUp("i"));
                    break;
                case (28):
                    System.out.println("Practice 28: nonlinear data structures");
                    System.out.print("Choose number of task (1 - 2): ");
                    int datanum = scanner.nextInt();
                    switch (datanum) {
                        case(1):
                            Transition transition = new Transition();
                            transition.solve();
                            break;
                        case(2):
                            StringMap stringMap = new StringMap();
                            stringMap = stringMap.createMap();
                            System.out.println("Map:");
                            stringMap.print();
                            System.out.println("Number of people with same name: " + stringMap.getSameLastNameCount());
                            stringMap.remove("A");
                            stringMap.remove("B");
                            stringMap.remove("C");
                            stringMap.remove("D");

                            System.out.println("Map after removing some keys: ");
                            stringMap.print();
                            break;
                    }
                    break;
                case (29):
                    System.out.println("Practice 29: Graphs");
                    Graph solGraph = new Graph();
                    solGraph.solve();
                    break;
                case (30):
                    System.out.print("Choose subtask (1 - 2): ");
                    int subtask = scanner.nextInt();
                    switch (subtask) {
                        case (1):
                            System.out.println("Practice 30_1: Binary Tree");
                            HuffmanCodes solhuff = new HuffmanCodes();
                            solhuff.solve();
                            break;
                        case (2):
                            System.out.println("Practice 30_2: Binary Search Tree");
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
                            break;
                        default:
                            System.err.println("Something went wrong...");
                    }
                    break;
                case (31):
                    System.out.println("Practice 31: Two - Three Trees.");
                    TwoThreeTree tree = new TwoThreeTree();
                    Scanner procscanner = null;
                    try {
                        procscanner = new Scanner(new File("src/PROCS.txt"));
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    ArrayList<Integer> keys = new ArrayList<>();
                    while (procscanner.hasNext()) {
                        keys.add(Integer.parseInt(procscanner.nextLine()));
                    }
                    System.out.println("Init array:" + keys);
                    for (int key : keys) {
                        tree.insert(key);
                    }
                    tree.printTree();
                    break;
                case (32):
                    System.out.println("Practice 32: permutation generator");
                    System.out.print("Enter size of line to generate corresponding permutations:  ");
                    PermutationGenerator sol = new PermutationGenerator();
                    sol.generatePermutation();
                    break;
                default:
                    System.err.println("Something went wrong...");
            }
        }

    }

    //Practice 25
    static class RegExp {
        public RegExp() {}

        public void T1() {
            Scanner sc = new Scanner(System.in);
            String string = sc.next();

            String regex = "abcdefghijklmnopqrstuv18340";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(string);
            if (m.find()) {
                System.out.println("Правильная строка");
            } else {
                System.out.println("Неправильная строка");
            }
        }

        public void T2() {
            Scanner sc = new Scanner(System.in);
            String string = sc.nextLine();

            String regex = "(\\d+\\.?\\d+?) (USD|EUR|EU)";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(string);

            while (m.find()) {
                System.out.println(m.group(1));
            }
        }

        public void T3() {
            Scanner sc = new Scanner(System.in);
            String string = sc.nextLine();

            String regex = "((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))/((((0[13578])|(1[02]))/(([0-2][0-9])|(3[0-1])))|(((0[469])|(11))/(([0-2][0-9])|(30)))|((02)/(([0-1][0-9])|(2[0-8]))))";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(string);

            while (m.find()) {
                System.out.println(m.group());
            }
        }

        public void T4() {
            Scanner sc = new Scanner(System.in);
            String string = sc.next();

            String regex1 = "([A-Z])";
            String regex2 = "([a-z])";
            String regex3 = "([0-9])";
            String regex4 = "([0-9A-Za-z_])";
            String regex5 = ".{8}";
            Pattern p1 = Pattern.compile(regex1);
            Matcher m1 = p1.matcher(string);
            Pattern p2 = Pattern.compile(regex2);
            Matcher m2 = p2.matcher(string);
            Pattern p3 = Pattern.compile(regex3);
            Matcher m3 = p3.matcher(string);
            Pattern p4 = Pattern.compile(regex4);
            Matcher m4 = p4.matcher(string);
            Pattern p5 = Pattern.compile(regex5);
            Matcher m5 = p5.matcher(string);


            if (m1.find() && m2.find() && m3.find() && m4.find() && m5.find()) {
                System.out.println("Пароль надежен");
            } else {
                System.out.println("Пароль не надежен");
            }
        }
    }

    // <For Practice 26>
    static class Node {
        int num;
        Node next;

        public Node(int num) {
            this.num = num;
            this.next = null;
        }

        @Override
        public String toString() {
            return String.valueOf(this.num);
        }
    }

    static class LinkedList {
        Node head;

        public LinkedList() {
            this.head = null;
        }

        public void insert(int num){
            Node new_node = new Node(num);
            new_node.next = null;
            if (this.head == null) {
                this.head = new_node;
            } else {
                Node last = this.head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = new_node;
            }
        }

        public void remove(int num) {
            if (this.head == null) {
                System.out.println("empty list");
            } else {
                if (this.head.num == num) {
                    this.head = head.next;
                } else {
                    Node curr_node = this.head;
                    while (curr_node.next != null) {
                        if (curr_node.next.num == num){
                            curr_node.next = curr_node.next.next;
                            return;
                        }
                        curr_node = curr_node.next;
                    }

                }
            }
        }

        public void print_list() {
            if (this.head == null) {
                System.out.println("Linked list is empty");
            } else {
                Node current_node = this.head;

                while (current_node != null){
                    System.out.print(current_node + ", ");
                    current_node = current_node.next;
                }
                System.out.println();
            }
        }

        public void remove_all() {
            this.head = null;
        }

        public Boolean isEmpty() {
            return head == null;
        }

        public Iterator<Integer> iterator() {
            return new LinkedIterator(this);
        }
    }

    static class LinkedIterator implements Iterator<Integer>{
        Node curr;
        LinkedList list;
        public LinkedIterator(LinkedList list) {
            this.list = list;
            this.curr = list.head;
        }

        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public Integer next() {
            Node res = curr;
            curr = curr.next;
            return res.num;
        }
    }

    static class Collections {
        public Collections() {}

        public void T1() {
            int len = 10;
            ArrayList list = new ArrayList();
            Random random = new Random();

            for (int i = 0; i < len; i++) {
                list.add(random.nextInt(100));
                //list.add(i);
            }
            Stack stack = new Stack(len);
            Iterator itr = list.iterator();
            System.out.println("Before:\t" + list);
            while (itr.hasNext()) { stack.push((Integer)itr.next()); }
            for (int i = 0; i < len; i++) { list.set(i, stack.pop()); }
            System.out.println("After:\t" + list);
        }

        public void T2() {
            int len = 10;
            Random random = new Random();
            LinkedList list = new LinkedList();

            for (int i = 0; i < len; i++) { list.insert(random.nextInt(20)); }
            System.out.println("Printing using list function: ");
            list.print_list();

            Iterator itr = list.iterator();

            System.out.println("Printing using iterator:");
            while (itr.hasNext()) {
                int i = (Integer)itr.next();
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }
    // <\For Practice 26>

    // Practice 27
    static class HashTab implements Printable {
        private final int size = 10;
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>();

        public HashTab() {
            this.hashtabInit();
        }

        public int hashtabHash(String key) {
            return key.hashCode() % size;
        }

        public void hashtabInit() {
            for (int i = 0; i < size; i++) {
                list.add(Map.entry("", 0));
            }
        }

        public void hashtabAdd(String key, Integer num) {
            int index = hashtabHash(key);
            list.set(index, Map.entry(key, num));
        }

        public int hashtabLookUp(String key) {
            return list.get(hashtabHash(key)).getValue();
        }

        public void hashtabDelete(String key) {
            list.set(hashtabHash(key), Map.entry("", 0));
        }


        @Override
        public void print() {
            for (int i = 0; i < size; i++) {
                if (!Objects.equals(list.get(i), Map.entry("", 0))) {
                    System.out.print("[" + list.get(i).getKey() + ", " + list.get(i).getValue() + "], ");
                }
            }
            System.out.println();
        }
    }

    // <Practice 28>
    static class Transition {
        public Transition() {}

        public void solve() {
            HashSet<String> hashSet = new HashSet<>();
            Map<String, Integer> l = new HashMap<>();
            hashSet.add("Apple");
            hashSet.add("Banana");
            hashSet.add("Cherry");
            hashSet.add("Date");

            TreeSet<String> treeSet = new TreeSet<>(hashSet);

            System.out.println("Hashset элементы: " + hashSet);
            System.out.println("TreeSet элементы: " + treeSet);
        }
    }

    static class StringMap{
        private Map<String, String> map;

        public StringMap() {
            map = new HashMap<>();
        }

        public void put(String key, String value) { map.put(key, value); }
        public String get(String key) { return map.get(key); }
        public boolean containKey(String key) { return map.containsKey(key); }
        public void remove(String key) { map.remove(key); }
        public Set<String> keySet() { return map.keySet(); }
        public Collection<String> values() { return map.values(); }
        public int size() { return map.size(); }
        public boolean isEmpty() { return map.isEmpty(); }
        public void clear() { map.clear(); }
        public void print() {
            for (String i: map.keySet()) {
                System.out.println(i + ": " + map.get(i));
            }
        }

        public StringMap createMap() {
            StringMap res = new StringMap();
            res.put("Kipelov", "Anton");
            res.put("Chervyachkov", "Boris");
            res.put("Korsakov", "Dmitri");
            res.put("Kirieshki", "Pavel");
            res.put("Sklerov", "Vladimir");
            res.put("Korenets", "Aleksey");
            res.put("A", "Artem");
            res.put("C", "Aleksey");
            res.put("B", "Aleksey");
            res.put("D", "Aleksey");
            return res;
        }

        public int getSameLastNameCount() {
            HashMap<String, Integer> count = new HashMap<>();
            for (String i: map.values()) {
                if (count.get(i) == null) { count.put(i, 1); }
                else { count.replace(i, count.get(i) + 1); }
            }
            int sum = 0;
            for (int i: count.values()) {
                if (i >= 2) { sum += i; }
            }
            return sum;
        }
    }
    // <\Practice 28>

    // Practice 29
    static class Graph {
        public Graph() {}

        public void solve() {
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(sc.nextLine());
            Matrix<Integer> matrix = new Matrix<>(n, n);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int num = sc.nextInt();
                    matrix.setvalue(i, j, num);
                }
            }
            System.out.println("Our matrix: ");
            matrix.print_Matrix();

            int res = 0;
            for (int i = 0; i<n;i++){
                for (int j = i; j < n; j++) {
                    res += matrix.getvalue(i, j);
                }
            }

            System.out.println("result = " + res);
        }
    }

    // <Practice 30_1>
    static class BNode {
        int data;
        BNode left;
        BNode right;

        public BNode(int data) {
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

    static class BTree {
        private BNode root;

        public BTree() {
            this.root = null;
        }

        public BTree(int data) {
            this.root = new BNode(data);
        }

        // adding to full
        public void insert(int data) {
            if (this.root == null) { this.root = new BNode(data); }
            else {
                ArrayDeque<BNode> queue = new ArrayDeque<>();
                queue.add(this.root);
                while (!queue.isEmpty()) {
                    BNode node = queue.pop();
                    if (node.left == null) {node.left = new BNode(data); return;}
                    else {queue.add(node.left);}

                    if (node.right == null) { node.right = new BNode(data); return; }
                    else {queue.add(node.right);}
                }

            }
        }

        public void insertByPath(int data, String path) {
            if (this.root == null) { this.root = new BNode(data);}
            else { IBP(this.root, data, path); }
        }

        private void IBP(BNode curr, int data, String path) {
            for (int i = 0; i < path.length()-1; i++) {
                int p = Integer.parseInt(path.substring(i, i+1));
                if (p == 1) { curr = curr.right; }
                else if (p == 0) { curr = curr.left; }
                if (curr == null) { System.err.println("Wrong path"); return; }
            }
            if (curr == null) { System.err.println("Wrong path"); return; }
            if (path.substring(path.length()-1).equals("1")) {
                curr.right = new BNode(data);
            } else if (path.substring(path.length()-1).equals("0")) {
                curr.left = new BNode(data);
            }
        }

        public void extendByPath(BTree tree, String path) {
            if (this.root == null) { this.root = tree.root; }
            else { EBP(this.root, tree, path);}
        }

        private void EBP(BNode curr, BTree tree, String path) {
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

        private BNode recRemove(BNode curr, int data) {
            if (curr == null) { return null; }
            if (curr.data == data) {
                if (curr.left == null) {
                    return curr.right;
                } else if (curr.right == null) {
                    return curr.left;
                }

                BNode last = findLast(curr.right);
                curr.data = last.data;
                curr.right = recRemove(curr.right, last.data);

            } else {
                curr.left = recRemove(curr.left, data);
                curr.right = recRemove(curr.right, data);
            }
            return curr;
        }

        private BNode findLast(BNode node) {
            BNode current = node;
            while (current.left != null) {
                current = current.left;
            }
            return current;
        }

        public int size() {
            return recSize(this.root);
        }

        private int recSize(BNode curr) {
            if (curr == null) {return 0;}
            else { return recSize(curr.left) + recSize(curr.right) + 1; }
        }

        private boolean isleaf(BNode node) {
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

        public String leafSearch(int data) {
            if (this.root == null) { System.err.println("Cannot search in empty list"); return "";}
            else { return recSearch(this.root, data, ""); }
        }

        private String recSearch(BNode curr, int data, String path) {
            if (curr == null) { return ""; }
            else if (curr.data == data && isleaf(curr)) { return path; }
            else {
                String p1 = recSearch(curr.left, data, path+"0");
                String p2 = recSearch(curr.right, data, path+"1");
                if (!p1.equals("")) { return p1; }
                else if (!p2.equals("")) { return p2; }
            }
            return "";
        }

        private void walk(BNode node, int depth) {
            if (node == null) { return; }
            walk(node.left, depth + 1);
            System.out.println(" ".repeat(6 * depth) + node );
            walk(node.right,depth+1);
        }

        private int heightWalk(BNode node, int depth) {
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
                ArrayDeque<BNode> queue1 = new ArrayDeque<>();
                ArrayDeque<BNode> queue2 = new ArrayDeque<>();
                queue1.add(this.root);
                queue2.add(tree.root);
                while (!queue1.isEmpty() && !queue2.isEmpty()) {
                    boolean added1l = false, added1r = false, added2l = false, added2r = false;
                    BNode node1 = queue1.pop();
                    BNode node2 = queue2.pop();
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

        public BNode getRoot() { return root; }
    }

    static class HuffmanCodes {
        public HuffmanCodes() {}

        public void solve() {
            HashMap<Integer, String> letters = new HashMap<>();
            {
                letters.put(12, "a");
                letters.put(4, "b");
                letters.put(15, "c");
                letters.put(8, "d");
                letters.put(25, "e");
            }
            ArrayList<BTree> array = new ArrayList<>();
            List<Integer> keys = new ArrayList<>(letters.keySet());
            System.out.println("Init values:");
            for (int i = 0; i < letters.size(); i++) {
                array.add(new BTree(keys.get(i)));
            } System.out.println(keys);

            for (int i = 0; i < letters.size()-1; i++) { step(array); }
            array.getFirst().print();
            BTree treeHuffman = array.getFirst();

            for (Integer i: letters.keySet()) {
                System.out.println(letters.get(i) + ":" + treeHuffman.leafSearch(i));
            }
        }

        private static int sum(BTree[] list) {
            int sum = 0;
            for (BTree i: list) {
                sum = sum + i.getRoot().data;
            }
            return sum;
        }

        private static BTree[] twoMins(ArrayList<BTree> array) {
            BTree smin = new BTree(1000000000);
            BTree min = array.getFirst();
            for (int i = 1; i < array.size(); i++) {
                if (array.get(i).getRoot().data < min.getRoot().data) {
                    smin = min;
                    min = array.get(i);
                } else if (array.get(i).getRoot().data < smin.getRoot().data) {
                    smin = array.get(i);
                }
            }
            return new BTree[]{smin, min};
        }

        private static void step(ArrayList<BTree> array) {
            BTree[] mins = twoMins(array);
            BTree res = new BTree(sum(mins));
            res.extendByPath(mins[0], "0");
            res.extendByPath(mins[1], "1");

            array.remove(mins[0]);
            array.set(array.indexOf(mins[1]), res);
        }
    }
    // <\Practice 30_1>

    
    // Practice 30_2
    static class BSTree {
        private BNode root;

        public BSTree() {
            this.root = null;
        }

        public void insert(int data) {
            if (root == null) { root = new BNode(data); }
            else { recursive_insert(root, data); }
        }

        private void recursive_insert(BNode curr, int data) {
            if (curr.data != data) {
                if (data < curr.data) {
                    if (curr.left == null) { curr.left = new BNode(data);}
                    else { recursive_insert(curr.left, data);}
                } else {
                    if (curr.right == null) { curr.right = new BNode(data);}
                    else { recursive_insert(curr.right, data);}
                }
            }
        }

        public void delete(int data) {
            this.root = recursive_delete(this.root, data);
        }

        public BNode recursive_delete(BNode curr, int data) {
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

                BNode min_larger_node = find_min(curr.right);
                curr.data = min_larger_node.data;
                curr.right = recursive_delete(curr.right, min_larger_node.data);
            }
            return curr;
        }

        private BNode find_min(BNode node) {
            BNode current = node;
            while (current.left != null) {
                current = current.left;
            }
            return current;
        }

        private static void walk(BNode node, int depth) {
            if (node == null) { return; }
            walk(node.left, depth + 1);
            System.out.println(" ".repeat(6 * depth) + node );
            walk(node.right,depth+1);
        }

        public void print() {
            walk(this.root, 0);
        }

        public int nodeCount() {
            return nC(this.root);
        }

        private int nC(BNode curr) {
            if (curr == null) {return 0;}
            else { return nC(curr.left) + nC(curr.right) + 1; }
        }
    }
    
    // Practice 31
    static class TwoThreeTree {
        private static class Node {
            int[] keys = new int[2];  // Хранение до двух ключей
            TwoThreeTree.Node[] children = new TwoThreeTree.Node[3];  // До трех дочерних узлов
            int keyCount = 0;  // Текущее количество ключей
            boolean isLeaf = true;

            boolean isFull() {
                return keyCount == 2;
            }
        }

        private TwoThreeTree.Node root;

        public TwoThreeTree() {
            root = new TwoThreeTree.Node();
        }

        public void insert(int key) {
            if (root.isFull()) {
                TwoThreeTree.Node newRoot = new TwoThreeTree.Node();
                newRoot.isLeaf = false;
                newRoot.children[0] = root;
                splitChild(newRoot, 0, root);
                root = newRoot;
            }
            insertNonFull(root, key);
        }

        private void insertNonFull(TwoThreeTree.Node node, int key) {
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

        private void splitChild(TwoThreeTree.Node parent, int index, TwoThreeTree.Node child) {
            TwoThreeTree.Node newChild = new TwoThreeTree.Node();
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

        private void printTree(TwoThreeTree.Node node, String prefix, boolean isTail) {
            System.out.println(prefix + (isTail ? "└── " : "├── ") + keysToString(node));
            if (!node.isLeaf) {
                for (int i = 0; i <= node.keyCount; i++) {
                    printTree(node.children[i], prefix + (isTail ? "    " : "│   "), i == node.keyCount);
                }
            }
        }

        private String keysToString(TwoThreeTree.Node node) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < node.keyCount; i++) {
                if (i > 0) sb.append(", ");
                sb.append(node.keys[i]);
            }
            return sb.toString();
        }
    }

    // Practice 32
    static class PermutationGenerator {
        private int n;
        private int dir[];
        private List<Integer> list;

        public PermutationGenerator() {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            dir = new int[n];
            list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {list.add(i+1); dir[i] = -1; }

        }

        private void printPermutation() {
            for (int i = 0; i < n; i++) {
                System.out.print(" " + list.get(i));
            }
            System.out.println();
        }

        private void Switch(int n1) {
            int indn1 = list.indexOf(n1);
            int dir1 = dir[indn1];

            list.set(indn1, list.get(indn1 + dir1));
            list.set(indn1 + dir1, n1);

            dir[indn1] = dir[indn1 + dir1];
            dir[indn1 + dir1] = dir1;
            printPermutation();
        }

        private boolean hasNext() {
            for (int i = 0; i < n; i++) {
                try {
                    if (list.get(i) > list.get(i + dir[i])) { return true; }
                } catch (IndexOutOfBoundsException _) {
                }
            }
            return false;
        }

        private void switchBiggerDirs(int num) {
            for (int i = 0; i< n; i++) {
                if (list.get(i) > num) {
                    dir[i] = -dir[i];
                }
            }
        }

        // returning number to switch by dir
        private int getNext() {
            int max = -1;
            for (int i = 0; i < n; i++) {
                try {
                    if (list.get(i) > list.get(i + dir[i]) && list.get(i) > max) {
                        max = list.get(i);
                    }
                } catch (Exception _) {
                }
            }
            switchBiggerDirs(max);
            return max;
        }

        public void generatePermutation() {
            printPermutation();
            while (hasNext()) {
                int sw = getNext();
                Switch(sw);
            }
        }
    }
}