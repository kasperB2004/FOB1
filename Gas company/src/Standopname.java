public class Standopname {

    private int startStand;
    private int endStand;
    public Standopname(int startStand, int endStand) {
        if(startStand > 999999 || endStand > 999999){
            throw new IllegalArgumentException("values cant be larger then 999999");
        }else{
            this.startStand = startStand;
            this.endStand = endStand;
        }
    }


    public double getValueOwned(){
        int result;
        if(startStand + endStand > 999999)
        {
            result = 1000000 - startStand + endStand;
        }
        else
        {
            result = endStand - startStand;
        }
        return (result > 1000) ? 340 + ((result - 1000) * 0.31) : result * 0.34;
    }
}
