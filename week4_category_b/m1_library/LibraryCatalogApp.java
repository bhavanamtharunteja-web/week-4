class LibraryBook {
    private String title;
    private String isbn;
    private boolean catalogued;

    // Primary constructor
    public LibraryBook(String title, String isbn) {
        this.title = title;
        // Default to "PENDING" if null or empty[cite: 1]
        this.isbn = (isbn == null || isbn.trim().isEmpty()) ? "PENDING" : isbn;
        this.catalogued = true;
    }

    // Constructor chaining using this()[cite: 1]
    public LibraryBook(String title) {
        this(title, "PENDING");
    }

    public void displayStatus() {
        System.out.println(this.title + " | " + this.isbn + " | Catalogued: " + this.catalogued);
    }
}

public class LibraryCatalogApp {
    public static void main(String[] args) {
        String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
        String[] isbns = {"978-0132350884", "", "9780451524935", ""};

        // Single-pass batch processing[cite: 1]
        for (int i = 0; i < titles.length; i++) {
            LibraryBook book;
            if (isbns[i] == null || isbns[i].trim().isEmpty()) {
                book = new LibraryBook(titles[i]);
            } else {
                book = new LibraryBook(titles[i], isbns[i]);
            }
            book.displayStatus();
        }
    }
}