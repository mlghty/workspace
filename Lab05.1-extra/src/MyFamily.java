import java.util.EnumSet;

enum MyFamily {

    JOE,
    JANE,
    TOM,
    JERRY;
}


class Main{
    public static void main(String[] args) {


        System.out.println("For loop using .values()");
        for (MyFamily member : MyFamily.values()){
            System.out.println(member);
        }

        System.out.println("\nFor loop using EnumSet");

        for (MyFamily member : EnumSet.range(MyFamily.JOE, MyFamily.JERRY)){
            System.out.println(member);
        }

    }
}