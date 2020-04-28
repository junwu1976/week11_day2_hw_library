import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower tony;
    private Book book1;
    private Library library1;

    @Before
    public void before(){
        book1 = new Book("Lord of the Rings","J. R. R. Tolkien", "Fiction");
        tony = new Borrower("tony");
        library1 = new Library(2);
    }

    @Test
    public void canGetName(){
        assertEquals("tony",tony.getName());
    }

    @Test
    public void canBorrowABook(){
        library1.addBook(book1);
        tony.borrowBook(book1,library1);
        assertEquals(1,tony.booksCount());
        assertEquals(0,library1.getBooksCount());
        assertEquals(0,library1.getBooksCountByGenre("Fiction"));
    }
}
