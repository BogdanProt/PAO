package Lab10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex1 {
    public static void main(String[] args) {
        Integer[] nums = {5, 2, 8, 10, 3, 1};
        //1:
        Arrays.sort(nums, (a, b) -> b - a);
        System.out.println("Array sortat desc: " + Arrays.toString(nums));

        //2:
        int sum1 = Arrays.stream(nums).reduce(0, Integer::sum);
        System.out.println("Suma intregilor folosind reduce: " + sum1);

        //3:
        int sum2 = Arrays.stream(nums).collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Suma intregilor folosind summingInt: " + sum2);

        //4:
        double average = Arrays.stream(nums).collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Media intregilor folosind averagingInt: " + average);

        //5:
        Optional<Integer> min = Arrays.stream(nums).min((a, b) -> a - b);
        min.ifPresent(value -> System.out.println("Valoarea min: " + value));

        //6:
        Optional<Integer> max = Arrays.stream(nums).max((a, b) -> a - b);
        max.ifPresent(value -> System.out.println("Valoarea max: " + value));

        //7:
        int prag = 4;
        Predicate<Integer> greaterThanThreshold = num -> num > prag;
        List<Integer> filteredNumbers = Arrays.stream(nums)
                .filter(greaterThanThreshold)
                .collect(Collectors.toList());
        System.out.println("Intregii mai mari de " + prag + ": " + filteredNumbers);
    }
}
