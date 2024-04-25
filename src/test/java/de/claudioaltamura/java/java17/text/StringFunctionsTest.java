package de.claudioaltamura.java.java17.text;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static de.claudioaltamura.java.java17.text.StringFunctions.getCommaSeparatedList;
import static org.junit.jupiter.api.Assertions.*;

class StringFunctionsTest {

    @Test
    void transform() {
        Function<String, List<String>> transformFunction = s -> Arrays.asList(s.split(","));
        List<String> actual = getCommaSeparatedList().transform(transformFunction);
        assertEquals(5, actual.size());
    }

}