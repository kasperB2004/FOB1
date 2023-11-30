import java.util.ArrayList;

public class Balie {
    private ArrayList<Lid> lids;
    private ArrayList<Boek> boeks;
    private ArrayList<Ontlening> ontlenings;

    public Balie(){
        lids = new ArrayList<>();
        boeks = new ArrayList<>();
        ontlenings = new ArrayList<>();
    }

    public void toevoegenlid(Lid lid){
        lids.add(lid);
    }
    public void toevoegenboek(Boek boek){
        boeks.add(boek);
    }
    public void ontleen(Lid lid , Boek boek){
        Boek gevondenboek = getBoek(boek.getId());
            if (!gevondenboek.isGeleend() && gevondenboek != null) {
                gevondenboek.leen();
                ontlenings.add(new Ontlening(lid, gevondenboek));
            } else {
                System.out.println("Boek is al geleend!");
            }
    }
    public void brengterug(int id){
        Boek gevondeboek = getBoek(id);
        if(gevondeboek != null && gevondeboek.isGeleend()){
            Ontlening ontlening = getOntlening(gevondeboek);
            ontlenings.remove(ontlening);
            gevondeboek.brengterug();

        }else{
            System.out.println("Kan geen boek terug brengen dat niet geleend is");
        }

    }

    public void printOverzichtGeleendeBoeken(){
        System.out.println("------------Geleende boeken------------");
        for (Ontlening ontlening:ontlenings) {
            System.out.println(ontlening.toString());

        }
    }

    public void printOverzichtAanwezigeBoeken(){
        System.out.println("-------------Vrije  boeken-------------");
        for (Boek boek:boeks) {
            if(!boek.isGeleend()){
                System.out.println(boek.toString());
            }
        }
    }

    public void printOntleendeBoekenVanPersoon(String naam){
        System.out.println("------------Geleende boeken van "+ naam + "------------");
        boolean heeftBoekenGeleend = false;
        for (Ontlening ontlening:ontlenings) {
            if(ontlening.getLid().getNaam().equals(naam)){
                System.out.println(ontlening.toString());
            }
            heeftBoekenGeleend = true;
        }
        if(!heeftBoekenGeleend){
            System.out.println("Deze persoon heeft geen boeken geleend");
        }
    }
    private Boek getBoek(int id) {
        int i = 0;
        Boek foundboek = null;
        while(i < boeks.size() && foundboek == null){
            Boek boek = boeks.get(i);
            if(boek.getId() == id){
                foundboek = boek;
            }
            i++;
        }
        if(foundboek == null)
        {
            System.out.println("Geen Boek met id " + id + " gevonden.");
        }
        return foundboek;

    }
    private Ontlening getOntlening(Boek boek){
        return getOntlening(boek.getId());
    }

    private Ontlening getOntlening(int id){
        int i = 0;
        Ontlening gevondenonteling = null;
        while(i < ontlenings.size() && gevondenonteling == null){
            Ontlening ontlening = ontlenings.get(i);
            if(ontlening.getBoek().getId() == id){
                gevondenonteling = ontlening;
            }
            i++;
        }
        if(gevondenonteling == null)
        {
            System.out.println("Geen Ontlening met boek id "+ id +" gevonden.");
        }
        return gevondenonteling;
    }


}
