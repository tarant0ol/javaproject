package pr17_spiski1;

public class DoubleLinkedNode {
    // student
    String full_name;
    int age;
    DoubleLinkedNode next;
    DoubleLinkedNode prev;

    public DoubleLinkedNode(String full_name, int age) {
        this.full_name = full_name;
        this.age = age;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "full_name='" + full_name + '\'' +
                ", age=" + age +
                '}';
    }
}
