package Praktikum11_2;

import java.util.ArrayList;
import java.util.List;

class Klub {
    private String clubName;
    private List<Anggota> memberList;

    /**
     * Constructor for the Klub class.
     * @param clubName The name of the club.
     */
    public Klub(String clubName) {
        this.clubName = clubName;
        this.memberList = new ArrayList<>();
    }

    /**
     * Adds a member to the club's member list.
     * @param member The member to be added.
     */
    public void addMember(Anggota member) {
        memberList.add(member);
    }

    /**
     * Displays information about the club and all its members.
     */
    public void infoKlub() {
        System.out.println("Club Name: " + clubName);
        for (Anggota member : memberList) {
            member.infoAnggota();
        }
    }
}
