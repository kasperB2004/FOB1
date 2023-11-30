public class Main {
    public static void main(String[] args) {
        Insurance auto1 = new Insurance(10,"vroum vroum",true );
        auto1.getOverzicht();
        auto1.vervalDag(1);
        auto1.getOverzicht();
        auto1.vervalDag(0);
        auto1.vervalDag(0);
        auto1.getOverzicht();
        auto1.vervalDag(3);
        auto1.getOverzicht();
    }
}