package pr20.T1_T2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericTripleBox<Double, String, Integer> box = new GenericTripleBox<>(2.0, "Hello", 2);
        System.out.println(box);
    }
}
