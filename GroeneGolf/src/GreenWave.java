public class GreenWave {
    private Crossing crossing1;
    private Crossing crossing2;


    public GreenWave(String mainStreet, String sideStreet1 , String sideStreet2) {
        this.crossing1 = new Crossing(sideStreet1,mainStreet);
        this.crossing2 = new Crossing(sideStreet2,mainStreet);
    }

    public void startGreenWave(){
        crossing1.setMainStreetGreen();
        crossing2.setMainStreetGreen();
    }
    public void endGreenWave(){
        crossing1.setMainStreetRed();
        crossing2.setMainStreetRed();
    }
    public void setError(){
        crossing1.setError();
        crossing2.setError();
    }

    public void printGreenWaveStatus(){
        System.out.println("The "+ crossing1.getMainStreetName()+ " Lights are "+ crossing1.getStatusMain() + " and " + crossing2.getStatusMain()+". The " + crossing1.getSideStreetName()+  " status is "+ crossing1.getStatusSide() + " and " +crossing2.getSideStreetName()+  " status is "+ crossing2.getStatusSide() );
    }
}
