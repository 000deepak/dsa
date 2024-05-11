package interview.duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicateWords {
    public static void main(String[] args) {
        String sentence = "Java is a programming language and Java is widely used for web development";
        String[] wordsArr = sentence.toLowerCase().split(" ");
        System.out.println(Arrays.toString(wordsArr));

        System.out.println("Duplicate words in the sentence:");
        for (int i = 0; i < wordsArr.length; i++) {
            for (int j = i + 1; j < wordsArr.length; j++) {
                if (wordsArr[i].equals(wordsArr[j])) {
                    System.out.println(wordsArr[i]);
                    break;
                }
            }
        }

        List<String> words = Arrays.asList(sentence.split(" "));

        Map<String, Long> wordCounts = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Duplicate words in the sentence are:");
        wordCounts.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}
