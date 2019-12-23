package by.yermalovich.filtrationbenchmarks;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestCases {
    private static final int INT_SIZE = 10000;
    private List<Integer> integers;
    private Predicate<Integer> strangePredicate = i -> (i % 2 == 0) && i < 100 && (i * i) < 2000;

    public TestCases() {
        integers = new Random()
                .ints(INT_SIZE)
                .boxed()
                .collect(Collectors.toList());
    }

    public long customPredicate() {
        return integers
                .stream()
                .filter(strangePredicate)
                .count();
    }

    public long filterCain() {
        return integers.stream()
                .filter(i -> i % 2 == 0)
                .filter(i -> i < 100)
                .filter(i -> (i * i) < 2000)
                .count();
    }

    public long simpleIteration() {
        long count = 0L;
        for (Integer i : integers) {
            if (i % 2 == 0 && i < 100 && (i * i) < 2000) {
                count++;
            }
        }
        return count;
    }
}
