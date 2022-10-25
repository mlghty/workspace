import java.util.Arrays;
import java.util.List;

public class WordCounting {
    public static void main(String[] args) {


        String temp = "Hello I love Boston. Yes, you do Love Boston love.";
        String[] words = temp.split("[\\s , ?.@]+");

        System.out.println("\n" + Arrays.toString(words));


        int[] wordCount = new int[words.length];

        System.out.println("Words length: " + words.length + " wordCount length: " + wordCount.length + "\n");


//        int count = 1;

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            for (int j = 0; j < words.length; j++) {

//                System.out.println("Current word: " + currentWord);
//                System.out.println("Compared word: " + words[j].toLowerCase() + "\n");

                String comparedWord = words[j];

                if (currentWord.equalsIgnoreCase(comparedWord)) {
                    wordCount[i]++;
                }
            }


//            wordCount[i] = count;
//            wordCount[i]++;
        }


        String[] seenWords = new String[words.length];


        for (int i = 0; i < words.length; i++) {
            List<String> list = Arrays.asList(seenWords);

            if (list.contains(words[i].toLowerCase())) {
                continue;
            } else {

                seenWords[i] = words[i].toLowerCase();
                System.out.println("Word: " + words[i] + " || Count: " + wordCount[i]);

            }

        }


    }
}
