package latest.Collector.Done;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MercedesBenzRound2 {

    // only print the last occurence of the duplicate words
    public static void main(String[] args) {
        String s = "Hi my name is Deepak i like people calling me by the name Deepak i like coding in java my hobbies are trekking";
        String[] arr = s.split(" ");
        Set<String> wordFreq = new LinkedHashSet<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            wordFreq.add(arr[i]);
        }

        List<String> wordList = new ArrayList<>();

        for(String stri : wordFreq){
           wordList.add(stri);
        }

        wordList.reversed();
        System.out.println(wordList.reversed());
    }
}

