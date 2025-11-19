import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main Library Management Application
 * Demonstrates OOP concepts, ArrayList usage, and user interaction
 */
public class LibraryApp {
    private ArrayList<Book> books;
    private Scanner scanner;
    
    public LibraryApp() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeBooks();
    }
    
    // Initialize with sample books
    private void initializeBooks() {
        books.add(new Book(1, "Java Programming", "James Gosling"));
        books.add(new Book(2, "Clean Code", "Robert Martin"));
        books.add(new Book(3, "Effective Java", "Joshua Bloch"));
    }
    
    // Display all books
    public void displayAllBooks() {
        System.out.println("\n=== Library Books ===");
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book book : books) {
            book.displayBookInfo();
        }
    }
    
    // Add a new book
    public void addBook() {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        
        Book newBook = new Book(id, title, author);
        books.add(newBook);
        System.out.println("Book added successfully!");
    }
    
    // Search for a book by ID
    public void searchBook() {
        System.out.print("Enter Book ID to search: ");
        int id = scanner.nextInt();
        
        for (Book book : books) {
            if (book.getBookId() == id) {
                book.displayBookInfo();
                return;
            }
        }
        System.out.println("Book not found!");
    }
    
    // Borrow a book
    public void borrowBook() {
        System.out.print("Enter Book ID to borrow: ");
        int id = scanner.nextInt();
        
        for (Book book : books) {
            if (book.getBookId() == id) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book borrowed successfully!");
                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
    
    // Return a book
    public void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = scanner.nextInt();
        
        for (Book book : books) {
            if (book.getBookId() == id) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
    
    // Display menu and run application
    public void run() {
        System.out.println("\n*** Welcome to Library Management System ***");
        
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Display All Books");
            System.out.println("2. Add New Book");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    borrowBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    System.out.println("Thank you for using Library Management System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.run();
    }
}
