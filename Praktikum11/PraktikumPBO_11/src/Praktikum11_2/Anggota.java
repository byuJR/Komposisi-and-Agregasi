package Praktikum11_2;

class Anggota {
    private String name;

    /**
     * Constructor for the Anggota class.
     * @param name The name of the member.
     */
    public Anggota(String name) {
        this.name = name;
    }

    /**
     * Displays information about the member.
     */
    public void infoAnggota() {
        System.out.println("Member Name: " + name);
    }
}
