package interview.frequency;

public class charOccurence {
    public static void main(String[] args) {
        String str = "hello world";

        int[] charCounts = new int[256]; // Assuming ASCII characters

        // Counting occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }

        // Printing occurrences of each character
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] != 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }
}
