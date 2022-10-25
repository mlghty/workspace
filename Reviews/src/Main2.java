public class Main2 {


    private static int myintField;
    private static String myStringField;

    public static void main(String[] args) {
        myMethod();
    }


    private static void myMethod(){
        int mylocalint = 3;

        String myLocalString = "Joe";

        System.out.println(mylocalint + " " + myLocalString);
        System.out.println(myintField + " " + myStringField);
    }

}
