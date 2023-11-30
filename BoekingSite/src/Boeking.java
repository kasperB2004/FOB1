
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Boeking {
    private String naamKlant;
    private Kamer kamer;
    private LocalDate aankomstDatum;
    private int aantalnachten;

    public Boeking(String naamKlant, Kamer kamer, LocalDate aankomstDatum, int aantalnachten) {
        this.naamKlant = naamKlant;
        this.kamer = kamer;
        this.aankomstDatum = aankomstDatum;
        if(aantalnachten < 1){
            System.out.println("Aantal nachten kan niet kleiner zijn dan 1. Deze is op 1 gezet");
            this.aantalnachten = 1;
        }
        else{
            this.aantalnachten = aantalnachten;
        }

    }

    public String getNaamKlant() {
        return naamKlant;
    }

    public Kamer getKamer() {
        return kamer;
    }

    public LocalDate getAankomstDatum() {
        return aankomstDatum;
    }

    public int getAantalnachten() {
        return aantalnachten;
    }

    public double berekenPrijsBoeking(){
        return kamer.getPrijs() * aantalnachten;
    }
    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Boeking van " + naamKlant + "\n" +
                kamer.getDetailsHotelEnKamer() + "\n" +
                "datum aankomst: " + dtf.format(aankomstDatum)+ ", datum vertrek: " + dtf.format(aankomstDatum.plusDays(aantalnachten)) + "\n"+
                "totaalprijs verblijf: " + berekenPrijsBoeking();
    }
}
