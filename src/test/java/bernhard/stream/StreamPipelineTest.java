package bernhard.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateStreamPipeline() {
        List<String> list = List.of("Bernhard", "Winner", "Manurung");
        Stream<String> stream = list.stream();
        Stream<String> streamUpper = stream.map(String::toUpperCase);
        Stream<String> streamMr = streamUpper.map(upper -> "Mr. " + upper);
        streamMr.forEach(System.out::println);

    }

    @Test
    void testCreateStreamPipelineOk() {
        List<String> list = List.of("Bernhard", "Winner", "Manurung");
        list.stream()
                .map(String::toUpperCase)
                .map(upper -> "Mr. " + upper)
                .forEach(System.out::println);


    }
}
