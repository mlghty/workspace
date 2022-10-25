import java.util.Arrays;

public class StringMethodsExample {


    public static void main(String[] args) {


        String x = "The quick brown fox jumps over the lazy dog";
        String x1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

        String y = "The quick black cat jumps over the lazy dog";

        String y2 = "     The quick black cat jumps over the lazy dog       ";

        System.out.println("a. String x contains 'fox': " + x.contains("fox"));


        System.out.println("b. String x ends with 'fox': " + x.endsWith("fox"));

        System.out.println("c. String y == x: " + x.equals(y));
        System.out.println("d. String x == x1: *ignorecase " + x.equalsIgnoreCase(x1));

        System.out.println("e. String x index of 'fox' starts: " + x.indexOf("fox"));

        System.out.println("f. String x length: " + x.length());


        String[] words = x.split("\\s+");
        System.out.println("g. String x split to array: " + Arrays.toString(words));

        String[] words2 = x.split("\\s+",3);

        System.out.println("g. String x split to array *only first two words: " + Arrays.toString(words2));


        System.out.println("h. String x starts with 'fox' : " + x.startsWith("fox"));


        System.out.println("i. String y2 !stripped: " + y2);
        System.out.println("i. String y2 stripped: " + y2.strip());


        System.out.println("j. String x to substring @ pos 16: " + x.substring(16));


        System.out.println("k. String x1 to lower case: " + x.toLowerCase());

        System.out.println("l. String x to upper case: " + x.toUpperCase());


    }





}

