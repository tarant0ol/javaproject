package pr19.T2;

import java.util.Random;

public class LabClass {
    static Random rand = new Random();
    public static LinkedList list = new LinkedList();
    public static void main(String[] args){
        try {
            list.insert(22, "Andrey", 4.8);
            list.insert(21, "Vladimir", rand.nextDouble() * 5);
            list.insert(12, "Alexey", rand.nextDouble() * 5);
            list.insert(23, "Artem", 5.0);
            list.insert(1, "Ernest", rand.nextDouble() * 5);
            list.insert(25, "Ivan", 4.3);
            list.insert(15, "Artem", rand.nextDouble() * 5);
            list.insert(8, "Anton", rand.nextDouble() * 5);
            list.insert(31, "Michail", rand.nextDouble() * 5);
            list.insert(20, "Akram", rand.nextDouble() * 5);
            list.insert(3, "Vsevolod", rand.nextDouble() * 5);
            list.insert(6, "Sergey", rand.nextDouble() * 5);
            list.insert(17, "Nikita", rand.nextDouble() * 5);
            list.insert(24, "Ilya", rand.nextDouble() * 5);
            list.insert(26, "Ekaterina", rand.nextDouble() * 5);
            list.insert(27, "Fedor", rand.nextDouble() * 5);
            list.insert(30, "Mark", rand.nextDouble() * 5);
            list.insert(10, "Margaret", rand.nextDouble() * 5);
            list.insert(9, "George", rand.nextDouble() * 5);
            list.insert(16, "Ivan", rand.nextDouble() * 5);
            list.insert(28, "Alexey", rand.nextDouble() * 5);
            list.insert(18, "Kirill", rand.nextDouble() * 5);
            list.insert(19, "Ekaterina", rand.nextDouble() * 5);
            list.insert(7, "Gleb", rand.nextDouble() * 5);
            list.insert(5, "Dato", rand.nextDouble() * 5);
            list.insert(4, "Ivan", rand.nextDouble() * 5);
            list.insert(11, "Polina", rand.nextDouble() * 5);
            list.insert(29, "Dmitry", rand.nextDouble() * 5);
            list.insert(14, "Dmitry", rand.nextDouble() * 5);
            list.insert(13, "Kirill", rand.nextDouble() * 5);
            list.insert(2, "Kamilla", rand.nextDouble() * 5);

        } catch (EmptyStringException e) {
            System.err.println(e);
            System.exit(-1);
        }
        list.print_list();
        System.out.println("List has length = " + list.length());

        try {
            list.remove(23, "Artem", 5.0);
            System.out.println("======================================");
            list.print_list();
            System.out.println("Now List has length = " + list.length());
        } catch (EmptyListException e) {
            System.err.println(e);
        }

        try {
            Student student = list.find(22, "Andrey", 4.8);
            System.out.println("======================");
            System.out.println("Found student: " + student);
        } catch (StudentNotFoundException e) {
            System.err.println(e);
        }

        try {
            list.selection_sort();
            System.out.println("=============================================");
            list.print_list();
        } catch (EmptyListException e) {
            System.err.println(e);
        }
    }
}
