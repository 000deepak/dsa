package string;

public class isAlphabet {
    public static void main(String[] args) {
        char character = 'A'; // Replace 'A' with the character you want to check

        // Check if the character is an uppercase letter
        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            System.out.println(character + " is an alphabet.");
        } else {
            System.out.println(character + " is not an alphabet.");
        }
    }
}
