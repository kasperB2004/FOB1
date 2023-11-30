public class Main {

    public static void main(String[] args) {

        StatistiekenTabel tabel1 = new StatistiekenTabel(10,4);
        System.out.println(tabel1.getDetails());

        int[] kwartalen = new int[]{2, 90 ,57,89,512};
        StatistiekenTabel tabel2 = new StatistiekenTabel(kwartalen);
        System.out.println(tabel2.getDetails());
        System.out.println(tabel1.getGemmidelde());
        System.out.println(tabel2.getMediam());
        System.out.println(tabel1.getSom());
        System.out.println(tabel2.zoek(57));
        System.out.println(tabel2.zoek(512));
        System.out.println(tabel2.zoek(90));
        System.out.println(tabel2.zoek(91));
    }
}