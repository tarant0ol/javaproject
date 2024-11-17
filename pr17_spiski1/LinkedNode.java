package pr17_spiski1;

public class LinkedNode {
    // student
    String full_name;
    int age;
    LinkedNode next;

    public LinkedNode(String full_name, int age) {
        this.full_name = full_name;
        this.age = age;
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
