import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5,4};
        ArrayList<Integer> max = new ArrayList<>();

        List<Integer> l = Arrays.asList(arr);
        Integer f = l.stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);

        System.out.println(Collections.max(l));
    }


}
