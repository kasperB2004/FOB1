public class Reservation {
    private  double timeReserved;
    private Member reservee;
    private  Boat boatReserved;

    public Reservation(double timeReserved, Member reservee, Boat boatReserved) {
        if (timeReserved <= 0){
            System.out.println("Cannot reserve a boat for 0 or less minutes, this has been changed to 30 minutes");
            this.timeReserved = 30;

        }else{
            this.timeReserved = timeReserved;
        }
        this.reservee = reservee;
        this.boatReserved = boatReserved;
    }

    public double getTimeReserved() {
        return timeReserved;
    }

    public Member getReservee() {
        return reservee;
    }

    public Boat getBoatReserved() {
        return boatReserved;
    }

    public void setTimeReserved(double timeReserved) {
        this.timeReserved = timeReserved;
    }

    public double getCost(){
        return timeReserved * boatReserved.getPrice() * (1 - reservee.getDiscountPercentage() / 100);
    }

    public String toString(){
        return "Reservation Details \n" +
                "Member : \n " + reservee + "\n" +
                "Boat : \n " + boatReserved + "\n" +
                "Reservation Cost : "+ getCost();
    }
}
