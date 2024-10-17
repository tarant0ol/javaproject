package pr13.T6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class T6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        setList(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.print(list);
        System.out.println("\n");

        String result = solve(list);
        System.out.println(result);
    }


    public static String solve(List<String> list) {
        for (int i=0; i<list.size();i++){
            swap(list, i);
            String result = try_solve(list);
            if (!result.equals("увы")) {
                return result;
            }
        }
        return "Невозможно создать такой ряд";
    }

    public static String try_solve(List<String> list) {
        List<String> result = new ArrayList<>();
        List<Boolean> used = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) used.add(false);

        if (backtrack(list.getFirst(), list, result, used)) {
            return construct(result);
        } else {
            return "увы";
        }

    }

    private static Boolean backtrack(String word, List<String> list, List<String> result, List<Boolean> used) {
        result.add(word);
        used.set(list.indexOf(word), true);

        for (int i = 0; i < list.size(); i++) {
            if (!used.get(i) && word.charAt(word.length()-1) == list.get(i).charAt(0)) {
                if (backtrack(list.get(i), list, result, used)) {
                    return true;
                }
            }
        }

        if (allUsed(used)) return true;

        result.removeLast();
        used.set(list.indexOf(word), false);


        return false;
    }

    public static Boolean allUsed(List<Boolean> used){
        for (Boolean b: used) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    private static String construct(List<String> list) {
        StringBuilder ans = new StringBuilder();
        for (String s: list) {
            ans.append(s).append(" ");
        }
        return ans.toString();
    }

    private static void swap(List<String> list, int i) {
        String temp = list.getFirst();
        list.set(0, list.get(i));
        list.set(i, temp);
    }

    public static void setList(List<String> list){
        try {
            File file = new File("src/pr13/T6/input.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                list.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
