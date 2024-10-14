package pr11.T3;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

public class T3 {
    public static void main(String[] args) {
        List<Student> list = setArray();

        System.out.println("SHORT date ouput:");
        for (Student s: list) {
            System.out.println(s.toString("Short"));
        }

        System.out.println("MEDIUM date ouput:");
        for (Student s: list) {
            System.out.println(s.toString("Medium"));
        }

        System.out.println("LONG date ouput:");
        for (Student s: list) {
            System.out.println(s.toString("long"));
        }
    }

    public static List<Student> setArray(){
        Random rand = new Random();
        List<Student> list = new ArrayList<>();
        list.add(new Student(22, "Andrey", new GregorianCalendar(2005, 8-1, 27, rand.nextInt(60), rand.nextInt(60))));
        list.add(new Student(21, "Vladimir", new GregorianCalendar(rand.nextInt(2024), rand.nextInt(13), rand.nextInt(32), rand.nextInt(60), rand.nextInt(60))));
        list.add(new Student(12, "Alexey", new GregorianCalendar(2006, 3-1, 3, rand.nextInt(60), rand.nextInt(60))));
        list.add(new Student(23, "Artem", new GregorianCalendar(2006, 3-1, 12, rand.nextInt(60), rand.nextInt(60))));
        list.add(new Student(25, "Ivan", new GregorianCalendar(2005, 8-1, 12, rand.nextInt(60), rand.nextInt(60))));
        list.add(new Student(15, "Artem", new GregorianCalendar(2006, 3-1, 22, rand.nextInt(60), rand.nextInt(60))));
        list.add(new Student(8, "Anton", new GregorianCalendar(2005, 11-1, 16, rand.nextInt(60), rand.nextInt(60))));
        list.add(new Student(3, "Vsevolod", new GregorianCalendar(2005, 3-1, 4, rand.nextInt(60), rand.nextInt(60))));
        list.add(new Student(6, "Sergey", new GregorianCalendar(rand.nextInt(2024), rand.nextInt(13), rand.nextInt(32), rand.nextInt(60), rand.nextInt(60))));
        list.add(new Student(17, "Nikita", new GregorianCalendar(rand.nextInt(2024), rand.nextInt(13), rand.nextInt(32), rand.nextInt(60), rand.nextInt(60))));
        list.add(new Student(26, "Ekaterina", new GregorianCalendar(2005, 11-1, 28, rand.nextInt(60), rand.nextInt(60))));
        list.add(new Student(2, "Kamilla", new GregorianCalendar(2005, 3-1, 31, rand.nextInt(60), rand.nextInt(60))));
        return list;
    }
}


