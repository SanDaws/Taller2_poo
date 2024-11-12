package Classes.Exc9;

import java.util.ArrayList;
import java.util.List;

class Library {
    // List to hold books
    private List<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Method to lend a book by title
    public void lendBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.lend();
        } else {
            System.out.println("The book '" + title + "' is not in the library.");
        }
    }

    // Method to return a book by title
    public void returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("The book '" + title + "' is not in the library.");
        }
    }

    // Method to find a book by title
    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
        } else {
            System.out.println("Books in the Library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
class Book {
    // Attributes
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Book is available by default
    }

    // Method to lend the book
    public boolean lend() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book '" + title + "' has been lent.");
            return true;
        } else {
            System.out.println("The book '" + title + "' is currently unavailable.");
            return false;
        }
    }

    // Method to return the book
    public void returnBook() {
        isAvailable = true;
        System.out.println("The book '" + title + "' has been returned.");
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}