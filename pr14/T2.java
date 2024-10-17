package pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        String regex = "abcdefghijklmnopqrstuv18340";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(string);
        if (m.find()) {
            System.out.println("Правильная строка");
        } else {
            System.out.println("Неправильная строка");
        }
    }
}
