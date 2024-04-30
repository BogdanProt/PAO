package Lab10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex2 {
    public static void main(String[] args) {
        int[] ar2 = {5, 2, 8, 10, 3, 1};

        //1:
        Arrays.sort(ar2);
        System.out.println("Array sortat cresc: " + Arrays.toString(ar2));

        //2:
        int[] sortedDesc = IntStream.of(ar2)
                .boxed()
                .sorted((a, b) -> b - a)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Array sortat descresc: " + Arrays.toString(sortedDesc));

        //3:
        int[] squaredArray = Arrays.stream(ar2)
                .map(num -> num * num)
                .toArray();
        System.out.println("Elementele ridicate la patrat: " + Arrays.toString(squaredArray));
    }
}
