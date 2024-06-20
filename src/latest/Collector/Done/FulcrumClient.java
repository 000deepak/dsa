package latest.Collector.Done;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FulcrumClient {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Alice", "Bob", "Charlie"};
        String joinedString = join(arrayOfStrings);
        System.out.println("joined string: " + joinedString);
    }

    public static String join(String[] arrayOfString) {
        return Arrays.asList(arrayOfString)
                .stream()
                .collect(Collectors.joining(","));
    }
}
