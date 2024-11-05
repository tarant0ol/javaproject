package pr21;

public class DoubleCircleList {
    DoubleCircleNode head;
    private int size;

    public int getSize() { return size; }

    public DoubleCircleList() {
        this.head = null;
    }

    public void insert(int num) {
        DoubleCircleNode new_node = new DoubleCircleNode(num);
        if (this.head == null) {
            this.head = new_node;
        } else if (this.head.next == null || this.head.prev == null) {
            new_node.next = this.head;
            new_node.prev = this.head;
            this.head.next = new_node;
            this.head.prev = new_node;
            this.head = new_node;
        } else {
            new_node.prev = this.head.prev;
            this.head.prev.next = new_node;
            new_node.next = this.head;
            this.head.prev = new_node;
            this.head = new_node;
        }
        size++;
    }

    public void remove(int num) {
        if (this.head == null) {
            System.out.println("List is empty");
            return;
        } else {
            size--;
            if (this.head.num == num) {
                this.head.prev.next = this.head.next;
                this.head.next.prev = this.head.prev;
                this.head = this.head.next;
            } else {
                DoubleCircleNode curr_node = this.head;
                do {
                    if (curr_node.num == num) {
                        curr_node.prev.next = curr_node.next;
                        curr_node.next.prev = curr_node.prev;
                    }
                    curr_node = curr_node.next;
                } while (curr_node != this.head);
            }
        }
    }

    public void print_list() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            DoubleCircleNode curr_node = this.head;
            System.out.println(curr_node);
            curr_node = curr_node.next;
            while (curr_node != this.head) {
                System.out.println(curr_node);
                curr_node = curr_node.next;
            }
        }
    }

    public void remove_all() {
        this.head = null;
    }

    public Boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public DoubleCircleNode get(int index) {
        DoubleCircleNode cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public void sort() {
        for (int i = 0; i < size; i++) {
            DoubleCircleNode cur = this.get(i);
            int min = 10000000;
            for (int j = i; j < size; j++) {
                if (cur.num < min) {
                    min = cur.num;
                }
                cur = cur.next;
            }
            this.remove(min);
            this.insert(min);
        }
    }
}
