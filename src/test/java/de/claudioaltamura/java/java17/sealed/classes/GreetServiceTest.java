package de.claudioaltamura.java.java17.sealed.classes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreetServiceTest {

    @Test
    void whenGreetMalePersonReturnMr() {
        final var greetService = new GreetService();
        final var malePerson = new Person("Peter", 28, new Male());

        assertThat(greetService.greet(malePerson)).contains("Mr.");
    }

    @Test
    void whenGreetFemalePersonReturnMrs() {
        final var greetService = new GreetService();
        final var femalePerson = new Person("Peter", 28, new Female());

        assertThat(greetService.greet(femalePerson)).contains("Mrs.");
    }

}
