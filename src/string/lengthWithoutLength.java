package string;

public class lengthWithoutLength {
    public static void main(String[] args) {
        int length=0;

        String s = "prepinsta";
        for (char c1 : s.toCharArray()){
            length++;
            System.out.println("Length of String is : "+length);
        }
    }
}
