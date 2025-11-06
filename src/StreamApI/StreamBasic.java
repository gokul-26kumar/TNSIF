package StreamApI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasic {

    public static void main(String[] args) {

        // Stream from values
        Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 60, 70, 80, 90);
        System.out.println("Number of Elements in Stream: " + stream.count());

        Integer[] values = new Integer[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println("Array Elements: " + Arrays.toString(values));

        // Square each element
        System.out.println("Squared Elements:");
        Arrays.stream(values)
              .map(m -> m * m)
              .forEach(System.out::println);

        // Distinct elements
        System.out.print("Distinct Elements: ");
        Arrays.stream(values)
              .distinct()
              .forEach(n -> System.out.print(n + " "));

        // Skip first 3 elements
        System.out.print("\nSkipped First 3 Elements: ");
        Arrays.stream(values)
              .skip(3)
              .forEach(n -> System.out.print(n + " "));

        // Limit to first 5 elements
        System.out.print("\nLimited to First 5 Elements: ");
        Arrays.stream(values)
              .limit(5)
              .forEach(n -> System.out.print(n + " "));

        // String list operations
        List<String> names = Arrays.asList(
            "Gokul", "Arun", "Priya", "Gokul", "Meena", "Arun", "Kiran", "Divya", "Priya", "Ravi"
        );
        System.out.println("\nOriginal List: " + names);

        // Convert to Uppercase
        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);

        // Convert to Lowercase
        List<String> lowerCaseNames = names.stream()
                                           .map(String::toLowerCase)
                                           .collect(Collectors.toList());
        System.out.println("Lowercase Names: " + lowerCaseNames);
    }
}