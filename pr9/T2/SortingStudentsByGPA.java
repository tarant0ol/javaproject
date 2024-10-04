package pr9.T2;

import pr9.Student;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getGPA().compareTo(s2.getGPA());
    }
}
