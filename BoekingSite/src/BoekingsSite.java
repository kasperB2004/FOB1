import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class BoekingsSite {
    private ArrayList<Boeking> boekings;
    public BoekingsSite() {
        boekings = new ArrayList<>();
    }

    public double getTotalePrijsBoekings(){
        double totaleprijs = 0;
        for (Boeking boeking:boekings) {
            totaleprijs += boeking.berekenPrijsBoeking();
        }
        return totaleprijs;
    }
    public double getTotalePrijsBoekingsVanHotel(String naam){
        double totaleprijs = 0;
        for (Boeking boeking:boekings) {
            if(boeking.getKamer().getHotel().getNaam().equals(naam) ){
                totaleprijs += boeking.berekenPrijsBoeking();
            }
        }
        return totaleprijs;
    }
    public void printAlleBoekings(){

        for (Boeking boeking:boekings) {
            System.out.println(boeking);
        }
    }
    public void removeBoekingsVan(String naam){
        Iterator<Boeking> it = boekings.iterator();
        while(it.hasNext()){
            Boeking boeking = it.next();
            if(boeking.getKamer().getHotel().getNaam().equals(naam) ){
               it.remove();
            }
        }
    }

    public void addBoeking(Boeking boeking){
        boekings.add(boeking);
    }
    public void addBoeking(String naamKlant, Kamer kamer , LocalDate aankomstDatum, int aantaldagen){
        boekings.add(new Boeking(naamKlant,kamer,aankomstDatum,aantaldagen));
    }




}
