package pr13.T1;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        // 1 номер 2 пункт
        System.out.println(string.charAt(string.length()-1));

        // 1 номер 3 пункт
        if (string.endsWith("!!!")) {
            System.out.println("Строка заканчивается на \"!!!\"");
        } else {
            System.out.println("Строка не заканчивается на !!!");
        }

        // 1 номер 4 пункт
        if (string.toLowerCase().startsWith("i like")) {
            System.out.println("Строка начинается на \"I like\"");
        } else {
            System.out.println("Строка не начинается на \"I like\"");
        }

        // 1 номер 5 пункт
        if (string.toLowerCase().contains("java")) {
            // 1 номер 6 пункт
            int c = string.toLowerCase().indexOf("java");
            // 1 номер 10 пункт
            String jstring = string.substring(c, c + 4);
            System.out.println("Строка содержит \"Java\" на позиции " + c);
            System.out.println(jstring);

        } else {
            System.out.println("Строка не содержит \"Java\"");
        }

        // 1 номер 7 пункт
        String string1 = string.replace('a', 'o');
        print(string1);

        // 1 номер 8 пункт
        String string2 = string.toUpperCase();
        print(string2);

        // 1 номер 9 пункт
        String string3 = string.toLowerCase();
        print(string3);



    }

    // 1 номер 1 пункт
    public static void print(String s) {
        System.out.println(s);
    }
}
