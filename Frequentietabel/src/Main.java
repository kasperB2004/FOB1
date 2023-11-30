import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FrequentieTabel frequentieTabel = new FrequentieTabel(10,5,20);
        System.out.println(frequentieTabel.getDetails());
        frequentieTabel.printFrequentieTabel();
        System.out.println(frequentieTabel.getGemidelde());
        System.out.println(frequentieTabel.getGemmideldeGewoon());


    }
}