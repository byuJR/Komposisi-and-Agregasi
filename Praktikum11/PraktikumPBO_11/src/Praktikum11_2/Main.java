package Praktikum11_2;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Klub class
        Klub club = new Klub("Programming Club");

        // Add members to the club
        club.addMember(new Anggota("Mahardika"));
        club.addMember(new Anggota("Bayu"));
        club.addMember(new Anggota("Rahmadi"));

        // Display information about the club and its members
        club.infoKlub();
    }
}
