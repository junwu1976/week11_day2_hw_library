import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1,book2,book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Harry Potter","J.K Rollen","Science Fiction");
        book2 = new Book("Lord of the Rings","J. R. R. Tolkien", "Fiction");
        book3 = new Book("Grimms' Fairy Tales","Brothers Grimm","Fairy");
    }

    @Test
    public void canGetBooksCount(){
        assertEquals(0,library.getBooksCount());
    }

    @Test
    public void canAddABook(){
        library.addBook(book1);
        assertEquals(1,library.getBooksCount());
        assertEquals(1,library.getBooksCountByGenre("Science Fiction"));
    }

    @Test
    public void canNotAddMoreThanCapicity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2,library.getBooksCount());
        assertEquals(1,library.getBooksCountByGenre("Science Fiction"));
        assertEquals(1, library.getBooksCountByGenre("Fiction"));
        assertEquals(0,library.getBooksCountByGenre("Fairy"));
    }
}
