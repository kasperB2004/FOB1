public class Reeks {
    private int kleinste;
    private  int midden;
    private int grootste ;

    public Reeks(int getal1 , int getal2 , int getal3){
        kleinste = getal1;
        midden = getal2;
        grootste  = getal3;
        int temp;

        if (kleinste > midden){
             temp = kleinste;
            kleinste = midden;
            midden = temp;
        }
        if (midden > grootste ){
             temp = midden;
            midden = grootste ;
            grootste  = temp;
        }
        if (kleinste > midden){
             temp = kleinste;
            kleinste = midden;
            midden = temp;
        }
    }
    public void printResult(){
        System.out.println("Kleinste is " +kleinste+ ", middelste is " + midden + ", grooste is " + grootste );
    }
}
