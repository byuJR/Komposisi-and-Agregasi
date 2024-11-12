package Tugas11;

public class Main {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create authors
        Author author1 = new Author("Mahardika");
        Author author2 = new Author("Rachmadie");

        // Create books
        Book book1 = new Book("Java Krama", author1);
        Book book2 = new Book("Javanese Monggo", author2);
        Book book3 = new Book("Anjay and Anjay", author1);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books in the library
        library.displayAllBooks();
    }
}
