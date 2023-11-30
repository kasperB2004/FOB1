public class Main {
    public static void main(String[] args) {
        Persoon persoon1 = new Persoon("   KATRIEN   ","      Deleu     ", 'v');
        System.out.println(persoon1.getFirstName()+ " " + persoon1.getLastName() + " " + persoon1.getSex());
        System.out.println(persoon1.aanspreektitel());
        System.out.println(persoon1.sorteernaam());
        System.out.println("-----------------");
        Persoon persoon2 = new Persoon("   FRank   "," De Jonghe     ", 'M');
        System.out.println(persoon2.getFirstName()+ " " + persoon2.getLastName() + " " + persoon2.getSex());
        System.out.println(persoon2.aanspreektitel());
        System.out.println(persoon2.sorteernaam());
        System.out.println("-----------------");
        Persoon persoon3 = new Persoon("   bOB   "," De Jonghe     ", 'M');
        System.out.println(persoon3.getFirstName()+ " " + persoon3.getLastName() + " " + persoon3.getSex());
        System.out.println(persoon3.aanspreektitel());
        System.out.println(persoon3.sorteernaam());
        System.out.println("-----------------");
        Persoon persoon4 = new Persoon("anne-laure","petit", 'v');
        System.out.println(persoon4.getFirstName()+ " " + persoon4.getLastName() + " " + persoon4.getSex());
        System.out.println(persoon4.aanspreektitel());
        System.out.println(persoon4.sorteernaam());

    }
}