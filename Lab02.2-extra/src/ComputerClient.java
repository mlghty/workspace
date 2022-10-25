import java.lang.reflect.Type;

public class ComputerClient {
    public static void main(String[] args) {
        ComputerUsingIntPrimitives c1 = new ComputerUsingIntPrimitives();


        int x = 10;

        int y = 5;

        System.out.println(x + " + " + y + " = " + c1.add(x, y)); // 15

        System.out.println(x + " - " + y + " = " + c1.subtract(x, y)); // 5

        System.out.println(x + " * " + y + " = " + c1.multiply(x, y)); // 50

        System.out.println(x + " / " + y + " = " + c1.divide(x, y)); //2





        System.out.println();
        System.out.println("LONG");
        System.out.println();



        ComputerUsingLongPrimitives c2 = new ComputerUsingLongPrimitives();


        long x1 = 1000000000L;

        long y1 = 50000000L;

        System.out.println(x + " + " + y + " = " + c2.add(x1, y1)); // 15

        System.out.println(x + " - " + y + " = " + c2.subtract(x1, y1)); // 5

        System.out.println(x + " * " + y + " = " + c2.multiply(x1, y1)); // 50

        System.out.println(x + " / " + y + " = " + c2.divide(x1, y1)); //2


    }
}

