package character;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        String s = "4PREP2INSTAA6";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                sum = sum + Character.getNumericValue(s.charAt(i));
        }
        System.out.println("Sum of all the digit present in String : " + sum);


        String str = "pr2ep4in5st1";
        int res = 0;
        str = str.replaceAll("[^0-9]", "");
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            res = res + Character.getNumericValue(ch[i]);
        }
        System.out.println(" " + res + " ");
    }
}
