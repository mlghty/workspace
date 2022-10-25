import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String[] temp = {"2","40","7","5"};
        int[] ints = new int[temp.length];
        for (int i =0; i< temp.length;i++){
            ints[i] = Integer.parseInt(temp[i]);

        }
        System.out.println("Strings: " + Arrays.toString(temp));
        System.out.println("ints:" + Arrays.toString(ints));


        String initialString = "I love Boston. Yes, you do love boston.";
        String[] strings = initialString.split("[\\s , ?.@]+");
        String[] lowercase = new String[strings.length];

        for (int i = 0; i < strings.length; i++){
            boolean unique = true;

            for (int j = 0; j < i;j++){

                if (strings[i].equalsIgnoreCase(strings[j])){
                    unique = false;
                }

            }

            if (unique)
                lowercase[i] = strings[i].toLowerCase();

        }

        System.out.println("Original: " + Arrays.toString(strings) );
        System.out.println("Lower case: " + Arrays.toString(lowercase) );



        String temp2 = "Life is good";

        char[] characters = temp2.toCharArray();

//        for (int i =0 ;i <characters.length){
//
//        }
        System.out.println("Char array: " + Arrays.toString(characters));
    }
}
