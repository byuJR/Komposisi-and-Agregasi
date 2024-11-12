package Praktikum11_1;




public class Main {
    public static void main(String[] args) {
        // Create a new library instance
        Perpustakaan perpustakaan = new Perpustakaan();

        // Add books to the library
        perpustakaan.tambahBuku(new Buku("Belajar Java"));
        perpustakaan.tambahBuku(new Buku("Pemrograman Lanjut"));
        perpustakaan.tambahBuku(new Buku("Algoritma dan Struktur Data"));

        // Display information about all the books in the library
        perpustakaan.infoPerpustakaan();
    }
}