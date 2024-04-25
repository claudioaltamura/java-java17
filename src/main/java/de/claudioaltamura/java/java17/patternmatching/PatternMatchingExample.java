package de.claudioaltamura.java.java17.patternmatching;

public class PatternMatchingExample {

    String toUppercase(Object obj) {
        if (obj instanceof String str) {
            return str.toUpperCase();
        }
        return "";
    }

}