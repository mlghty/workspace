package com.entertainment;

public class Television {

    private static int instanceCount = 0;

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    public static int muteVol = -1;
    public static boolean muted = false;


    private String brand = "LG"; // brand name
    private int volume = 1; // current volume


    // if not iniatilized displays null
//    DisplayType display;

    //if not null
    DisplayType display = DisplayType.LED;

    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }


    public Television(String brand, int volume, DisplayType display) {
        this(brand,volume);
        setDisplay(display);
    }

    public static int getInstanceCount() {
        return instanceCount;
    }


    public void mute() {


        if (!muted) {


            this.muteVol = this.volume;
            this.volume = 0;
            System.out.println("Muted Volume! Volume: " + volume);
            this.muted = true;

        } else if (muted) {
            this.volume = muteVol;
            this.muteVol = -1;
            System.out.println("Unmuted Volume! Volume: " + volume);
            this.muted = false;


        }


    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {


        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        } else {
            this.volume = 0;
            System.out.println("ERROR INVALID VOLUME PROVIDED ENTER FROM RANGE 0-100!");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        switch (brand) {
            case "LG":
//                this.brand = brand;
//                break;
            case "Sony":
//                this.brand = brand;
//                break;
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid TV brand!");
                break;
        }


    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {

        for (DisplayType displays : DisplayType.values()) {
            if (displays == display) {
                this.display = display;
                return;

            }

        }

        System.out.println("Error display type not supported, select from: " + DisplayType.values());
    }

    public void turnOn() {
        System.out.println("Turning on " + brand);

    }

    public static Boolean isMuted() {
        return muted;
    }

    public void turnOff() {
        System.out.println("Turning off " + brand);
    }

    public String toString() {
        return "TV BRAND: " + brand + "\nCURRENT VOLUME: " + volume + "\nLCD TYPE: " + display;
//        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
//        return volumeString;
    }
}

