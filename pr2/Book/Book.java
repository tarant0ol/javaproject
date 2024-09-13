package pr2.Book;

public class Book {
    private String author_name;
    private String book_name;
    private int year;

    public Book(String author_name, String book_name, int year) {
        this.author_name = author_name;
        this.book_name = book_name;
        this.year = year;
    }

    public String getAuthor_name() { return author_name; }
    public String getBook_name() { return book_name; }
    public int getYear() { return year; }

    public void setAuthor_name(String author_name) { this.author_name = author_name; }
    public void setBook_name(String book_name) { this.book_name = book_name; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString(){
        return "Book {author name: " + author_name + ", book name: " + book_name + ", book_year: " + year + "}";
    }
}
