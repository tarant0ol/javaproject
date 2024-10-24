package pr19.T2;

import java.util.Objects;

public class Student implements Comparable<Student> {
    int id;
    String name;
    Double GPA;

    public Student(int id, String name, double GPA) {
        if (name.isEmpty()) {
            throw new EmptyStringException("name can't be empty string");
        }
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public Double getGPA() { return GPA; }
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name;}
    public void setGPA(Double GPA) {this.GPA = GPA;}

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.id, student.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
