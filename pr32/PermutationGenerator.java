package pr32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationGenerator {


    static Scanner scanner = new Scanner(System.in);
    static int n = scanner.nextInt();
    private static int dir[] = new int[n];
    static List<Integer> list = new ArrayList<>(n);

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) { list.add(i+1); dir[i] = -1;}
        generatePermutation();
    }

    private static void printPermutation() {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();
    }

    public static void Switch(int n1) {
        int indn1 = list.indexOf(n1);
        int dir1 = dir[indn1];

        list.set(indn1, list.get(indn1 + dir1));
        list.set(indn1 + dir1, n1);

        dir[indn1] = dir[indn1 + dir1];
        dir[indn1 + dir1] = dir1;
        printPermutation();
    }

    public static boolean hasNext() {
        for (int i = 0; i < n; i++) {
            try {
                if (list.get(i) > list.get(i + dir[i])) { return true; }
            } catch (IndexOutOfBoundsException _) {
            }
        }
        return false;
    }

    public static void switchBiggerDirs(int num) {
        for (int i = 0; i< n; i++) {
            if (list.get(i) > num) {
                dir[i] = -dir[i];
            }
        }
    }

    // returning number to switch by dir
    public static int getNext() {
        int max = -1;
        for (int i = 0; i < n; i++) {
            try {
                if (list.get(i) > list.get(i + dir[i]) && list.get(i) > max) {
                    max = list.get(i);
                }
            } catch (Exception _) {
            }
        }
        switchBiggerDirs(max);
        return max;
    }

    private static void generatePermutation() {
        printPermutation();
        while (hasNext()) {
            int sw = getNext();
            Switch(sw);
        }
    }
}
