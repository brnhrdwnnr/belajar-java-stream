package bernhard.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEeachOperation {

    @Test
    void testWithoutPeek() {
        List.of("Ben", "Win", "Bernhard", "Winner").stream()
                .map( name -> {
                    System.out.println("Before change name to upper : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change name to upper : " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final name : " + name));

    }

    @Test
    void testWithPeek() {
        List.of("Ben", "Win", "Bernhard", "Winner").stream()
                .peek(name -> System.out.println("Before change name to upper : " + name))
                .map( name -> name.toUpperCase())
                .peek(upper -> System.out.println("Change name to upper : " + upper))
                .forEach(name -> System.out.println("Final name : " + name));

    }
}
