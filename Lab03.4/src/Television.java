class Television {

    private static int instanceCount = 0;

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private String brand = "LG"; // brand name
    private int volume = 1; // current volume

    public Television() {
        instanceCount++;
    }

    public Television(String brand)
    {
        this();
        this.brand = brand;
    }

    public Television(String brand, int volume) {
        this(brand);
//        this.brand = brand;
        this.volume = volume;
    }

    public static int getInstanceCount() {
        return instanceCount;
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
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private boolean verifyInternetConnection() {
        return true; // fake implementation
    }

    public String toString() {
        return "TV BRAND: " + brand +  " CURRENT VOLUME: " + volume;
    }

}

