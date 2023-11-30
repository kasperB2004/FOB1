

public class Main {
    public static void main(String[] args) {
        int brightness = 100;
        StringBuilder result = new StringBuilder("o");
        for(int i = 10; i <= brightness; i += 10){
            result.append("*");

        }
        System.out.println(result);


    }


}