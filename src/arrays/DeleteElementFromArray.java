package arrays;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeleteElementFromArray {
    public static void main(String[] args) {

    }

    // Another Array
    public static int[] removeTheElement1(int[] arr, int index) {

        if (arr == null || index < 0 || index >= arr.length) return arr;

        int[] anotherArray = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) continue;

            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    // Stream
    public static int[] removeTheElement2(int[] arr, int index) {

        if (arr == null || index < 0 || index >= arr.length) return arr;

        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();
    }

    //Arraylist
    public static int[] removeTheElement3(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) return arr;

        List<Integer> arrayList = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());

        arrayList.remove(index);

        // return the resultant array
        return arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
