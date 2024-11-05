package pr21;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        DoubleCircleList list = new DoubleCircleList();
        list.insert(1);
        list.insert(6);
        list.insert(2);
        list.insert(4);
        list.insert(3);
        list.insert(10);
        list.insert(7);
        list.insert(5);
        list.insert(9);
        list.insert(8);



        System.out.println("====== list:" + list.getSize());
        list.print_list();
        list.sort();

        System.out.println("====== list:" + list.getSize());
        list.print_list();
    }
}
