package Implementation.Exc9;

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
