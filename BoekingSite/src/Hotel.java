public class Hotel
{
    private String naam;
    private String straat;
    private int busnummer;
    private String gemeente;
    private  int sterren;
    private  String postcode;
    public Hotel(String naam, String straat, int busnummer, String gemeente, String postcode, int sterren) {
        this.naam = naam;
        this.straat = straat;
        this.busnummer = busnummer;
        this.gemeente = gemeente;
        this.postcode = postcode;
        this.sterren = sterren;
    }

    public String getNaam() {
        return naam;
    }

    public String getStraat() {
        return straat;
    }

    public int getBusnummer() {
        return busnummer;
    }

    public String getGemeente() {
        return gemeente;
    }

    public int getSterren() {
        return sterren;
    }

    public String toString(){
        return "HOTEL " + naam + " " + sterren + ((sterren>1 || sterren == 0) ? " steren" : " ster") + "\n" +
                straat + " " + busnummer + "\n" +
                postcode + " "+ gemeente;
    }
}


