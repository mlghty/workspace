package AlarmClock;

public class MyOwnPrintln {
   public void myOwnPrintLn(String x){
       System.out.println(x);
   }
   public void myOwnPrintLn(int x){
       System.out.println(x);
   }
    public void myOwnPrintLn(double x){
        System.out.println(x);
    }

}

class MyOwnPrintlnClient  {
    public static void  main(String[] args){
        MyOwnPrintln temp = new MyOwnPrintln();

        temp.myOwnPrintLn(1);
        temp.myOwnPrintLn("ONE");
        temp.myOwnPrintLn(2.2);

    }
}