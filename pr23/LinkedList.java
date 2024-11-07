package pr23;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int num){
        Node new_node = new Node(num);
        new_node.next = null;
        if (this.head == null) {
            this.head = new_node;
        } else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void remove(int num) {
        if (this.head == null) {
            System.out.println("empty list");
        } else {
            if (this.head.num == num) {
                this.head = head.next;
            } else {
                Node curr_node = this.head;
                while (curr_node.next != null) {
                    if (curr_node.next.num == num){
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
            Node current_node = this.head;

            while (current_node != null){
                System.out.print(current_node + ", ");
                current_node = current_node.next;
            }
            System.out.println();
        }
    }

    public void remove_all() { this.head = null; }

    public Boolean isEmpty() {return head == null; }
}
