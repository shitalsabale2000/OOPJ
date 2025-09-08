
class Book {
    private int bookId;
    private String title, author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
}


interface Notifyable {
    void sendNotification(String message);
}


abstract class LibraryMember implements Notifyable {
    int memberId;
    String name;
    java.util.List<Book> borrowedBooks = new java.util.ArrayList<>();

    LibraryMember(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    abstract void borrowBook(Book book);
}

class StudentMember extends LibraryMember {
    StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(Book book) {
        if (borrowedBooks.size() < 3) {
            borrowedBooks.add(book);
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}


class FacultyMember extends LibraryMember {
    FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    void borrowBook(Book book) {
        if (borrowedBooks.size() < 5) {
            borrowedBooks.add(book);
        }
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + name + ": " + message);
    }
}


public class LibrarySystemDemoQ30 {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Java", "Author A");
        Book b2 = new Book(2, "Python", "Author B");
        Book b3 = new Book(3, "C++", "Author C");
        Book b4 = new Book(4, "HTML", "Author D");

        StudentMember student = new StudentMember(101, "Amit");
        FacultyMember faculty = new FacultyMember(201, "Prof. Singh");

        student.borrowBook(b1);
        student.borrowBook(b2);

        faculty.borrowBook(b1);
        faculty.borrowBook(b2);
        faculty.borrowBook(b3);
        faculty.borrowBook(b4);

        System.out.println("StudentMember " + student.name + " borrowed " + student.borrowedBooks.size() + " books");
        System.out.println("FacultyMember " + faculty.name + " borrowed " + faculty.borrowedBooks.size() + " books");

        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}
