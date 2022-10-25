public class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setVolume(0); // should stick
        System.out.println(tv); // volume should be 0
        tv.setVolume(100); // should stick
        System.out.println(tv); // volume should be 100
        tv.setVolume(-1); // error message, volume not set
        tv.setVolume(101); // error message, volume not set
        System.out.println(tv); // should still have volume 100, from before




        Television tv1 = new Television();
        tv1.setBrand("Samsung"); // should stick
        System.out.println(tv1); // brand should be Samsung
        tv1.setBrand("LG"); // should stick
        System.out.println(tv1); // brand should be LG
        tv1.setBrand("Sony"); // should stick
        System.out.println(tv1); // brand should be Sony
        tv1.setBrand("Toshiba"); // should stick
        System.out.println(tv1); // brand should be Toshiba
        tv1.setBrand("INVALID"); // error message, brand not set
        System.out.println(tv1); // should still be Toshiba, from before

    }
}
