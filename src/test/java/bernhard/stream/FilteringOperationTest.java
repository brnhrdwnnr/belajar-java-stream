package bernhard.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {

    @Test
    void testFilteringOperation() {
        List<String> names = List.of("Bernhard", "Winner", "Manurung", "Renniw");

        names.stream().filter(name -> name.length() > 6).forEach(System.out::println);
        names.stream().distinct().forEach(System.out::println);
    }
}
