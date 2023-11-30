import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        BoekingsSite boekingsSite = new BoekingsSite();

        Hotel ibis = new Hotel("Ibis", "straat", 1, "IbisCity", "54321", 0);
        Kamer ibisKamer1 = new Kamer(ibis, 2, 150, "ibisKamer1");
        Kamer ibisKamer2 = new Kamer(ibis, 4, 300, "ibisKamer2");

        Hotel mercure = new Hotel("Mercure", "another street", 3, "Mercurecity", "12345", 1);
        Kamer mercureKamer1 = new Kamer(mercure, 2, 200, "mercureKamer1");
        Kamer mercureKamer2 = new Kamer(mercure, 3, 250, "mercureKamer2");

        Hotel parkHotel = new Hotel("ParkHotel", "park street", 4, "ParkCity", "67890", 2);
        Kamer parkHotelKamer1 = new Kamer(parkHotel, 1, 180, "parkHotelKamer1");

        boekingsSite.addBoeking("Alice", ibisKamer1, LocalDate.of(2023, 11, 21), 1);
        boekingsSite.addBoeking("Charlie", ibisKamer1, LocalDate.of(2023, 11, 22), 1);
        boekingsSite.addBoeking("David", ibisKamer2, LocalDate.of(2023, 11, 23), 1);
        boekingsSite.addBoeking("Eve", ibisKamer2, LocalDate.of(2023, 11, 24), 1);

        boekingsSite.addBoeking("Frank", mercureKamer1, LocalDate.of(2023, 11, 25), 2);
        boekingsSite.addBoeking("Grace", mercureKamer1, LocalDate.of(2023, 11, 26), 1);
        boekingsSite.addBoeking("Hank", mercureKamer2, LocalDate.of(2023, 11, 27), 1);
        boekingsSite.addBoeking("Ivy", mercureKamer2, LocalDate.of(2023, 11, 28), 1);
        boekingsSite.addBoeking("Jack", mercureKamer2, LocalDate.of(2023, 11, 29), 1);

        boekingsSite.addBoeking("Karen", parkHotelKamer1, LocalDate.of(2023, 11, 30), 2);
        boekingsSite.addBoeking("Liam", parkHotelKamer1, LocalDate.of(2023, 12, 1), 1);
        boekingsSite.addBoeking("Mia", parkHotelKamer1, LocalDate.of(2023, 12, 2), 1);
        System.out.println("---------Totaal---------");
        System.out.println(boekingsSite.getTotalePrijsBoekings());
        System.out.println("---------ibis---------");
        System.out.println(boekingsSite.getTotalePrijsBoekingsVanHotel("Ibis"));
        System.out.println("---------Mercure---------");
        System.out.println(boekingsSite.getTotalePrijsBoekingsVanHotel("Mercure"));
        System.out.println("---------ParkHotel---------");
        System.out.println(boekingsSite.getTotalePrijsBoekingsVanHotel("ParkHotel"));
        System.out.println("---------Opgeteld---------");
        System.out.println((boekingsSite.getTotalePrijsBoekingsVanHotel("Ibis")+boekingsSite.getTotalePrijsBoekingsVanHotel("Mercure")+boekingsSite.getTotalePrijsBoekingsVanHotel("ParkHotel")));
        System.out.println("---------Alle Kamers---------");
        boekingsSite.printAlleBoekings();
        boekingsSite.removeBoekingsVan("Ibis");
        System.out.println("---------Zonder Ibis---------");
        boekingsSite.printAlleBoekings();


    }
}