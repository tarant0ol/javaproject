package pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        String regex = "((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))/((((0[13578])|(1[02]))/(([0-2][0-9])|(3[0-1])))|(((0[469])|(11))/(([0-2][0-9])|(30)))|((02)/(([0-1][0-9])|(2[0-8]))))";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(string);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
//1900/02/29 1899/01/01 9999/01/31 1901/04/30

// 1 мал, 1 болш, 1 цифр