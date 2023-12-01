import java.util.Arrays;

public class ScoreBoard {
    private Score[] scoreboard;

    public ScoreBoard() {
        scoreboard = new Score[10];
    }

    public void voegScoreToe(int score, String naam) {

        if (scoreboard[scoreboard.length - 1] == null) {
            updateScoreboard(score, naam);
        } else if (scoreboard[scoreboard.length - 1].getScore() < score) {
            updateScoreboard(score, naam);
        }


    }

    private void updateScoreboard(int score, String naam) {
        int i = 0;
        boolean changed = false;
        while (i < scoreboard.length && !changed) {
            Score currentline = scoreboard[i];
            if (currentline != null) {
                int huidigescore = currentline.getScore();
                if (huidigescore < score) {

                    for (int j = scoreboard.length - 1; j > i; j--) {
                        scoreboard[j] = scoreboard[j - 1];
                    }
                    scoreboard[i] = new Score(score, naam);
                    changed = true;
                }
            } else {
                scoreboard[i] = new Score(score, naam);
                changed = true;
            }
            i++;
        }
    }

    public void verwijderScore(int position) {

        position--; // cuz "normal" human no thinky in array index and start at 1 not 0
        for (int i = position; i < scoreboard.length - 1; i++) {
            scoreboard[i] = scoreboard[i + 1];
        }
        scoreboard[scoreboard.length - 1] = null;

    }

    public boolean isTopSpeler(String name) {
        boolean found = false;
        int i = 0;
        while (i < scoreboard.length && !found) {
            if (scoreboard[i].getName().equals(name)) {
                found = true;
            }
            i++;
        }
        return found;
    }

    public void printHallOfFame() {
        StringBuilder sb = new StringBuilder();
        sb.append("#\tScore\tName");
        sb.append("\n");
        for (int i = 0; i < scoreboard.length; i++) {
            if (scoreboard[i] != null) {
                sb.append(i + 1);
                sb.append("\t");
                sb.append(scoreboard[i].getScore());
                sb.append("\t\t");
                sb.append(scoreboard[i].getName());
            } else {
                sb.append("-\t\t-");
            }
            sb.append("\n");

        }
        sb.append("-----------------------");
        System.out.println(sb.toString());
    }


}
