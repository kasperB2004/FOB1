public class Lid {
    private String naam;
    private String gemeente;
    private String adres;

    public Lid(String naam, String gemeente, String adres) {
        this.naam = naam;
        this.gemeente = gemeente;
        this.adres = adres;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public String getGemeente() {
        return gemeente;
    }

    public String getAdres() {
        return adres;
    }

    public String toString(){
        return "Naam :"+ naam + " Gemeente : " + gemeente + " Adres : " + adres + " ";
    }
}
