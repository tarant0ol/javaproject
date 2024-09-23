package pr3.T3;

import java.util.ArrayList;
import java.util.Random;

public class T3 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            list.add(rand.nextInt(90) + 10);
        }
        System.out.println(list.get(0) + " " +  list.get(1) + " " +list.get(2) + " " +list.get(3));
        if (list.get(0) < list.get(1) && list.get(1) < list.get(2) && list.get(2) < list.get(3)) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
