package de.claudioaltamura.java.java17.switchexpression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchExpressionEnhancementTest {

    @Test
    void switchExpression() {
        SwitchExpressionEnhancement switchPatternMatching = new SwitchExpressionEnhancement();

        assertEquals("Looks like a Sunday.", switchPatternMatching.day("x"));
    }

}