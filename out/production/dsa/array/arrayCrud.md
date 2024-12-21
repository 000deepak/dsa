
```java

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7};

        insert(arr, 1, 90);
        printArray(arr);
        
        update(arr, 1, 10);
        printArray(arr);

        delete(arr, 1);
        printArray(arr);
    }

    public static void insert(int arr[], int pos, int element) {
        int n = arr.length;
        if (pos < 0 || pos > n - 1) {
            System.out.println("Wrong position");
            return;
        }
        // shifting towards the end
        for (int i = n - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = element;
    }

    public static void update(int arr[], int pos, int element) {
        int n = arr.length;
        if (pos < 0 || pos > n - 1) {
            System.out.println("Wrong position");
            return;
        }
        arr[pos] = element;
    }

    public static void delete(int arr[], int pos) {
        // shifting towards starting index
        for (int i = pos; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    //2d array
    public static void print2dArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("For " + i + " index");
            printArray(arr[i]);
        }
    }

    public static void insert2dArray(int arr[][], int pos1, int pos2, int element) {
        insert(arr[pos1], pos2, element);
    }

    public static void delete2dArray(int arr[][], int pos1, int pos2) {
        delete(arr[pos1], pos2);
    }

    public static void update2dArray(int arr[][], int pos1, int pos2, int element) {
        int n1 = arr.length;
        if (pos1 < 0 || pos1 > n1 - 1) {
            System.out.println("Wrong position");
            return;
        }
        int n2 = arr[pos1].length;
        if (pos2 < 0 || pos2 > n2 - 1) {
            System.out.println("Wrong position");
            return;
        }

        arr[pos1][pos2] = element;
    }
}

```
