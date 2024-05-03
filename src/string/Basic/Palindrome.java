package string.Basic;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    public static void main(String[] args) {
        String s = "arora";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) rev = rev + s.charAt(i);
        if (s.equals(rev)) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }

    void checkIfPangram(sentence) {
        let letters = new Set() ;
        for(let i=0;i<sentence.length;i++){
            let char = sentence[i].toLowerCase();
            if(char >= 'a' && char <= 'z'){
                letters.add(char);
            }
        }
    return letters.size===26;
    }

    var mostWordsFound = function(sentences) {
        let max = 0;
        let temp = 0;
        for (let i = 0; i < sentences.length; i++) {
            temp = sentences[i].split(" ").length;
            if (temp > max) {
                max = temp;
            }
        }

        return max;
    };

    var isPalindrome = function(s) {
        s = s.toLowerCase().replace(/[^a-z0-9]/g, '');
        let left=0;
        let right = s.length-1;
        while(left<right){
            if(s[left]!==s[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    };

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            map.put(charS, map.getOrDefault(charS, 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            char charT = t.charAt(j);

            if (!map.containsKey(charT) || map.get(charT) == 0) {
                return false;
            }

            map.put(charT, map.get(charT) - 1);
        }

        return true;
    }
}
