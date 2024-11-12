package Tugas11;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    /**
     * Constructs an empty Library.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the library.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Displays information about all books in the library.
     */
    public void displayAllBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book.infoBook());
        }
    }
}
