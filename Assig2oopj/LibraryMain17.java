class Book {
    private int bookId;
    private String title;
    private String author;

    // Constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private String libraryName;
    private static int totalBooks = 0;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    // Method to add book
    public void addBook(Book b) {
        totalBooks++;
        System.out.println("Added Book: " + b.getTitle() + " by " + b.getAuthor());
    }

    // Method to display total books
    public void displayTotalBooks() {
        System.out.println("Total Books in " + libraryName + ": " + totalBooks);
    }
}

public class LibraryMain17 {
    public static void main(String[] args) {
        Library lib = new Library("City Library");

        Book b1 = new Book(101, "Wings of Fire", "A.P.J. Abdul Kalam");
        Book b2 = new Book(102, "The Alchemist", "Paulo Coelho");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayTotalBooks();
    }
}
