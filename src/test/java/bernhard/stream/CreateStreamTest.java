package bernhard.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);
        Stream<String> oneStream = Stream.of("Eko");
        oneStream.forEach(System.out::println);
        Stream<String> emptyOrNotStream = Stream.ofNullable(null);
        emptyOrNotStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> streamString = Stream.of("Bernhard", "Winner", "Manurung");
        System.out.println(streamString);
        streamString.forEach(System.out::println);
        Stream<Integer> streamInteger = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        streamInteger.forEach(System.out::println);
        Stream<String> streamArray = Arrays.stream(new String[]{"Bernhard", "Winner", "Manurung"});
        System.out.println(streamArray);
        streamArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collectionString = List.of("Bernhard", "Winner", "Manurung");
        Stream<String> streamString = collectionString.stream();
        streamString.forEach(System.out::println);
    }

    @Test
    void testCreateStreamIterate() {

        Stream<String> stream1 = Stream.generate(()-> "Bernhard");
//        stream1.forEach(System.out::println);
        Stream<String> stream2 = Stream.iterate("Bernhard", value -> value.toUpperCase());
//        stream2.forEach(System.out::println);
    }
}
