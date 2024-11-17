package pr30_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HuffmanCodes {
    public static void main(String[] args) {
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

    public static int sum(BTree[] list) {
        int sum = 0;
        for (BTree i: list) {
            sum = sum + i.getRoot().data;
        }
        return sum;
    }

    public static BTree[] twoMins(ArrayList<BTree> array) {
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

    public static void step(ArrayList<BTree> array) {
        BTree[] mins = twoMins(array);
        BTree res = new BTree(sum(mins));
        res.extendByPath(mins[0], "0");
        res.extendByPath(mins[1], "1");

        array.remove(mins[0]);
        array.set(array.indexOf(mins[1]), res);
    }


}
