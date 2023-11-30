import java.util.Arrays;

public class StatistiekenTabel
{
    private int[] getallen;

    public StatistiekenTabel(int aantalElementen, int defaultWaarde) {
        getallen = new int[aantalElementen];

        // Arrays.fill(getallen,defaultWaarde);

        for(int i = 0;i < getallen.length;i++){
            getallen[i] = defaultWaarde;
        }
    }

    public StatistiekenTabel(int[] waardes){
        getallen = waardes;
    }

    public String getDetails(){
       /* StringBuilder detail = new StringBuilder();
        detail.append(getallen[0]);
        for(int i =1;i<getallen.length;i++){
            detail.append(", ").append(getallen[i]);
        }
        return detail.toString(); */

        return Arrays.toString(getallen);
    }

    public void setTableopIndex(){
        for(int i =0; i < getallen.length;i++){
            getallen[i]=i;
        }
    }

    public int getSom(){
        int som = 0;
        for(int i =0; i < getallen.length;i++){
           som += getallen[i];
        }
        return som;
    }

    public double getGemmidelde(){
        return (double) getSom() /getallen.length;
    }

    public double getMediam(){
        double median = 0;
        int[] copy = Arrays.copyOf(getallen,getallen.length);
        Arrays.sort(copy);

        if (copy.length % 2 == 0){
            median = ((double)copy[copy.length/2] + (double)copy[copy.length/2 - 1])/2;
        }
        else{
            median = copy[copy.length/2];
        }
        return median;
    }
    public int zoek(int zoekWaarde){
        int index = 0;
        int foundindex = -1;
        while(foundindex == -1 && index < getallen.length ){
            if(getallen[index] == zoekWaarde){
                foundindex = index;
            }
            index++;
        }
        return foundindex;
    }
}
