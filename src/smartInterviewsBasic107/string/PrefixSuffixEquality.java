package smartInterviewsBasic107.string;

//Prefix Suffix Equality
//Given strings S and T. Print "Yes", if T is both a prefix and a suffix of S, otherwise "No".
//
//
//
//Input Format
//
//First and only line of input contains two strings separated by a space.
//
//
//
//Output Format
//
//Print "Yes", if T is both a prefix and a suffix of S, otherwise "No".
//
//
//
//Constraints
//
//1 <= len(S), len(T) <= 1000
//
//'a' <= S[i], T[i] <= 'z'
//
//
//
//Example
//
//Input
//
//smartinterviewssmart smart
//
//
//
//Output
//
//Yes
//
//
//
//Explanation
//
//
//
//Self Explanatory
public class PrefixSuffixEquality {
      public static String isPrefixAndSuffix(String S, String T) {
        // Check if T is longer than S
        if (T.length() > S.length()) {
            return "No";
        }

        // Check if T is a prefix
        boolean isPrefix = S.startsWith(T);

        // Check if T is a suffix
        boolean isSuffix = S.endsWith(T);

        // Return "Yes" if both conditions are true, otherwise "No"
        return (isPrefix && isSuffix) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        String S = "abcdeabc"; // Example string S
        String T = "abc";     // Example string T

        System.out.println(isPrefixAndSuffix(S, T)); // Output: Yes
    }
}
