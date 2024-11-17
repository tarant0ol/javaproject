package pr17_spiski1;

public class DoubleLinkedList {
    DoubleLinkedNode head;
    DoubleLinkedNode end;

    public DoubleLinkedList() {
        this.head = null;
        this.end = null;
    }

    public void insert(String full_name, int age) {
        DoubleLinkedNode new_node = new DoubleLinkedNode(full_name, age);
        if (this.head == null) {
            this.head = new_node;
            this.end = new_node;
        } else {
            this.end.next = new_node;
            new_node.prev = end;
            end = end.next;
        }
    }

    public void remove(String full_name, int age) {
        if (this.head == null) {
            System.out.println("List is empty");
            return;
        } else {
            if (this.head.full_name.equals(full_name) && this.head.age == age) {
                if (this.head.equals(this.end)) {
                    this.head = null;
                    this.end = null;
                } else {
                    this.head = this.head.next;
                    head.prev = null;
                }
            }else if (this.end.full_name.equals(full_name) && this.end.age == age) {
                this.end = this.end.prev;
                this.end.next = null;
            } else {
                DoubleLinkedNode curr_node = head;
                while (curr_node.next != null) {
                    if (curr_node.age == age && curr_node.full_name.equals(full_name)) {
                        curr_node.prev.next = curr_node.next;
                        curr_node.next.prev = curr_node.prev;
                    }
                    curr_node = curr_node.next;
                }
            }
        }
    }

    public void print_list() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            DoubleLinkedNode curr_node = this.head;
            while (curr_node != null) {
                System.out.println(curr_node);
                curr_node = curr_node.next;
            }
        }
    }

    public void remove_all() {
        this.head = null;
        this.end = null;
    }

    public Boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }
}
