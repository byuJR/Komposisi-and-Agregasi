package Tugas11;

class Book {
    private String title;
    private Author author;

    /**
     * Constructs a Book with the given title and author.
     * @param title The title of the book.
     * @param author The author of the book.
     */
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Provides information about the book.
     * @return A string containing the book's title and author information.
     */
    public String infoBook() {
        return "Book: " + title + " | " + author.infoAuthor();
    }
}
