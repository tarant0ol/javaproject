package pr11.T3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    // Жалуется что это календарь, но скорее всего для simpleformatstring нужен date
    private Calendar date;

    public Student(int id, String name, Calendar date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name;}
    public Calendar getDate() { return date; }
    public void setDate(Calendar date) { this.date = date;}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public String toString(String format) {
        return switch (format.toLowerCase()) {
            case "short" -> {
                SimpleDateFormat dateFormatterS = new SimpleDateFormat("y/M");
                yield "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", date=" + dateFormatterS.format(date.getTime()) +
                        '}';
            }
            case "medium" -> {
                SimpleDateFormat dateFormatterM = new SimpleDateFormat("y/M/d HH");
                yield "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", date=" + dateFormatterM.format(date.getTime()) +
                        '}';
            }
            case "long" -> {
                SimpleDateFormat dateFormatterL = new SimpleDateFormat("y/M/d HH:mm:ss");
                yield "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", date=" + dateFormatterL.format(date.getTime()) +
                        '}';
            }
            default -> "Exception";
        };
    }
}