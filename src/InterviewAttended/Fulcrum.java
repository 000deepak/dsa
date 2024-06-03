package InterviewAttended;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fulcrum {
    public static void main(String[] args) {

        //{1,3,4,5,3,2,7,3,6} -> {1,4,5,2,7,6,3,3,3}

        List<Integer> numberList = List.of(1, 3, 4, 5, 3, 2, 7, 3, 6);
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (Integer i : numberList) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        //how to make it immutable

        Map<String, Integer> hm = new HashMap<>();
        hm.put("asdf", 1);
        hm.put("asdf", 2);
        System.out.println(hm.get("asdf"));//2

        String s1 = "May";
        String s2 = "May";
        String s3 = s1;
        s1 = "June";

        s2.concat(" July");
        String newS3 = s3.concat(" June");

        System.out.println("s1 refers to " + s1); //june
        System.out.println("s2 refers to " + s2);//may
        System.out.println("s3 refers to " + s3); //may

        System.out.println("newS3 refers to " + newS3);//mayjune

        Map<String, Integer> hmap = new HashMap<>();
        hmap.put(new String("ABC"), 1);
        hmap.put(new String("ABC"), 2);
        System.out.println(hmap.get("ABC"));//2

        String str = "JournalDev";
        int start = 1;
        int end = 7;
        System.out.println(str.substring(start, end));//ournal

        String stri = null;
        String str1 = "abc";
        System.out.println(str1.equals("abc") || stri.equals(null));//true

    }
}
