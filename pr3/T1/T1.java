package pr3.T1;

import java.util.ArrayList;
import java.util.Random;

public class T1 {
    public static void main(String[] args) {
        ArrayList<Integer> list_Random = new ArrayList<>();
        ArrayList<Integer> list_random = new ArrayList<>();
        Random rand = new Random();
        int n = rand.nextInt(10) + 10;
        for (int i = 0; i < n; i++) {
            list_Random.add(rand.nextInt(100));
            list_random.add(Math.toIntExact(Math.round(1 + Math.random() * 9)));
        }
        System.out.println("Random: " + list_Random);
        System.out.println("random: " + list_random);
        list_Random.sort(null);
        list_random.sort(null);
        System.out.println("sorted Random: " + list_Random);
        System.out.println("sorted random: " + list_random);
    }
}
