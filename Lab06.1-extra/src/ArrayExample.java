import java.util.Arrays;
import java.util.Locale;

public class ArrayExample {

    private final static String[] NAMES = {"Joe", "Jane", "John"};


    public static void convertAndDisplayNamesToUpperCase() {
        String[] upperNames = new String[NAMES.length - 1];
        for (String name : NAMES)
            System.out.println(name.toUpperCase());

    }


    public static int[] findOddNumbersFromArray(int[] numbers) {

        int count = 0;

        for (int i : numbers)
            if (i % 2 == 1)
                count++;

        int[] copy = new int[count];

        for (int i = 0, j = 0; i < numbers.length; i++)
            if (numbers[i] % 2 != 0)
                copy[j++] = numbers[i];

        return copy;

    }


    public static int findLargestNumberFromArray(int[] numbers) {
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > max)
                max = numbers[i];

        return max;
    }


    public static void convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs(String myName, String... myFriends) {

        System.out.println("My name: " + myName);
        System.out.print("My friends name: ");
        for (String friends : myFriends) {
            System.out.print(friends.toUpperCase() + " , ");
        }
    }

}

class main {
    public static void main(String[] args) {

        // first
        ArrayExample.convertAndDisplayNamesToUpperCase();

        // second
        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("\nOdds from array: " + Arrays.toString(ArrayExample.findOddNumbersFromArray(temp)));


        // third
        int[] temp2 = {8, 3, 2, 1, 4, 5, 6, 10, 8, 2, 3};
        System.out.println("\nMax number from: " + Arrays.toString(temp2) + " = " + ArrayExample.findLargestNumberFromArray(temp2));

        // fourth
        System.out.println("\nVargs before uppercase : " + Arrays.toString(args));
        ArrayExample.convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs("Joe", args);

    }
}

//  Exercise #1 – array of String
//
//
//
//  Define "ArrayExample" class under "Lab05-extra" module
//
//  Create an array of String as a field of the class and initialize it with 3 or more names of your family (or friends)
//
//  Add and implement a method called "void convertAndDisplayNamesToUpperCase()", in which you are going to use a for-loop to display uppercased name of each member of your family
//
//  Add client code to invoke the above method
//
//
//
//  Exercise #2 – array of int
//
//
//
//   Add and implement a static method called "int[] findOddNumbersFromArray(int[] numbers)", which takes an array of int argument and returns a new array of int with only odd numbers
//
//   Add client code to invoke the method with test int array of {1,2,3,4,5,6,7,8,9}
//
//
//
//   Exercise #3 – array of int
//
//
//
//   Add and implement a static method called "int findLargestNumberFromArray(int[] numbers)", which takes an array of int argument and returns the largest number
//
//   Add client code to invoke the method with test int array of {8,3,2,1,4,5,6,10,8,2,3}
//
//
//
//   Exercise #4 – Varargs
//
//
//
//   Add and implement a static method called "void convertAndDisplayNamesOfMyFriendsToUpperCaseUsingVarargs(String myName, Sring... myFriends)", which takes zero or more names of your friends as varargs and display uppercased name of each name passed
//
//   Add client code to invoke the method above 3 times each with different number of friends