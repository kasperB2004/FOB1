public class Boek {
    private String titel;
    private String auteur;
    private String isbn;
    private  int id;
    private  boolean geleend;
    public Boek(String titel, String auteur, String isbn, int id) {
        this.titel = titel;
        this.auteur = auteur;
        this.isbn = isbn;
        this.id = id;
        geleend = false;
    }
    public String getTitel() {
        return titel;
    }
    public String getAuteur() {
        return auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isGeleend() {
        return geleend;
    }

    public void leen(){
        geleend = true;
    }
    public void brengterug(){
        geleend = false;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "ID : " + id +  " Titel : " + titel + " Auteur : " + auteur + " ISBN : " + isbn + " Geleend : " + geleend +" ";
    }

}
