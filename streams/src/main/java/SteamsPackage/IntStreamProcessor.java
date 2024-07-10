package SteamsPackage;

import java.util.*;
import java.util.stream.*;

public class IntStreamProcessor {
    public List<Integer> sortTwoDigitNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n >= 10 && n < 100)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
    }

    public OptionalDouble findAverage(int[] numbers) {
        return Arrays.stream(numbers).average();
    }
}
