package Tugas11;

class Author {
    private String authorName;

    /**
     * Constructs an Author with the given name.
     * @param authorName The name of the author.
     */
    public Author(String authorName) {
        this.authorName = authorName;
    }

    /**
     * Provides information about the author.
     * @return A string containing the author's name.
     */
    public String infoAuthor() {
        return "Author: " + authorName;
    }
}