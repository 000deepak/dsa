package string.Basic;

public class reverseASentence {
    public static void main(String[] args) {

    }

    void reverseWords(String s) {
        var arr = s.split(" ");
        String rev = "";
        for(int i = arr.length - 1; i >= 0 ;i--){
            if(arr [i] == " ") continue;
            if(rev.length() > 0 ) rev = rev + " ";

            rev = rev + arr[i];
        }
        System.out.println(rev);
    };
}
