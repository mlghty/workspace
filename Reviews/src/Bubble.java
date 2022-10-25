import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] ints = {3,9,6,2,1,10,5};

        int tempGreater = 0;
        int tempLeseer = 0;
        int[] sorted = new int[ints.length];

        for (int i = 0; i < ints.length; i++){
            System.out.println("Swapping: " + tempGreater + " > " + tempLeseer);

            for (int j = 1; j < (ints.length); j++){
//                System.out.println("Value: " + ints[j]);

                if (ints[j-1] > ints[j]){

                    tempGreater = ints[j-1];
                    ints[j-1] = ints[j];
                    tempLeseer = ints[j];
                    ints[j] = tempGreater;

                    System.out.println("Swapping: " + tempGreater + " > " + tempLeseer);
                    System.out.println(Arrays.toString(ints));
                    System.out.println("\n");


                }


            }
        }


        System.out.println(Arrays.toString(ints));
    }
}
