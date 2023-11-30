import java.awt.*;
import java.util.ArrayList;

public class Club {
    private String naam;
    private ArrayList<Boat> boats;
    private  ArrayList<Member> members;
    private  ArrayList<Reservation> reservations;

    public Club(String naam){
        this.naam = naam;
        boats = new ArrayList<>();
        members = new ArrayList<>();
        reservations = new ArrayList<>();
    }
    public void addBoat(Boat boat){
        boats.add(boat);
    }

    public void addReservation(Boat boat,Member member,double minutes){
        if(findBoat(boat) != null){
            if(findMember(member) == null){
                members.add(member);
                System.out.println("Member not stored yet adding to the list");
            }
            reservations.add(new Reservation(minutes,member,boat));
            System.out.println("Reservation added");

        }else{
            System.out.println("Boat is not in the list. Not able to create a reservation");
        }
    }

    public void printBoatList(){
        for (Boat boat:boats) {
            System.out.println(boat);
        }
    }
    public void printMemberList(){
        for (Member member:members) {
            System.out.println(member);
        }
    }
    public void printReservationList(){
        for (Reservation reservation:reservations) {
            System.out.println(reservation);
        }
    }
    public void printReservationListofBoat(String boatName){
        for (Reservation reservation:reservations) {
            if(reservation.getBoatReserved().getName().equals(boatName)){
                System.out.println(reservation);
            }
        }
    }
    public double getAmountToPayof(String member){
        double amount = 0;
        for (Reservation reservation:reservations) {
            if(reservation.getReservee().getFullName().equals(member)){
                amount += reservation.getCost();
            }
        }
        return amount;
    }


    private Boat findBoat(Boat boat) {
        Boat foundBoat = null;
        int index = 0;
        while(index < boats.size() && foundBoat == null){
            Boat tempBoat = boats.get(index);
            if(tempBoat.getName().equals(boat.getName())){
                foundBoat = tempBoat;
            }
            index++;
        }
        return foundBoat;
    }
    private Member findMember(Member member) {
        Member foundMember = null;
        int index = 0;
        while(index < members.size() && foundMember == null){
            Member tempMember = members.get(index);
            if(tempMember.getFullName().equals(member.getFullName())){
                foundMember = tempMember;
            }
            index++;
        }
        return foundMember;
    }


}
