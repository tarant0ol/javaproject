package pr26;

import java.util.Iterator;

public class LinkedIterator implements Iterator<Integer> {
    Node curr;
    LinkedList list;
    public LinkedIterator(LinkedList list) {
        this.list = list;
        this.curr = list.head;
    }

    @Override
    public boolean hasNext() {
        return curr != null;
    }

    @Override
    public Integer next() {
        Node res = curr;
        curr = curr.next;
        return res.num;
    }
}
