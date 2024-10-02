package pr7.T7;

public class Journal implements Printable{
    String name;
    int year;

    public Journal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() { return year; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void setYear(int year) { this.year = year; }

    @Override
    public void print() {
        System.out.printf("Журнал %s, %d года выпускуа\n", this.name, this.year);
    }
}
