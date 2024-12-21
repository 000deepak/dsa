package smartInterviewsBasic107.string;

//Reverse String
//Given a string, reverse the given string in place and then print it.
//
//
//
//Note:
//
//Do not use any inbuilt functions / libraries for your main logic.
//
//
//
//Input Format
//The input contains a string S, consisting of ASCII characters.
//
//
//
//Output Format
//
//Print the reversed string.
//
//
//
//Constraints
//
//1 <= len(s) <= 100
//
//
//
//Example
//
//Input
//
//smart
//
//
//
//Output
//
//trams
//
//
//
//Explanation
//
//
//
//Self Explanatory
public class ReverseString {
    public static void main(String[] args) {
        String rev = "";
        String s = "ewwet";
        for(int i = s.length() -1; i>= 0; i--){
            rev += s.charAt(i);
        }
    }


}
