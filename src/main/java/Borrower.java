import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> books;

    public Borrower(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }


    public String getName() {
        return this.name;
    }

    public void borrowBook(Book book, Library library) {
        this.books.add(book);
        library.lendBook(book);
    }

    public int booksCount() {
        return this.books.size();
    }
}
