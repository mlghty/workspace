package tvpackage;

import javax.naming.BinaryRefAddr;

class Television {

    private static int instanceCount = 0;

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    public static int muteVol = -1;
    public static boolean muted = false;


    private String brand = "LG"; // brand name
    private int volume = 0; // current volume

    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        this.brand = brand;
    }

    public Television(String brand, int volume) {
        setBrand(brand);
//        this.brand = brand;
        setVolume(volume);
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

        } else if (muted){
            this.volume = muteVol;
            this.muteVol = -1;
            System.out.println("Unmuted Volume! Volume: " + volume);
            this.muted = false;


        }


    }

    public void turnOn() {


        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on " + brand);

        if (isConnected) {
            System.out.println("Connected to the internet...");
        } else {
            System.out.println("Not connected to the internet...");
        }

        System.out.println();
    }

    public void turnOff() {
        System.out.println("Turning off " + brand);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {

        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            System.out.println("Changed volume to: " + volume);
        } else {
            System.out.println("Volume not in range! Setting volume to '0'");
            this.volume = 0;

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
            case "SONY":
//                this.brand = brand;
//                break;
            case "TOSHIBA":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid TV brand!");
                break;
        }


    }

    public static Boolean isMuted() {
        return muted;
    }

    private boolean verifyInternetConnection() {
        return true; // fake implementation
    }

    public String toString() {
//        return "TV BRAND: " + brand + " CURRENT VOLUME: " + volume;
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return volumeString;
    }

}

