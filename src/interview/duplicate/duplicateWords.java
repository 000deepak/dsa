package interview.duplicate;

import java.util.Arrays;

public class duplicateWords {
    public static void main(String[] args) {
        String sentence = "Java is a programming language and Java is widely used for web development";
        String[] words = sentence.toLowerCase().split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("Duplicate words in the sentence:");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println(words[i]);
                    break;
                }
            }
        }
    }
}
