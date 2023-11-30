public class Insurance {
    private int polisnummer ;
   private String nummerplaat;

   private boolean isPrive;
  private   int bonusmalus;


    public Insurance(int polisnummer, String nummerplaat, boolean isPrive) {
        this.polisnummer = polisnummer;
        this.nummerplaat = nummerplaat;
        this.isPrive = isPrive;
        this.bonusmalus = isPrive ? 11 : 14;
    }

    public void vervalDag(int aantal){
        bonusmalus += aantal > 1 ? 4 + 5 * (aantal - 1) : (aantal == 0) ? -1 : 4;
        if(bonusmalus > 22){
            bonusmalus = 22;
        }
        if(bonusmalus < 0){
            bonusmalus = 0;
        }
    }
    public void getOverzicht(){
        System.out.println("polisnummer is " + polisnummer + ", de nummer plaats is " + nummerplaat + ", de auto word in " + (isPrive ? "prive gebruikt " : " bedrijfs omstadigheden gebruikt ")+ "de huidige bonusmalus is "+bonusmalus );
    }


}

