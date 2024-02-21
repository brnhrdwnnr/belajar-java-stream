package bernhard.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTest {

    Stream<String> getStream() {
        return Stream.of("Bernhard", "Winner", "Manurung");
    }

    @Test
    void testCollection() {
        Set<String> set = getStream().collect(Collectors.toSet());
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());

        List<String> list = getStream().collect(Collectors.toList());
        List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
    }

    @Test
    void testMap() {
        Map<String, Integer> map = getStream().collect(Collectors.toMap(
                name -> name,
                String::length
        ));
        System.out.println(map);
    };


}
