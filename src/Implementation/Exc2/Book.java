package Implementation.Exc2;

public class Book {
    // Attributes
    private String title;
    private String author;
    private int numPages;

    // Constructor
    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = Math.max(numPages, 0); // Ensure page count is not negative
    }

    // Method to print a summary of the book
    public void printSummary() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Method to check if the book has more than 300 pages
    public boolean hasMoreThan300Pages() {
        return numPages > 300;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        if (numPages >= 0) {
            this.numPages = numPages;
        } else {
            System.out.println("Number of pages cannot be negative.");
        }
    }
}

