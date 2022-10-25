public class TelevisionClient {
    public static void main(String[] args) {

        Television tv1 = new Television("LG", 100);
        System.out.println(tv1);
        System.out.println("Television instance: " + tv1.getInstanceCount());
        tv1.turnOn();


        Television tv2 = new Television("SONY", 0);
        System.out.println(tv2);
        System.out.println("Television instance: " + tv2.getInstanceCount());
        tv2.turnOn();
    }
}

