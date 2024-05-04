package interview.reverse;

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
    }
}
