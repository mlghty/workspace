package Television;

class Television {


    private String brand = "LG"; // brand name
    private int volume = 1; // current volume

    public Television() {
    }

    public Television(String brand) {
        this.brand = brand;
    }

    public Television(String brand, int volume) {
        this(brand);
//        this.brand = brand;
        this.volume = volume;
    }

    public void turnOn() {


        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on " + brand);

        if (isConnected){
            System.out.println("Connected to the internet...");
        }else {
            System.out.println("Not connected to the internet...");
        }
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


    private  boolean verifyInternetConnection(){
        return true; // fake implementation
    }
    public String toString(){
        return brand + volume;
    }

}

