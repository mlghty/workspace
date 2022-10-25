class Television {


    private String brand = "LG"; // brand name
    private int volume = 1; // current volume

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println("Turning on " + brand);

    }

    public void turnOff() {

        System.out.println("Turning off " + brand);


    }
}

