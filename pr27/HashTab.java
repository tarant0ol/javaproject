package pr27;


import pr7.T7.Printable;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class HashTab implements Printable {

    private final int size = 10;
    ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>();




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
