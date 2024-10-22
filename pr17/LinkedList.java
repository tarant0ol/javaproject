package pr17;

public class LinkedList {
    LinkedNode head;

    public LinkedList() {
        this.head = null;
    };

    public void insert(String full_name, int age){
        LinkedNode new_node = new LinkedNode(full_name, age);
        new_node.next = null;
        if (this.head == null) {
            this.head = new_node;
        } else {
            LinkedNode last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void remove(String full_name, int age) {
        if (this.head == null) {
            System.out.println("empty list");
            return;
        } else {
            if (this.head.full_name.equals(full_name) && this.head.age == age) {
                this.head = head.next;
            } else {
                LinkedNode curr_node = this.head;
                while (curr_node.next != null) {
                    if (curr_node.next.age == age && curr_node.next.full_name.equals(full_name)){
                        curr_node.next = curr_node.next.next;
                        return;
                    }
                    curr_node = curr_node.next;
                }

            }
        }
    }

    public void print_list() {
        if (this.head == null) {
            System.out.println("Linked list is empty");
        } else {
            LinkedNode current_node = this.head;

            while (current_node != null){
                System.out.println(current_node.toString());
                current_node = current_node.next;
            }
            System.out.println();
        }
    }

    public void remove_all() {
        this.head = null;
    }

    public Boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
}
