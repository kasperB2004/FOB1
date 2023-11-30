import java.util.Random;
import java.util.Scanner;

public class HigherLower {
    private Random rnd;
    private Scanner scanner;

    private int lowestNumber;
    private int highestNumber;

    public HigherLower(int highestNumber , int lowestNumber){
        scanner = new Scanner(System.in);
        rnd = new Random();
        this.highestNumber = highestNumber;
        this.lowestNumber = lowestNumber;

    }

    public int startGame(){
        int rndnummer = rnd.nextInt(lowestNumber,highestNumber+1);
        int guessedNummer = rndnummer-1;
        int count = 1;

        while(guessedNummer != rndnummer){
            System.out.println("Guess a random nummer between "+ lowestNumber + " and " + highestNumber);
            guessedNummer = scanner.nextInt();
            if(guessedNummer != rndnummer){
                System.out.println((guessedNummer > rndnummer) ? "Lower": "Higher");
                count++;
            }
        }
        System.out.println("Congratulations , you took " + count + ((count == 1) ? "gues" : "guesses") );
        return count;
    }

}
