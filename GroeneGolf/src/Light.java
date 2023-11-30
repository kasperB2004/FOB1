public class Light {
    private  String status;

    private String streetName;

    public Light(String streetName){
        this.streetName = streetName;
        setStatusError();
    }

    public String getStatus(){
        return status;
    }
    public void setStatusGreen(){
        status = "Green";
    }
    public void setStatusRed(){
        status = "Red";
    }
    public void setStatusError(){
        status = "Error";
    }

    public String getStreetName() {
        return streetName;
    }
}
