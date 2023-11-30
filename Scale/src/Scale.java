public class Scale {


    private int leftScale;
    private int rightScale;

    public Scale(){
        leftScale = 0;
        rightScale = 0;
    }

    public int getLeftScale() {
        return leftScale;
    }

    public int getRightScale() {
        return rightScale;
    }
    public void addWeightLeft(int weight){
        if((leftScale + weight) <= 10){
            leftScale += weight;
        }else{
            System.out.println("Added to much weight");
        }
    }
    public void setWeightLeft(int weight){
        if(weight <= 10 && weight >= 0 ){
            leftScale = weight;
        }else{
            System.out.println("Added the Incorrect weight");
        }
    }
    public void takeWeightLeft(int weight){
        if((leftScale - weight) >= 0){
            leftScale -= weight;
        }else{
            System.out.println("weight can't be below 0 ");
        }
    }
    public void addWeightRight(int weight){
        if((rightScale + weight) <= 10){
            rightScale += weight;
        }else{
            System.out.println("Added to much weight");
        }
    }
    public void setWeightRight(int weight){
        if(weight <= 10 && weight >= 0 ){
            rightScale = weight;
        }else{
            System.out.println("Added the Incorrect weight");
        }
    }
    public void takeWeightRight(int weight){
        if((rightScale - weight) >= 0){
            rightScale -= weight;
        }else{
            System.out.println("weight can't be below 0 ");
        }
    }
    public void addWeight(int weight ,boolean setRight){
        if(setRight){
            addWeightRight(weight);
        }else{
            addWeightLeft(weight);
        }
    }
    public void setWeight(int weight,boolean setRight){
       if(setRight){
           setWeightRight(weight);
       }else{
           setWeightLeft(weight);
       }
    }
    public void takeWeight(int weight,boolean setRight){
        if(setRight){
            takeWeightRight(weight);
        }else{
            takeWeightLeft(weight);
        }
    }
    public String getResult()
    {
        return (leftScale > rightScale)? "left" : (leftScale == rightScale) ? "equal" : "right";
    }

}
