public class Crossing {

    private Light mainStreet;
    private Light sideStreet;

    public Crossing(String sideStreet, String mainStreet) {
        this.mainStreet = new Light(mainStreet);
        this.sideStreet = new Light(sideStreet);
    }

    public String getSideStreetName() {
        return sideStreet.getStreetName();
    }

    public String getMainStreetName() {
        return mainStreet.getStreetName();
    }


    public void setMainStreetGreen(){
        mainStreet.setStatusGreen();
        sideStreet.setStatusRed();
    }
    public void setMainStreetRed(){
        mainStreet.setStatusRed();
        sideStreet.setStatusGreen();
    }
    public void setError(){
        mainStreet.setStatusError();
        sideStreet.setStatusError();

    }
    public String getStatusMain(){
        return mainStreet.getStatus();
    }
    public String getStatusSide(){
        return sideStreet.getStatus();
    }

}
