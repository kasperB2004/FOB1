public class Main {
    public static void main(String[] args) {
        Club club = new Club("Vives");

        Boat boat1 = new Boat("SpeedyBoat", 5, true, false);
        Boat boat2 = new Boat("LuxuryYacht", 30, false, true);
        Boat boat3 = new Boat("FishingBoat", 10, true, true);
        Boat boat4 = new Boat("Sailboat", 10, false, false);
        Boat boat5 = new Boat("PowerCruiser", 10, true, true);

        club.addBoat(boat1);
        club.addBoat(boat2);
        club.addBoat(boat3);
        club.addBoat(boat4);
        club.addBoat(boat5);

        Member member1 = new Member("Smith", "John", "+32478305218", 8);
        Member member2 = new Member("Johnson", "Alice", "+32478305298", 12);
        Member member3 = new Member("Davis", "Robert", "+32478574890", 15);
        Member member4 = new Member("Miller", "Emily", "+3247854678", 20);
        Member member5 = new Member("Brown", "William", "+32478300000", 25);


        club.addReservation(boat1, member1, 20);
        club.addReservation(boat2, member2, 180);
        club.addReservation(boat3, member3, 25);
        club.addReservation(boat4, member4, 12);
        club.addReservation(boat5, member5, 30);
        club.addReservation(boat1, member4, 18);
        club.addReservation(boat2, member1, 22);
        club.addReservation(boat3, member5, 14);
        club.addReservation(boat4, member3, 20);
        club.addReservation(boat5, member2, 16);

        club.printBoatList();
        club.printMemberList();
        club.printReservationList();
        club.printReservationListofBoat(boat1.getName());
        System.out.println(Math.round(club.getAmountToPayof(member2.getFullName())* 100.0) / 100.0);

    }
}