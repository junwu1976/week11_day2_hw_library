import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capicity;
    private HashMap<String,Integer> countByGenre;

    public Library(int capicity) {
        this.capicity = capicity;
        this.books = new ArrayList<Book>();
        this.countByGenre = new HashMap<String, Integer>();
    }

    public int getBooksCount() {
        return this.books.size();
    }

    public boolean isStockFull(){
        return this.getBooksCount() >= this.capicity? true:false;
    }

    public void addBook(Book book) {
        if(!this.isStockFull()){
            this.books.add(book);
            for(String k : countByGenre.keySet()){
                if(k == book.getGenre()){
                    countByGenre.put(k,countByGenre.get(k) + 1);
                }
            }
            countByGenre.put(book.getGenre(),1);
        }
    }

    public void lendBook(Book book) {
        this.books.remove(book);
        for(String k : countByGenre.keySet()){
            if(k == book.getGenre()){
                countByGenre.put(k,countByGenre.get(k) - 1);
            }
        }
    }

    public int getBooksCountByGenre(String genre) {
        for(String k : this.countByGenre.keySet()){
            if(k == genre){
                return this.countByGenre.get(k);
            }
        }
        return 0;
    }
}
