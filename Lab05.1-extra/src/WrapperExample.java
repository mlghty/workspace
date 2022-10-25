public class WrapperExample {
    public static int convertStringToIntPrimitive(String toBeConvertedString) {

        return Integer.parseInt(toBeConvertedString);

    }

    public static int convertStringToIntegerObject(String toBeConvertedString) {

//        return new Integer(toBeConvertedString);
        return Integer.valueOf(toBeConvertedString);

    }
}


class Main1 {
    public static void main(String[] args) {


//        Integer x = WrapperExample.convertStringToIntPrimitive("12");
        int x = WrapperExample.convertStringToIntPrimitive("12");


        System.out.println(x + "\n");
//        System.out.println(x. + "\n");



        Integer y = WrapperExample.convertStringToIntegerObject("13");
        System.out.println(y);
        System.out.println(y.getClass().getName());


    }
}