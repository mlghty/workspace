package iteration;

public class Iteration {

    public static void displayNumbersUsingForLoop(int start, int end) {

//        for (; start < end ; start++) {
        for (int i = start; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void displayNumbersUsingWhile(int start, int end) {

        while (start < end) {
            System.out.print(start + " ");
            start++;
        }
        System.out.println();
    }


    public static void displayNumbersUsingDoWhile(int start, int end) {

        do {
            System.out.print(start + " ");
            start++;

        } while (start < end);

        System.out.println();
    }


    public static void displayEvenNumbersOnlyUsingForLoop(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}


class Main {
    public static void main(String[] args) {

        // 0 - 9
        Iteration.displayNumbersUsingForLoop(0, 10);
        // 0 - 9
        Iteration.displayNumbersUsingWhile(0, 10);
        // 0 - 9
        Iteration.displayNumbersUsingDoWhile(0, 10);
        // 0 2 4 6 8
        Iteration.displayEvenNumbersOnlyUsingForLoop(0, 10);

    }
}