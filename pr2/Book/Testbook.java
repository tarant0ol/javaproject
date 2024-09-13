package pr2.Book;

public class Testbook {
    public static void main(String[] args) {
        Book b1 = new Book("Jab", "Jabology", 1763);
        Book b2 = new Book("Jab1", "Jabology1", 1148);
        Book b3 = new Book("Jab2", "Jabology2", 988);
        Book b4 = new Book("Jab3", "Jabology3", 2024);
        Book b5 = new Book("Jab4", "Jabology4", 118);
        Book b6 = new Book("Jab5", "Jabology5", 12000);
        Book[] books = new Book[6];
        books[0] = b1; books[1] = b2; books[2] = b3; books[3] = b4; books[4] = b5; books[5] = b6;
        Bookshelf shelf = new Bookshelf(books);
        System.out.println("earliest book: " + shelf.earlest_book());
        System.out.println("latest book: " + shelf.latest_book());
        System.out.println(shelf.toString());
        System.out.println("///////////////");
        shelf.sort();
        System.out.println(shelf.toString());
    }
}
