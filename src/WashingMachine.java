public class WashingMachine {
    private int temperature;
    private int spinning;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getSpinning() {
        return spinning;
    }

    public void setSpinning(int spinning) {
        this.spinning = spinning;
    }

    void modeForSensitiveClothes(){
        temperature = 30;
        spinning = 800;
    }

    void modeForTowelsAndBedLinen(){
        temperature = 90;
        spinning = 1200;
    }

    void showSettings(){
        System.out.println("temp: " + temperature + " obroty: " + spinning);
    }

}
