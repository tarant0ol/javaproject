package pr30_1;

import java.util.ArrayList;
import java.util.HashMap;


public class HuffmanCodes {
    public static void main(String[] args) {
        HashMap<Character, Integer> letters;
        //String s1 = "кукушка хвалит петуха за то, что хвалит он кукушку";
        String s = "can you can a can as a canner can can a can?";
        System.out.println("Input string: " + s);
        letters = build_map(s);
        ArrayList<BTree> array = new ArrayList<>();
        System.out.println("Init frequencies:");
        for (Character i: letters.keySet()) {
            array.add(new BTree(i.toString(), letters.get(i)));
        }
        System.out.println(letters);

        for (int i = 0; i < letters.size()-1; i++) { step(array); }
        array.getFirst().print();
        BTree treeHuffman = array.getFirst();

        int word_len_sum = 0;
        int input_word_len = 0;
        for (Character i: letters.keySet()) {
            String code_word = treeHuffman.leafSearch(i.toString());
            word_len_sum += code_word.length();
            input_word_len += code_word.length() * letters.get(i);
            System.out.println(i + ":" + code_word);
        }

        float mean_letter_len = (float)word_len_sum / (float)letters.size();
        System.out.println("Mean word length = " + mean_letter_len);
        System.out.println("input word length = " + input_word_len);
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

    public static HashMap<Character, Integer> build_map(String string){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++){
            map.put(string.charAt(i), map.getOrDefault(string.charAt(i), 0) + 1);
        }
        return map;
    }




}
