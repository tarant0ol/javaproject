package pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        String regex = "(\\d+\\.?\\d+?) (USD|EUR|EU)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(string);

        while (m.find()) {
            System.out.println(m.group(1));
        }
    }

}
//213.132 USD, 123.123 EU, 201.1 EUR