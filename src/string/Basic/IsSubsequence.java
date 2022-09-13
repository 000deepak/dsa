package string.Basic;

/**
 * find if A is a subsequence of B.
 * All the characters of A must be present in B,not necessarily consecative.
 * Input:
 * A = gksrek
 * B = geeksforgeeks
 * Output: 1
 * Explanation: A is a subsequence of B.
 *
 * Input:
 * A = AXY
 * B = YADXCP
 * Output: 0
 * Explanation: A is not a subsequence of B
 * as 'Y' appears before 'A'.
 */
public class IsSubsequence {
    public static void main(String[] args) {

        IsSubsequence is = new IsSubsequence();
        is.isSubSequence("depek", "ee");


    }

    boolean isSubSequence(String A, String B) {
        int j = 0;
        //loop B
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == A.charAt(j)) j++;

            //immediately check if A is over
            if (j == A.length()) return true;
        }
        return false;
    }
}
