package bernhard.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {

    @Test
    void testOrderingOperations() {
        List<String> names = List.of("Ben", "Bern", "Bernhard", "Win", "Winner", "Manurung");
        names.stream().sorted().forEach(System.out::println);
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
