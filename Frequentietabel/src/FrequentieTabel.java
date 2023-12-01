import java.util.Arrays;
import java.util.Random;

public class FrequentieTabel {
    private  int bovengrens;
    private  int ondergrens;
    private  final int[] tabel;

    public FrequentieTabel(int bovengrens,int ondergrens, int length){

        if(ondergrens < bovengrens){

            this.bovengrens = bovengrens;
            this.ondergrens = ondergrens;
        }else{
            System.out.println("Boven grens moet groter zijn dan ondergrens deze worden omgewisseld");
            int temp = ondergrens;
            ondergrens = bovengrens;
            bovengrens = temp;
        }
        tabel = new int[length];

        Random rnd = new Random();

        for(int i = 0;i < tabel.length;i++){
            tabel[i] = rnd.nextInt(ondergrens,bovengrens+1);
        }

    }

    public String getDetails(){
        return  "tabel = " +  Arrays.toString(tabel) + ", ondergrens = " + ondergrens + ", bovengrens = " + bovengrens;
    }
    public int[] getFrequentieTabel(){
        int[] freguentieTabel = new int[bovengrens - ondergrens+1];

        for(int i = 0; i < tabel.length ; i++){
            int index = tabel[i] - ondergrens;
            freguentieTabel[index]++;
        }
        return freguentieTabel;
    }

    private int getSom(int[] array){
        int som = 0;
        for(int i =0; i < array.length;i++){
            som += array[i];
        }
        return som;
    }

    public double getGemmideldeGewoon(){
        return (double) getSom(tabel) /tabel.length;
    }

    public double getGemidelde(){
        int[] frequentieTabel = getFrequentieTabel();
        int som = getSom(frequentieTabel);
        int maalfactor = ondergrens;

        for(int i = 0; i < frequentieTabel.length;i++){
            frequentieTabel[i] *= maalfactor;
            maalfactor++;
        }

        int tweedesom = getSom(frequentieTabel);

        return (double)tweedesom/som;
    }
    public void printFrequentieTabel(){
        System.out.println( Arrays.toString(getFrequentieTabel()));
    }
}
