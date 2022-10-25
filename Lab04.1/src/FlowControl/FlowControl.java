package FlowControl;

import jdk.swing.interop.SwingInterOpUtils;

public class FlowControl {

    public static boolean isItEvenNumber(int number){
        if(number % 2 == 0){
            System.out.println("EVEN!");
            return true;
        }


        System.out.println("ODD!");
        return false;
    }

    public static int hexCharToDecimal(char hexChar){

        switch (hexChar) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            default:
                System.out.println("Invalid!");
                return hexChar;
        }




    }

}

class Main{
    public static void main(String[] args) {
        FlowControl.isItEvenNumber(2);
        FlowControl.isItEvenNumber(4);

        FlowControl.isItEvenNumber(5);
        FlowControl.isItEvenNumber(7);



        System.out.println(FlowControl.hexCharToDecimal('A'));



    }
}
