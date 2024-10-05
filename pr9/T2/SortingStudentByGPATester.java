package pr9.T2;

import pr9.Student;

import java.util.Random;

public class SortingStudentByGPATester {
    public static void main(String[] args) {
        Random rand = new Random();
        Student[] list = new Student[31];
        {
            list[0] = new Student(22, "Andrey", rand.nextDouble() * 5);
            list[1] = new Student(21, "Vladimir", rand.nextDouble() * 5);
            list[2] = new Student(12, "Alexey", rand.nextDouble() * 5);
            list[3] = new Student(23, "Artem", 5.0);
            list[4] = new Student(1, "Ernest", rand.nextDouble() * 5);
            list[5] = new Student(25, "Ivan", rand.nextDouble() * 5);
            list[6] = new Student(15, "Artem", rand.nextDouble() * 5);
            list[7] = new Student(8, "Anton", rand.nextDouble() * 5);
            list[8] = new Student(31, "Michail", rand.nextDouble() * 5);
            list[9] = new Student(20, "Akram", rand.nextDouble() * 5);
            list[10] = new Student(3, "Vsevolod", rand.nextDouble() * 5);
            list[11] = new Student(6, "Sergey", rand.nextDouble() * 5);
            list[12] = new Student(17, "Nikita", rand.nextDouble() * 5);
            list[13] = new Student(24, "Ilya", rand.nextDouble() * 5);
            list[14] = new Student(26, "Ekaterina", rand.nextDouble() * 5);
            list[15] = new Student(27, "Fedor", rand.nextDouble() * 5);
            list[16] = new Student(30, "Mark", rand.nextDouble() * 5);
            list[17] = new Student(10, "Margaret", rand.nextDouble() * 5);
            list[18] = new Student(9, "George", rand.nextDouble() * 5);
            list[19] = new Student(16, "Ivan", rand.nextDouble() * 5);
            list[20] = new Student(28, "Alexey", rand.nextDouble() * 5);
            list[21] = new Student(18, "Kirill", rand.nextDouble() * 5);
            list[22] = new Student(19, "Ekaterina", rand.nextDouble() * 5);
            list[23] = new Student(7, "Gleb", rand.nextDouble() * 5);
            list[24] = new Student(5, "Dato", rand.nextDouble() * 5);
            list[25] = new Student(4, "Ivan", rand.nextDouble() * 5);
            list[26] = new Student(11, "Polina", rand.nextDouble() * 5);
            list[27] = new Student(29, "Dmitry", rand.nextDouble() * 5);
            list[28] = new Student(14, "Dmitry", rand.nextDouble() * 5);
            list[29] = new Student(13, "Kirill", rand.nextDouble() * 5);
            list[30] = new Student(2, "Kamilla", rand.nextDouble() * 5);
        }
        SortingStudentsByGPA thing = new SortingStudentsByGPA();

        System.out.println("Before sorting by GPA:");
        print(list);
        quick_sort(list, 0, list.length-1);
        System.out.println("After sorting by GPA:");
        print(list);
    }

    public static void print(Student[] list){
        for (Student st: list) {
            System.out.println(st);
        }
    }

    public static void quick_sort(Student[] list, int start, int end){
        if (start < end) {
            int p = partition(list, start, end);

            quick_sort(list, start, p - 1);
            quick_sort(list, p + 1, end);
        }

    }

    private static int partition(Student[] list, int start, int end) {
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        Student pivot = list[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (comparator.compare(list[j], pivot) > 0) {
                i++;
                Student temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
        }
        i++;
        Student temp = list[i];
        list[i] = list[end];
        list[end] = temp;

        return i;
    }

}
