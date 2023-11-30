public class Main {
    public static void main(String[] args) {
        System.out.println("Constructor");
        Rechthoek rechthoek1 = new Rechthoek(new Punt(1, 8), new Punt(10, 3));
        System.out.println(rechthoek1.toString());

        Rechthoek rechthoek2 = new Rechthoek(new Punt(10, 3), new Punt(1, 8));
        System.out.println(rechthoek2.toString());

        Rechthoek rechthoek3 = new Rechthoek(new Punt(1, 3), new Punt(10, 8));
        System.out.println(rechthoek3.toString());

        Rechthoek rechthoek4 = new Rechthoek(new Punt(10, 8), new Punt(1, 3));
        System.out.println(rechthoek4.toString());

        Rechthoek eenhorizontalelijn = new Rechthoek(new Punt(1, 8), new Punt(10, 8));
        System.out.println(eenhorizontalelijn.toString());

        Rechthoek eenverticalelijn = new Rechthoek(new Punt(3, 1), new Punt(3, 10));
        System.out.println(eenverticalelijn.toString());

        System.out.println("---------------------------------------");

        System.out.println("Omhullend");
        Rechthoek rechthoek5 = new Rechthoek(new Punt(12, 4), new Punt(18, 1));
        Rechthoek rechthoekOmhullend1 = rechthoek1.omhullendeRechthoek(rechthoek5);
        System.out.println(rechthoekOmhullend1.toString());

        Rechthoek rechthoekOmhullend2 = rechthoek5.omhullendeRechthoek(rechthoek1);
        System.out.println(rechthoekOmhullend2.toString());

        Rechthoek rechthoek6 = new Rechthoek(new Punt(0, 5), new Punt(5, 1));
        Rechthoek rechthoekOmhullend3 = rechthoek1.omhullendeRechthoek(rechthoek6);
        System.out.println(rechthoekOmhullend3.toString());

        Rechthoek rechthoekOmhullend4 = rechthoek1.omhullendeRechthoek(new Rechthoek(new Punt(12, 13), new Punt(15, 11)));
        System.out.println(rechthoekOmhullend4.toString());

        Rechthoek rechthoek7 = new Rechthoek(new Punt(4, 7), new Punt(6, 4));
        Rechthoek rechthoekOmhullend5 = rechthoek1.omhullendeRechthoek(rechthoek7);
        System.out.println(rechthoekOmhullend5.toString());

        Rechthoek rechthoekOmhullend6 = rechthoek1.omhullendeRechthoek(new Rechthoek(new Punt(3, 15), new Punt(5, 11)));
        System.out.println(rechthoekOmhullend6.toString());

        System.out.println("---------------------------------------");

        System.out.println("Contains point");
        // in de rechthoek
        System.out.println(rechthoek1.contains(new Punt(7,6)) + " is true");
        // op de hoek
        System.out.println(rechthoek1.contains(new Punt(1,8)) + " is true");
        // op de lijn
        System.out.println(rechthoek1.contains(new Punt(4,8)) + " is true");
        // buiten de rechthoek
        System.out.println(rechthoek1.contains(new Punt(12,13)) + " is false");
        System.out.println(rechthoek1.contains(new Punt(0,3)) + " is false");
        System.out.println(rechthoek1.contains(new Punt(12,4)) + " is false");
        System.out.println(rechthoek1.contains(new Punt(18,1)) + " is false");
        System.out.println(rechthoek1.contains(new Punt(0,17)) + " is false");

        System.out.println("---------------------------------------");

        System.out.println("Manhattan size");
        System.out.println(rechthoek1.getManhattanDistance() + " is 14.0");
        System.out.println(rechthoekOmhullend2.getManhattanDistance() + " is 24.0");
        System.out.println(rechthoekOmhullend3.getManhattanDistance() + " is 17.0");
        System.out.println(rechthoekOmhullend4.getManhattanDistance() + " is 24.0");
        System.out.println(rechthoekOmhullend5.getManhattanDistance() + " is 14.0");
        System.out.println(rechthoekOmhullend6.getManhattanDistance() + " is 21.0");

        System.out.println("---------------------------------------");

        System.out.println("Omtrek");
        System.out.println(rechthoek1.getOmtrek() + " is 28.0");
        System.out.println(rechthoekOmhullend2.getOmtrek() + " is 48.0");
        System.out.println(rechthoekOmhullend3.getOmtrek() + " is 34.0");
        System.out.println(rechthoekOmhullend4.getOmtrek() + " is 48.0");
        System.out.println(rechthoekOmhullend5.getOmtrek() + " is 28.0");
        System.out.println(rechthoekOmhullend6.getOmtrek() + " is 42.0");

        System.out.println("---------------------------------------");

        System.out.println("Diagonaal");
        System.out.println(rechthoek1.getLengthDiagonal() + " is 10.29");
        System.out.println(rechthoekOmhullend2.getLengthDiagonal() + " is 18.38");

        System.out.println("---------------------------------------");

        System.out.println("Contains rechthoek");
        System.out.println(rechthoek1.contains(rechthoek7)+ " is true");
        System.out.println(rechthoek7.contains(rechthoek1)+ " is false");

        // rechthoekOmhullend2 komt uit rechthoek1 met rechthoek5
        System.out.println(rechthoekOmhullend2.contains(rechthoek1)+ " is true");
        System.out.println(rechthoekOmhullend2.contains(rechthoek5)+ " is true");

        System.out.println(rechthoek1.contains(rechthoek6)+ " is false");

        System.out.println("---------------------------------------");

    }
}