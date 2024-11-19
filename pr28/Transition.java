package pr28;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class Transition {
    public static void main(String[] args) {
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
