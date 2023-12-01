public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.printHallOfFame();
        scoreBoard.voegScoreToe(100, "Bob");
        scoreBoard.voegScoreToe(150, "Alice");
        scoreBoard.voegScoreToe(80, "Charlie");
        scoreBoard.voegScoreToe(200, "David");
        scoreBoard.voegScoreToe(120, "Eva");
        scoreBoard.printHallOfFame();
        scoreBoard.voegScoreToe(90, "Frank");
        scoreBoard.voegScoreToe(300, "Grace");
        scoreBoard.voegScoreToe(180, "Hank");
        scoreBoard.voegScoreToe(250, "Ivy");
        scoreBoard.voegScoreToe(130, "Jack");
        scoreBoard.voegScoreToe(160, "Kathy");
        scoreBoard.printHallOfFame();
        scoreBoard.voegScoreToe(110, "Liam");
        scoreBoard.voegScoreToe(220, "Mia");
        scoreBoard.voegScoreToe(170, "Nina");
        scoreBoard.voegScoreToe(240, "Oliver");
        scoreBoard.voegScoreToe(140, "Pam");
        scoreBoard.voegScoreToe(260, "Quinn");
        scoreBoard.voegScoreToe(190, "Riley");
        scoreBoard.voegScoreToe(280, "Sam");
        scoreBoard.voegScoreToe(210, "Tina");
        scoreBoard.printHallOfFame();
        scoreBoard.verwijderScore(1);
        scoreBoard.printHallOfFame();
        scoreBoard.verwijderScore(5);
        scoreBoard.printHallOfFame();
        scoreBoard.voegScoreToe(300, "Grace");
        scoreBoard.printHallOfFame();

    }
}