public class Ontlening {
    private Lid lid;
    private Boek boek;

    public Ontlening(Lid lid, Boek boek) {
        this.lid = lid;
        this.boek = boek;
    }

    public Lid getLid() {
        return lid;
    }

    public Boek getBoek() {
        return boek;
    }

    public String toString(){
        return boek.toString() + lid.toString();
    }

}
