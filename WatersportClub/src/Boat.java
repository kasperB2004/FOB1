public class Boat {
    private String name;
    private double basicPrice;
    private boolean hasRader;
    private boolean hasGps;

    public Boat(String name, double basicPrice, boolean hasRader, boolean hasGps) {
        this.name = name;
        this.basicPrice = basicPrice;
        this.hasRader = hasRader;
        this.hasGps = hasGps;
    }

    public void setHasRader(boolean hasRader) {
        this.hasRader = hasRader;
    }

    public void setHasGps(boolean hasGps) {
        this.hasGps = hasGps;
    }

    public String getName() {
        return name;
    }

    public boolean hasRader() {
        return hasRader;
    }

    public boolean hasGps() {
        return hasGps;
    }

    public double getPrice(){
        double priceIncrease = 1;
        priceIncrease += (hasRader) ? 0.05 : 0;
        priceIncrease += (hasGps) ? 0.03 :0;

        return basicPrice * priceIncrease;
    }

    public String toString(){
        return "Name : " + name + "\n Features : " + (hasGps ?"a gps": "no gps") + ", " +(hasRader ?"a radar": "no rader") + "\n Cost: " + (getPrice() * 60) + " euro per hour";
    }
}
