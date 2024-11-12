package Implementation.Exc9;

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
