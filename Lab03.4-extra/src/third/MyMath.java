package third;

public class MyMath {

    public static final int MINIMUM_AGE = 5;
    public static final int MAXIMUM_AGE = 100;



    int min(int x, int y) {

        if (x < y) {
            return x;
        }

        return y;
    }

    int max(int x, int y) {
        if (x > y) {
            return x;
        }

        return y;
    }


    boolean isAgeInRange(int age){

        if(age >= MINIMUM_AGE && age <= MAXIMUM_AGE){
            return true;
        }

        return false;
    }

}


class Main{
    public static void main(String[] args) {
        MyMath temp = new MyMath();
        System.out.println(temp.max(5,100));
        System.out.println(temp.min(5,100));


        System.out.println(temp.isAgeInRange(100));
        System.out.println(temp.isAgeInRange(5));
    }
}