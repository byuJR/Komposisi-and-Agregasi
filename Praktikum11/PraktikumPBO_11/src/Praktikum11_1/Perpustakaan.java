package Praktikum11_1;

import java.util.ArrayList; // Import diikuti di bawah package
import java.util.List;
class Perpustakaan {
    private List<Buku> bukuList;

    /**
     * Constructor for the Perpustakaan class.
     * Initializes an empty list of books.
     */
    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    /**
     * Adds a book to the library's book list.
     * @param buku The book to be added.
     */
    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    /**
     * Prints information about all the books in the library.
     */
    public void infoPerpustakaan() {
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}
