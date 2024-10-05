package pr10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = setArray();
        System.out.println("Before sorting by GPA");
        print_Array(list);
        GPA_quick_reverse_sort(list);
        System.out.println("After sorting by GPA");
        print_Array(list);
        System.out.println("After sorting by GPA and name");
        name_GPA_sort(list);
        print_Array(list);

        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(40, "Tom", 3));
        list1.add(new Student(20, "Jerry", 4));
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(30, "Paul", 2));
        list2.add(new Student(35, "Antony", 4));
        list2.add(new Student(25, "Mike", 5));

        System.out.println();
        System.out.println("list1:");
        print_Array(list1);
        System.out.println("list2:");
        print_Array(list2);

        List<Student> concat_list = concat_and_sort(list1, list2);
        System.out.println("Concatenation of list1 and list2 with sorting by GPA and name");
        print_Array(concat_list);
    }

    private static List<Student> concat_and_sort(List<Student> list1, List<Student> list2) {
        List<Student> concat_list = new ArrayList<>(list1.size() + list2.size());
        concat_list.addAll(list1);
        concat_list.addAll(list2);
        name_GPA_sort(concat_list);
        return concat_list;
    }

    public static void print_Array(List<Student> list) {
        for (Student st: list){
            System.out.println(st);
        }
    }

    public static List<Student> setArray(){
        Random rand = new Random();
        List<Student> list = new ArrayList<>();
        list.add(new Student(22, "Andrey", rand.nextInt(5) + 1));
        list.add(new Student(21, "Vladimir", rand.nextInt(5) + 1));
        list.add(new Student(12, "Alexey", rand.nextInt(5) + 1));
        list.add(new Student(23, "Artem", 5));
        list.add(new Student(25, "Ivan", rand.nextInt(5) + 1));
        list.add(new Student(15, "Artem", rand.nextInt(5) + 1));
        list.add(new Student(8, "Anton", rand.nextInt(5) + 1));
        list.add(new Student(3, "Vsevolod", rand.nextInt(5) + 1));
        list.add(new Student(6, "Sergey", rand.nextInt(5) + 1));
        list.add(new Student(17, "Nikita", rand.nextInt(5) + 1));
        list.add(new Student(26, "Ekaterina", rand.nextInt(5) + 1));
        list.add(new Student(2, "Kamilla", rand.nextInt(5) + 1));
        return list;
    }

    public static void GPA_quick_reverse_sort(List<Student> list){
        GPA_quick_reverse_sort(list, 0, list.size()-1);
    }

    public static void GPA_quick_reverse_sort(List<Student> list, int start, int end){
        if (start < end) {
            int p = partition(list, start, end);

            GPA_quick_reverse_sort(list, start, p - 1);
            GPA_quick_reverse_sort(list, p + 1, end);
        }
    }

    public static int partition(List<Student> list, int start, int end) {
        GPAComparator comparator = new GPAComparator();
        Student pivot = list.get(end);
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (comparator.compare(list.get(j), pivot) < 0) {
                i++;
                Student temp = list.get(j);
                list.set(j, list.get(i));
                list.set(i, temp);
            }
        }
        i++;
        Student temp = list.get(i);
        list.set(i, list.get(end));
        list.set(end, temp);

        return i;
    }

    public static void name_GPA_sort(List<Student> list) {
        Comparator<Student> ngcomp = new GPAComparator().thenComparing(new NameComparator());
        Collections.sort(list, ngcomp);
    }
}
