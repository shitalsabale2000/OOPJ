import java.util.Scanner;

class Book {
    private int copiesAvailable;

    
    public void addCopies(int n) {
        if (n > 0) {
            copiesAvailable += n;
        } else {
            System.out.println("Invalid number of copies to add.");
        }
    }
    public void removeCopies(int n) {
        if (n <= 0) {
            System.out.println("Invalid number of copies to remove.");
        } else if (n > copiesAvailable) {
            System.out.println("Not enough copies available to remove.");
        } else {
            copiesAvailable -= n;
        }
    }
    public int getCopiesAvailable() {
        return copiesAvailable;
    }
}

public class LibraryQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();

        
        System.out.print("Enter number of copies to add: ");
        int add = sc.nextInt();
        b.addCopies(add);

      
        System.out.print("Enter number of copies to remove: ");
        int remove = sc.nextInt();
        b.removeCopies(remove);

        
        System.out.println("Copies available = " + b.getCopiesAvailable());

        sc.close();
    }
}
