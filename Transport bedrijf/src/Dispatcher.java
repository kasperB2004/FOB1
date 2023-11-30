import java.util.ArrayList;

public class Dispatcher {
    private ArrayList<Vrachtwagen> vrachtwagens;

    public Dispatcher(){
        vrachtwagens = new ArrayList<>();
    }

    public void voegVrachtwagenToe(Vrachtwagen vrachtwagen){
        vrachtwagens.add(vrachtwagen);
    }

    public void getInfo(String nummerplaat){
        Vrachtwagen vrachtwagen = getVrachwagen(nummerplaat);
        if(vrachtwagen != null){
            System.out.println(vrachtwagen.toString());
        }
    }

    public void setvrachtwageninonderhoud(String nummerplaat){

        Vrachtwagen vrachtwagen = getVrachwagen(nummerplaat);
        if(vrachtwagen != null){
            vrachtwagen.setInonderhoud();
        }
    }
    public void setvrachtwagenbuitenonderhoud(String nummerplaat){

        Vrachtwagen vrachtwagen = getVrachwagen(nummerplaat);
        if(vrachtwagen != null){
            vrachtwagen.setbuitenonderhoud();
        }
    }
    public void setVrachtwagensInGebruik(String nummerplaat){

        Vrachtwagen vrachtwagen = getVrachwagen(nummerplaat);
        if(vrachtwagen != null){
            vrachtwagen.setInGebruik();
        }
    }
    public void setVrachtwagensBuitenGebruik(String nummerplaat){

        Vrachtwagen vrachtwagen = getVrachwagen(nummerplaat);
        if(vrachtwagen != null){
            vrachtwagen.setBuitenGebruik();
        }
    }
    public Vrachtwagen getVrachwagen(String nummerplaat)
    {
            int i = 0;
            Vrachtwagen foundVrachtwagen = null;
            while(i < vrachtwagens.size() && foundVrachtwagen == null){
                Vrachtwagen vrachtwagen = vrachtwagens.get(i);
                if(vrachtwagen.getNummerplaat().equals(nummerplaat)){
                    foundVrachtwagen = vrachtwagen;
                }
                i++;
            }
            if(foundVrachtwagen == null)
            {
                System.out.println("Geen vrachtwagen met nummerplaat " + nummerplaat + " gevonden.");
            }
            return foundVrachtwagen;

    }
    public void schrapVrachtwagen(String nummerplaat){
        Vrachtwagen vrachtwagenteschrappen = getVrachwagen(nummerplaat);
        vrachtwagens.remove(vrachtwagenteschrappen);
    }

    public Vrachtwagen bepaalBesteVrachtwagen(double gewicht , double volume){
        Vrachtwagen besteVrachtwagen = null;

        for (Vrachtwagen vrachtwagen:vrachtwagens) {
            if(vrachtwagen.getVolumeCapciteit() >= volume && vrachtwagen.getLaadCapaciteit() >= gewicht && !(vrachtwagen.heeftlading() || vrachtwagen.isInonderhoud())){
                if(besteVrachtwagen == null){
                     besteVrachtwagen = vrachtwagen;
                }else if((vrachtwagen.getVolumeCapciteit() == besteVrachtwagen.getVolumeCapciteit() &&
                        vrachtwagen.getLaadCapaciteit() < besteVrachtwagen.getLaadCapaciteit()) ||
                        (vrachtwagen.getVolumeCapciteit() < besteVrachtwagen.getVolumeCapciteit() &&
                        vrachtwagen.getLaadCapaciteit() == besteVrachtwagen.getLaadCapaciteit() || (vrachtwagen.getVolumeCapciteit() < besteVrachtwagen.getVolumeCapciteit() &&
                                vrachtwagen.getLaadCapaciteit() < besteVrachtwagen.getLaadCapaciteit())) ){
                    besteVrachtwagen = vrachtwagen;
                }

            }
        }
        if(besteVrachtwagen != null){

            besteVrachtwagen.setInGebruik();
        }
        return besteVrachtwagen;
    }



}
