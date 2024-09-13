package pr2.Author;

import java.lang.*;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        Author a1 = new Author("Artem", "skiki@edu.su", 'M');
        System.out.println(a1.toString());
        a1.setEmail(email);
        System.out.println(a1.getEmail());
    }
}
