public class Book {
    private String title;
    private String author;
    private boolean issued;

    // Static variable to track total issued books
    private static int totalIssuedBooks = 0;

    // Constructor
    public Book(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        this.issued = issued;
        if (issued) {
            totalIssuedBooks++;
        }
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIssued(boolean issued) {
        // Update totalIssuedBooks only if status changes
        if (this.issued != issued) {
            if (issued) {
                totalIssuedBooks++;
            } else {
                totalIssuedBooks--;
            }
        }
        this.issued = issued;
    }

    // Static method to show total issued books
    public static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
    }
}
public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", true);
        Book book2 = new Book("Five Point Someone", "Chetan Bhagat", false);
        Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);

        System.out.println("Book1 issued? " + book1.isIssued());
        System.out.println("Book2 issued? " + book2.isIssued());
        System.out.println("Book3 issued? " + book3.isIssued());

        Book.showTotalIssued();
    }
}
