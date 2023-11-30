public class Main {
    public static void main(String[] args){
        Standopname client1 = new Standopname(100,1000);
        System.out.println("Client 1 moet "+ client1.getValueOwned());
        Standopname client2 = new Standopname(999997,10);
        System.out.println("Client 2 moet "+ client2.getValueOwned());
        Standopname client3 = new Standopname(100,4500);
        System.out.println("Client 3 moet "+ client3.getValueOwned());
    }
}
