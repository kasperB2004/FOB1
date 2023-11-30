public class Kamer {
    private Hotel hotel;
    private int maxPersonen;
    private double prijs;
    private String kamerIdentifier;

    public Kamer(Hotel hotel, int maxPersonen, double prijs, String kamerIdentifier) {
        this.hotel = hotel;
        this.maxPersonen = maxPersonen;
        this.prijs = prijs;
        this.kamerIdentifier = kamerIdentifier;
    }

    public Kamer( int maxPersonen, double prijs, String kamerIdentifier, String hotelNaam,String straat ,int busnummer ,String gemeente ,String postcode , int sterren) {
        this(new Hotel(hotelNaam,straat, busnummer,gemeente,postcode,sterren),maxPersonen,prijs,kamerIdentifier);
    }

    public Hotel getHotel() {
        return hotel;
    }

    public int getMaxPersonen() {
        return maxPersonen;
    }

    public double getPrijs() {
        return prijs;
    }

    public String getKamerIdentifier() {
        return kamerIdentifier;
    }

    public String getDetailsKamer(){
        return "Kamer: " + kamerIdentifier + " voor " + maxPersonen + ((maxPersonen>1)?" personen":" persoon");
    }

    public String getDetailsHotelEnKamer(){
        return hotel + "\n" + getDetailsKamer();
    }
}
