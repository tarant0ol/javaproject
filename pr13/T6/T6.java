package pr13.T6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T6 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        setList(list);
        for (String s: list) {
            System.out.println(s);
        }

        String solve = solve(list);
        System.out.println(solve);
    }

    public static List<String> setList(List<String> list){
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
        return list;
    }

    public static String solve(List<String> list) {
        int n = list.size();
        StringBuilder ans = new StringBuilder().append(list.get(0));
        list.remove(0);
        for (int i = 0; i < n-1; i++) {
            String word = getLine(list, ans.charAt(ans.length()-1));
            list.remove(word);
            ans.append(" ").append(word);
        }

        return ans.toString();
    }

    public static String getLine(List<String> list, char find) {
        for (String s: list) {
            if (s.charAt(0) == find) {
                return s;
            }
        }
        return "-";
    }
}
