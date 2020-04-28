public class Book {
    private String title,author,genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }


    public String getGenre() {
        return this.genre;
    }
}
