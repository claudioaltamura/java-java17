package de.claudioaltamura.java.java17.text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextBlockExampleTest {

    @Test
    void textBlockExample() {
        TextBlockExample textBlockExample = new TextBlockExample();
        assertEquals("Name: Peter\nPhone: 123456\nage: 5\n", textBlockExample.getElement());
    }

}