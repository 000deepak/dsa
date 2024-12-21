package smartInterviewsBasic107.string;

//Strong Password
//Find the minimum number of characters to add to a password (P) to ensure that P meets the following criteria:
//
//1. Contains at least 6 characters.
//
//2. Contains at least one digit.
//
//3. Contains at least one lowercase character.
//
//4. Contains at least one uppercase character.
//
//5. Contains at least one special character (!@#$%^&*()-+).
//
//
//
//Input Format
//
//First and only line of input contains a string P.
//
//
//
//Output Format
//
//Print the minimum number of characters that has to be added to P.
//
//
//
//Constraints
//
//1 <= len(P) <=50
//
//P[i] ∈ {[a-z], [A-Z], [0-9], or [!@#$%^&*()-+ ]}.
//
//
//
//Example
//
//Input
//
//He!!0
//
//
//
//Output
//
//1
//
//
//
//Explanation
//
//The given password P already contains one digit, one lowercase character, one uppercase character and one special character. However, it should also contain at least 6 characters. So we need to add 1 character to ensure it meets all the criteria.
public class StrongPassword {
      public static int minimumCharactersToAdd(String password) {
        int n = password.length();

        // Track whether the password satisfies each criterion
        boolean hasDigit = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecial = false;

        // Define the set of special characters
        String specialCharacters = "!@#$%^&*()-+";

        // Check the existing characters in the password
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (specialCharacters.contains(String.valueOf(c))) {
                hasSpecial = true;
            }
        }

        // Count the missing criteria
        int missingCriteria = 0;
        if (!hasDigit) missingCriteria++;
        if (!hasLowercase) missingCriteria++;
        if (!hasUppercase) missingCriteria++;
        if (!hasSpecial) missingCriteria++;

        // Ensure the password has at least 6 characters
        int charactersToAddForLength = Math.max(0, 6 - n);

        // The result is the maximum of the missing criteria and characters needed for length
        return Math.max(missingCriteria, charactersToAddForLength);
    }

    public static void main(String[] args) {
        String password = "Ab1"; // Example input
        int result = minimumCharactersToAdd(password);
        System.out.println("Minimum characters to add: " + result);
    }
}
