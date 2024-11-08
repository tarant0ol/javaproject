package pr26;


import pr22.Stack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class T1 {
    public static void main(String[] args) {
        int len = 10;
        ArrayList list = new ArrayList();
        Random random = new Random();

        for (int i = 0; i < len; i++) {
            list.add(random.nextInt(100));
            //list.add(i);
        }
        Stack stack = new Stack(len);
        Iterator itr = list.iterator();
        System.out.println("Before:\t" + list);
        while (itr.hasNext()) { stack.push((Integer)itr.next()); }
        for (int i = 0; i < len; i++) { list.set(i, stack.pop()); }
        System.out.println("After:\t" + list);

    }
}
