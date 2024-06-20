package interview.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class reverseASentence {
    public static void main(String[] args) {
        String str = "india is my country";
        String rev = "";

        //Breaking the sentence into words
        String s[] = str.split(" ");

        //Adding the words stored in the array to the last
        for (int j = 0; j < s.length; j++) {
            rev = s[j] + " " + rev;
        }

        //Printing the reversed sentence
        System.out.println("Reversed sentence: " + rev);



        String sentence = "Hello world this is Java";
        String reversed = reverseSentence(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversed);
    }

    //reverse sentence using streams
    public static String reverseSentence(String sentence) {
        // Split the sentence into words
        List<String> words = Arrays.asList(sentence.split("\\s+"));

        // Reverse the order of words
        Collections.reverse(words);

        // Join the words back into a sentence
        return words.stream().collect(Collectors.joining(" "));
    }
}
