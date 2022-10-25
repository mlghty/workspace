package sta;

public class Computer {

    private static int screenSize = 17;
    private int cpuCount;
    private String Brand;


    public Computer(int cpuCount, String brand) {
        this.cpuCount = cpuCount;
        Brand = brand;
    }

    public int getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }
}


class Main{
    public static void main(String[] args) {
        Computer apple = new Computer(5,"TEST");



        String[] letters = {"A","B","C"};


        for (String letter : letters){
            System.out.println(letter);
        }





    }
}