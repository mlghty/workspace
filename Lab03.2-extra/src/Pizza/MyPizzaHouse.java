package Pizza;

public class MyPizzaHouse {

    private float cost;
    private int size;


    private void PreparePizza(){

        System.out.println("Preparing Pizza");
    }

    private void addToppings(){
        System.out.println("adding toppings");


    }

    private void bake(){
        System.out.println("Baking pizza");

    }


    public void makePizza(){
        PreparePizza();
        addToppings();
        bake();
    }

}


class Main{
    public static void main(String[] args) {
        MyPizzaHouse p1 = new MyPizzaHouse();

        p1.makePizza();
    }
}