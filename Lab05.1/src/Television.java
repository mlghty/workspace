class Television {


    private String brand = "LG"; // brand name
    private int volume = 1; // current volume


    // if not iniatilized displays null
//    DisplayType display;

    //if not null
    DisplayType display = DisplayType.LED;

    public Television() {
    }

    public Television(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand,volume);
        this.display = display;
    }

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

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public void turnOn() {
        System.out.println("Turning on " + brand);

    }

    public void turnOff() {
        System.out.println("Turning off " + brand);
    }

    public String toString(){
        return "BRAND: " + brand + " VOLUME: " + volume + " DISPLAY: " + display;
    }
}

