package Praktikum11_1;


class Buku {
    private String judul;

    /**
     * Constructor for the Buku class.
     * @param judul The title of the book.
     */
    public Buku(String judul) {
        this.judul = judul;
    }

    /**
     * Prints information about the book.
     */
    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
    }
}