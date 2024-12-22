package smartInterviewsBasic107.array;

//find the first and last occurrences of a given element X in the array A and print them.
public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int x =2;
        int firstIndex = -1;
        int lastIndex = -1;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == x) {
                if(firstIndex == -1){
                    firstIndex = i;
                }

                lastIndex = i;
            }

        }

        System.out.println(firstIndex + " " + lastIndex);
    }
}
