public class Vrachtwagen {
    private final String nummerplaat;
    private final double volumeCapciteit;
    private final double laadCapaciteit;
    private boolean inonderhoud;
    private boolean heeftlading;

    public Vrachtwagen(String nummerplaat,double volumeCapciteit,double laadCapaciteit){
        inonderhoud = false;
        heeftlading = false;
        this.nummerplaat = nummerplaat;
        if(volumeCapciteit < 0 ){
            this.volumeCapciteit = 0;
            System.out.println("Volume capaciteit was onder 0. Dit is op nul gezet");
        }
        else{
            this.volumeCapciteit = volumeCapciteit;
        }
        if(laadCapaciteit < 0 ){
            this.laadCapaciteit = 0;
            System.out.println("laadcapaciteit was onder 0. Dit is op nul gezet");
        }
        else{
            this.laadCapaciteit = laadCapaciteit;
        }
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public double getVolumeCapciteit() {
        return volumeCapciteit;
    }

    public double getLaadCapaciteit() {
        return laadCapaciteit;
    }

    public boolean isInonderhoud() {
        return inonderhoud;
    }

    public boolean heeftlading() {
        return heeftlading;
    }

    public void setInonderhoud(){
        inonderhoud = true;
    }
    public void setbuitenonderhoud(){
        inonderhoud = false;
    }

    public void setInGebruik(){
        heeftlading = true;
    }
    public void setBuitenGebruik(){
        heeftlading = false;
    }

    public String toString(){
        return " Nummerplaat : " + nummerplaat + ", Volume : "
                + volumeCapciteit + "m3, LaadCapciteit : " + laadCapaciteit + "Kg, "
                + ((inonderhoud) ? "In onderhoud, " : "Buiten onderhoud, ")
                + ((heeftlading) ? " Heeft een lading" : " Heeft geen lading");
    }
}
