import java.util.Arrays;

public class ScoreBoard {
    private String[] scoreboard;

    public ScoreBoard(){
        scoreboard = new String[10];
        Arrays.fill(scoreboard, "-\t\t-");
    }

    public void voegScoreToe(int score ,String naam){

        for(int i =0; i < scoreboard.length; i++){
            String currentline = scoreboard[i];
            if(!(currentline.equals("-\t\t-"))){
                int huidigescore = Integer.parseInt( currentline.split("\t\t")[0]);
                if(huidigescore < score){

                    for (int j = scoreboard.length - 1; j > i; j--) {
                        scoreboard[j] = scoreboard[j - 1];
                    }

                    scoreboard[i] = score + "\t\t" + naam;
                    break;
                }


            }else{
                scoreboard[i] = score +"\t\t"+naam;
                break;
            }
        }
    }

    public void verwijderScore(int position){

        position--; // cuz "normal" human no thinky in array index and start at 1 not 0

        for (int i = position; i < scoreboard.length - 1; i++) {
            scoreboard[i] = scoreboard[i + 1];
        }
        scoreboard[scoreboard.length - 1] = "-\t\t-";
    }
    public boolean isTopSpeler(String name){
        boolean found = false;
        int i = 0;
        while (i < scoreboard.length && !found){
            if(scoreboard[i].split("\t\t")[1].equals(name)){
                found = true;
            }
            i++;
        }
        return found;
    }

    public void printHallOfFame(){
        StringBuilder sb = new StringBuilder();
        sb.append("#\tScore\tName");
        sb.append("\n");
        for(int i = 0; i < scoreboard.length;i++){
            sb.append(i+1+"\t"+scoreboard[i]);
            sb.append("\n");

        }
        sb.append("-----------------------");
        System.out.println(sb.toString());
    }


}
