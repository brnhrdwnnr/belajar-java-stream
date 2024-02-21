package bernhard.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        List.of("Ben", "Bernhard", "Win", "Winner", "Manurung").stream()
                .limit(2).forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Ben", "Bernhard", "Win", "Winner", "Manurung").stream()
                .skip(2).forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Ben", "Bernhard", "Win", "Winner", "Manurung").stream()
                .takeWhile(name -> name.length() < 4).forEach(System.out::println);
    }

    @Test
    void testRetrieveSingleElementOperation() {
        Optional<String> optional = List.of("Bend", "Bernhard", "Win", "Winner", "Manurung").stream()
                .findAny();
        optional.ifPresent(name -> {
            System.out.println(name);
        });

        Optional<String> first = List.of("Ben", "Bernhard", "Win", "Winner", "Manurung").stream()
                .findFirst();
        first.ifPresent(name -> {
            System.out.println(name);
        });

    }
}
