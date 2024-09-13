package pr2.Book;

public class Bookshelf {
    private Book[] books;
    public Bookshelf(Book[] books) {
        this.books = books;
    }

    public int earlest_book() {
        int min = books[0].getYear();
        for (int i = 1; i < books.length; i++) {
            if (min > books[i].getYear()) {
                min = books[i].getYear();
            }
        }
        return min;
    }

    public int latest_book() {
        int max = books[0].getYear();
        for (int i = 1; i < books.length; i++) {
            if (max < books[i].getYear()) {
                max = books[i].getYear();
            }
        }
        return max;
    }

    public void sort() {
        for (int i = 0; i < books.length; i++){
            for (int j = 1; j < books.length; j++) {
                if (books[j - 1].getYear() > books[j].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j - 1];
                    books[j - 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString(){
        String ret = "Bookshelf: \n";
        for (int i = 0; i < books.length; i++){
            ret += "Books {Author name: " + books[i].getAuthor_name() + ", book name: " + books[i].getBook_name() + ", book year: " + books[i].getYear() + "}\n";
        }
        return ret;
    }
}
