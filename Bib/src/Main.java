public class Main {
    public static void main(String[] args) {

        // Create 10 Boek objects
        Boek boek1 = new Boek("To Kill a Mockingbird", "Harper Lee", "isbn1023", 1);
        Boek boek2 = new Boek("The Great Gatsby", "F. Scott Fitzgerald", "isbn2000", 2);
        Boek boek3 = new Boek("1984", "George Orwell", "isbn3000", 3);
        Boek boek4 = new Boek("Brave New World", "Aldous Huxley", "isbn4000", 4);
        Boek boek5 = new Boek("The Catcher in the Rye", "J.D. Salinger", "isbn5000", 5);
        Boek boek6 = new Boek("To Kill a Mockingbird", "Harper Lee", "isbn1023", 6);
        Boek boek7 = new Boek("The Lord of the Rings", "J.R.R. Tolkien", "isbn7000", 7);
        Boek boek8 = new Boek("The Hobbit", "J.R.R. Tolkien", "isbn8000", 8);
        Boek boek9 = new Boek("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "isbn9000", 9);
        Boek boek10 = new Boek("The Chronicles of Narnia", "C.S. Lewis", "isbn10000", 10);

        // Create 8 Lid objects
        Lid lid1 = new Lid("Kasper", "City1", "Street1");
        Lid lid2 = new Lid("Alice", "City2", "Street2");
        Lid lid3 = new Lid("Bob", "City3", "Street3");
        Lid lid4 = new Lid("Charlie", "City4", "Street4");
        Lid lid5 = new Lid("David", "City5", "Street5");
        Lid lid6 = new Lid("Eva", "City6", "Street6");
        Lid lid7 = new Lid("Frank", "City7", "Street7");
        Lid lid8 = new Lid("Grace", "City8", "Street8");

        Balie balie = new Balie();

        balie.toevoegenboek(boek1);
        balie.toevoegenboek(boek2);
        balie.toevoegenboek(boek3);
        balie.toevoegenboek(boek4);
        balie.toevoegenboek(boek5);
        balie.toevoegenboek(boek6);
        balie.toevoegenboek(boek7);
        balie.toevoegenboek(boek8);
        balie.toevoegenboek(boek9);
        balie.toevoegenboek(boek10);

        balie.toevoegenlid(lid1);
        balie.toevoegenlid(lid2);
        balie.toevoegenlid(lid3);
        balie.toevoegenlid(lid4);
        balie.toevoegenlid(lid5);
        balie.toevoegenlid(lid6);
        balie.toevoegenlid(lid7);
        balie.toevoegenlid(lid8);

        balie.ontleen(lid3,boek3);
        balie.ontleen(lid4,boek1);
        balie.ontleen(lid3,boek7);
        balie.ontleen(lid7,boek6);
        balie.ontleen(lid8,boek4);
        balie.ontleen(lid1,boek5);

        balie.printOverzichtGeleendeBoeken();
        balie.printOverzichtAanwezigeBoeken();

        balie.brengterug(6);
        balie.brengterug(4);
        balie.brengterug(5);

        balie.printOverzichtGeleendeBoeken();
        balie.printOverzichtAanwezigeBoeken();

        balie.printOntleendeBoekenVanPersoon("Bob");

    }
}