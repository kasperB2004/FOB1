public class Light {
    private int brightness;

    public Light(){
        this(0);
    }
    public Light(int brightness){
        this.brightness = brightness;
    }

    public void setBrightness(int brightness) {

        this.brightness = brightness;
    }
    public void setOn(){
        this.brightness = 100;
    }
    public void setOff(){
        this.brightness = 0;
    }
    public void dim(){
        if(this.brightness - 10 > 0 ){
            this.brightness = 0;
        }
        else{
            this.brightness -= 10;
        }
    }
    public void brighten(){
        if(this.brightness + 10 > 100 ){
            this.brightness = 100;
        }
        else{
            this.brightness += 10;
        }
    }
    public int getBrightness() {
        return brightness;
    }

    public String ToString(){
        StringBuilder result = new StringBuilder("o");
        for(int i = 10; i <= brightness; i += 10){
            result.append("*");

        }
        return result.toString();
    }
}
