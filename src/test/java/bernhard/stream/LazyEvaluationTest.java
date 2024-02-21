package bernhard.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testIntermediateOperations() {
        List<String> names = List.of("Bernhard", "Winner", "Manurung");
        Stream<String> streamNames = names.stream();

        Stream<String> upperNames = streamNames.map( name -> {
            System.out.println("Change " + name + " to UPPERCASE");
            return name.toUpperCase();
        });
    }

    @Test
    void testTerminalOperations() {
        List<String> names = List.of("Bernhard", "Winner", "Manurung");
        Stream<String> streamNames = names.stream();

        streamNames
                .map( name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .map( upper -> {
                    System.out.println("Change " + upper + " to Mr.");
                    return "Mr. " + upper;
                })
                .forEach(mr -> {
                    System.out.println(mr);
                });
    }
}
