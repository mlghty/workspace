package second;

public class MyNumber {

    public int computeRandomInt(int start, int end) {
        int randNum = 0;

        // stackoverflow
        for (int i = 0; i < 50; i++) {
            randNum = (int) (start + (Math.random() * (end - start)));
            System.out.println(randNum);
        }

        return randNum;
    }
}


class Main {
    public static void main(String[] args) {
        MyNumber temp = new MyNumber();

        System.out.println(temp.computeRandomInt(50, 75));
    }
}
