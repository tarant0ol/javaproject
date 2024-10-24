package pr19.T2;

import java.util.Objects;

public class Node {
    Student student;
    Node next;

    public Node(int id, String name, double GPA) {
        this.student = new Student(id, name, GPA);
        this.next = null;
    }

    @Override
    public String toString() {
        return student.toString();
    }
}
