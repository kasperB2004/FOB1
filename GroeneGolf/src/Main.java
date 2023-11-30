public class Main {
    public static void main(String[] args) {
        GreenWave greenWave = new GreenWave("main","sidestreet1","sidestreet2");
        greenWave.printGreenWaveStatus();
        greenWave.startGreenWave();
        greenWave.printGreenWaveStatus();
        greenWave.endGreenWave();
        greenWave.printGreenWaveStatus();
    }
}