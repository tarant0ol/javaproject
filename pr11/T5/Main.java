package pr11.T5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.print("adding to ArrayList: ");
        long time1 = System.nanoTime();
        arrayList.add(11);
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);

        System.out.print("adding to LinkedList: ");
        long time3 = System.nanoTime();
        linkedList.add(11);
        long time4 = System.nanoTime();
        System.out.println(time4 - time3);

        System.out.println("======================");
        if ((time2 - time1) < (time4 - time3)){
            System.out.println("Adding to ArrayList is faster");
        } else if ((time2 - time1) > (time4 - time3)) {
            System.out.println("Adding to LinkedList is faster");
        } else { System.out.println("Its equal:/"); }
        System.out.println();

        System.out.print("inserting to ArrayList: ");
        long time5 = System.nanoTime();
        arrayList.add(5, 11);
        long time6 = System.nanoTime();
        System.out.println(time6 - time5);

        System.out.print("inserting to LinkedList: ");
        long time7 = System.nanoTime();
        linkedList.add(5, 11);
        long time8 = System.nanoTime();
        System.out.println(time8 - time7);

        System.out.println("======================");
        if ((time6 - time5) < (time8 - time7)){
            System.out.println("Inserting to ArrayList is faster");
        } else if ((time6 - time5) > (time8 - time7)) {
            System.out.println("inserting to LinkedList is faster");
        } else { System.out.println("Its equal:/"); }
        System.out.println();

        System.out.print("deleting from ArrayList: ");
        long time9 = System.nanoTime();
        arrayList.remove(3);
        long time10 = System.nanoTime();
        System.out.println(time10 - time9);

        System.out.print("deleting from LinkedList: ");
        long time11 = System.nanoTime();
        linkedList.remove(3);
        long time12 = System.nanoTime();
        System.out.println(time12 - time11);

        System.out.println("======================");
        if ((time10 - time9) < (time12 - time11)){
            System.out.println("Deleting from ArrayList is faster");
        } else if ((time10 - time9) > (time12 - time11)) {
            System.out.println("Deleting from LinkedList is faster");
        } else { System.out.println("Its equal:/"); }
        System.out.println();

        System.out.print("searching in ArrayList: ");
        long time13 = System.nanoTime();
        arrayList.indexOf(5);
        long time14 = System.nanoTime();
        System.out.println(time14 - time13);

        System.out.print("searching in LinkedList: ");
        long time15 = System.nanoTime();
        linkedList.indexOf(5);
        long time16 = System.nanoTime();
        System.out.println(time16 - time15);

        System.out.println("======================");
        if ((time14 - time13) < (time16 - time15)){
            System.out.println("Searching in ArrayList is faster");
        } else if ((time14 - time13) > (time16 - time15)) {
            System.out.println("Searching in LinkedList is faster");
        } else { System.out.println("Its equal:/"); }

    }
}
