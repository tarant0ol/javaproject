package pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        String regex1 = "([A-Z])";
        String regex2 = "([a-z])";
        String regex3 = "([0-9])";
        String regex4 = "([0-9A-Za-z_])";
        String regex5 = ".{8}";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(string);
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(string);
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(string);
        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(string);
        Pattern p5 = Pattern.compile(regex5);
        Matcher m5 = p5.matcher(string);


        if (m1.find() && m2.find() && m3.find() && m4.find() && m5.find()) {
            System.out.println("Пароль надежен");
        } else {
            System.out.println("Пароль не надежен");
        }
    }
}
