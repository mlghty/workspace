package tvpackage;

public class TelevisionValidationTest {
    public static void main(String[] args) {

        Television tv1 = new Television("LG", 100);
        System.out.println(tv1);
        System.out.println("Television instance: " + tv1.getInstanceCount());
        tv1.turnOn();


        Television tv2 = new Television("SONY", 0);
        System.out.println(tv2);
        System.out.println("Television instance: " + tv2.getInstanceCount());
        tv2.turnOn();

        tv1.setVolume(1);
        System.out.println(tv1);


        tv1.setVolume(-1);
        System.out.println(tv1);


        tv1.setBrand("INVALID"); // should stick
        System.out.println(tv1); // brand should be Samsung
        tv1.setBrand("LG"); // should stick
        System.out.println(tv1); // brand should be LG
        tv1.setBrand("SONY"); // should stick
        System.out.println(tv1); // brand should be Sony
        tv1.setBrand("TOSHIBA"); // should stick
        System.out.println(tv1); // brand should be Toshiba
        tv1.setBrand("INVALID"); // error message, brand not set
        System.out.println(tv1); // should still be Toshiba, from before


        System.out.println();
        System.out.println();


        tv1.setVolume(5);
        tv1.mute();
        System.out.println(tv1);
        tv1.mute();
        System.out.println(tv1);
        System.out.println(tv1);


    }
}

