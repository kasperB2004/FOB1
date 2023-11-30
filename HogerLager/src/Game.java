import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Random;

public class Game {
    private Scanner scanner;
    private HigherLower higherLower;

    public Game(){
        scanner = new Scanner(System.in);

        int highestNumber =0;
        int lowestNumber =0;
        double avg = 0;
        Collection<Integer> scores = new ArrayList<>();
        System.out.println("What should the highest number be ?");
        highestNumber = scanner.nextInt();
        System.out.println("What should the lowest number be ?");
        lowestNumber = scanner.nextInt();

        if(lowestNumber > highestNumber){
            System.out.println("The lowest number should be smaller then the biggest number. These will be swapped");
            int temp = lowestNumber;
            lowestNumber = highestNumber;
            highestNumber = lowestNumber;
        }

        higherLower = new HigherLower(highestNumber,lowestNumber);

        System.out.println("How many times would you like to play");
        int playCount = scanner.nextInt();
        for(int i = 0; i < playCount; i++){
            System.out.println("-----------------\n     Game " + i + "   \n-----------------");
            avg += higherLower.startGame();
        }

        avg = avg / playCount ;

        System.out.println("Average score is " + (Math.round(avg * 100.00) / 100.00));
    }

}
