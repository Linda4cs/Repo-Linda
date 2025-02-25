public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyrightDate;

    // Constructor to initialize the instance data
    public Book(String title, String author, String publisher, int copyrightDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCopyrightDate() {
        return copyrightDate;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCopyrightDate(int copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    // toString method for a nicely formatted description of the book
    public String toString() {
        return "Book Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Publisher: " + publisher + "\n" +
                "Copyright Date: " + copyrightDate;
    }
}