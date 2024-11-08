package pr26;

import java.util.Iterator;
import java.util.Random;

public class T2 {
    public static void main(String[] args) {
        int len = 10;
        Random random = new Random();
        LinkedList list = new LinkedList();

        for (int i = 0; i < len; i++) { list.insert(random.nextInt(20)); }
        System.out.println("Printing using list function: ");
        list.print_list();

        Iterator itr = list.iterator();

        System.out.println("Printing using iterator:");
        while (itr.hasNext()) {
            int i = (Integer)itr.next();
            System.out.print(i + ", ");
        }

    }
}
