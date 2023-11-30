public class Main {
    public static void main(String[] args) {

        Dispatcher dispatcher = new Dispatcher();

        Vrachtwagen vrachtwagen1 = new Vrachtwagen("ABC1", 100, 20);
        Vrachtwagen vrachtwagen2 = new Vrachtwagen("ABC2", 75, 25);
        Vrachtwagen vrachtwagen3 = new Vrachtwagen("ABC3", 120, 40);
        Vrachtwagen vrachtwagen4 = new Vrachtwagen("ABC4", 50, 10);
        Vrachtwagen vrachtwagen5 = new Vrachtwagen("ABC5", 90, 15);
        Vrachtwagen vrachtwagen6 = new Vrachtwagen("ABC6", 110, 30);
        Vrachtwagen vrachtwagen7 = new Vrachtwagen("ABC7", 80, 22);
        Vrachtwagen vrachtwagen8 = new Vrachtwagen("ABC8", 130, 35);
        Vrachtwagen vrachtwagen9 = new Vrachtwagen("ABC9", 95, 18);
        Vrachtwagen vrachtwagen10 = new Vrachtwagen("ABC10", 105, 28);
        Vrachtwagen vrachtwagen11 = new Vrachtwagen("ABC11", 70, 12);
        Vrachtwagen vrachtwagen12 = new Vrachtwagen("ABC12", 115, 38);
        Vrachtwagen vrachtwagen13 = new Vrachtwagen("ABC13", 60, 8);
        Vrachtwagen vrachtwagen14 = new Vrachtwagen("ABC14", 125, 32);
        Vrachtwagen vrachtwagen15 = new Vrachtwagen("ABC15", 85, 24);
        Vrachtwagen vrachtwagen16 = new Vrachtwagen("ABC16", 140, 45);
        Vrachtwagen vrachtwagen17 = new Vrachtwagen("ABC17", 65, 14);
        Vrachtwagen vrachtwagen18 = new Vrachtwagen("ABC18", 150, 50);
        Vrachtwagen vrachtwagen19 = new Vrachtwagen("ABC19", 55, 9);
        Vrachtwagen vrachtwagen20 = new Vrachtwagen("ABC20", 145, 42);
        // Fail cases
        Vrachtwagen failVolume = new Vrachtwagen("FailVolume", -10, 50);
        Vrachtwagen failLoad = new Vrachtwagen("FailLoad", 30, -5);
        Vrachtwagen failBoth = new Vrachtwagen("FailBoth", -5, -10);

        dispatcher.voegVrachtwagenToe(vrachtwagen1);
        dispatcher.voegVrachtwagenToe(vrachtwagen2);
        dispatcher.voegVrachtwagenToe(vrachtwagen3);
        dispatcher.voegVrachtwagenToe(vrachtwagen4);
        dispatcher.voegVrachtwagenToe(vrachtwagen5);
        dispatcher.voegVrachtwagenToe(vrachtwagen6);
        dispatcher.voegVrachtwagenToe(vrachtwagen7);
        dispatcher.voegVrachtwagenToe(vrachtwagen8);
        dispatcher.voegVrachtwagenToe(vrachtwagen9);
        dispatcher.voegVrachtwagenToe(vrachtwagen10);
        dispatcher.voegVrachtwagenToe(vrachtwagen11);
        dispatcher.voegVrachtwagenToe(vrachtwagen12);
        dispatcher.voegVrachtwagenToe(vrachtwagen13);
        dispatcher.voegVrachtwagenToe(vrachtwagen14);
        dispatcher.voegVrachtwagenToe(vrachtwagen15);
        dispatcher.voegVrachtwagenToe(vrachtwagen16);
        dispatcher.voegVrachtwagenToe(vrachtwagen17);
        dispatcher.voegVrachtwagenToe(vrachtwagen18);
        dispatcher.voegVrachtwagenToe(vrachtwagen19);
        dispatcher.voegVrachtwagenToe(vrachtwagen20);

        // Fail cases
        dispatcher.voegVrachtwagenToe(failVolume);
        dispatcher.voegVrachtwagenToe(failLoad);
        dispatcher.voegVrachtwagenToe(failBoth);

        dispatcher.schrapVrachtwagen("ABC10");
        dispatcher.getInfo("ABC10");
        dispatcher.setvrachtwageninonderhoud("ABC6");
        dispatcher.getInfo("ABC6");
        dispatcher.setVrachtwagensInGebruik("ABC14");
        dispatcher.getInfo("ABC14");

        Vrachtwagen vrachtwagen = dispatcher.bepaalBesteVrachtwagen(25,90);
        System.out.println(vrachtwagen.toString());


    }
}