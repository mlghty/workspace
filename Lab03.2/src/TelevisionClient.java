public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();

        tv1.setBrand("TCL");
        String brand = tv1.getBrand();

        tv1.setVolume(15);
        int Volume = tv1.getVolume();


        System.out.println(brand);
        System.out.println(Volume);
        System.out.println(tv1);

        tv1.turnOn();

    }


}

