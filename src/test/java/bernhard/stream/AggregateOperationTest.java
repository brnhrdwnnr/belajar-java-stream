package bernhard.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AggregateOperationTest {

    @Test
    void testAggregateOperations() {
        List<String> names = List.of("Ben", "Bern", "Bernhard", "Winner", "Win", "Manurung", "Bern");

        Optional<String> max = names.stream().max(Comparator.naturalOrder());
        max.ifPresent(System.out::println);
        Optional<String> min = names.stream().min(Comparator.naturalOrder());
        min.ifPresent(System.out::println);
        long count = names.stream().count();
        System.out.println(count);
    }

    @Test
    void testReduceOperator() {
        List<Integer> numbers = List.of(1,2,3,4,5);
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        Integer factorial = numbers.stream().reduce(1, (result, item) -> result * item);
        System.out.println(factorial);
    }


}
