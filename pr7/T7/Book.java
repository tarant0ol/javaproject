package pr7.T7;

public class Book implements Printable{
    String name;
    String author;
    int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() { return name; }
    public int getYear() { return year; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public void setName(String name) { this.name = name; }
    public void setYear(int year) { this.year = year; }

    public void print(){
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", name, author, year);
    }
}
