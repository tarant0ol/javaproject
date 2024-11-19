package pr28;

import java.util.*;

public class StringMap{
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

    public static void main(String[] args) {
        StringMap map = new StringMap();
        map = map.createMap();
        System.out.println("Map:");
        map.print();
        System.out.println("Number of people with same name: " + map.getSameLastNameCount());
    }
}
