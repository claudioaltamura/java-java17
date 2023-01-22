package de.claudioaltamura.java.java17.sealed.classes;

class GreetService {

    String greet(Person person) {
        // --enable-preview
        var salutation = switch(person.gender()) {
            case Male m -> "Mr.";
            case Female f -> "Mrs.";
            default -> throw new RuntimeException("unknown instance of " + person.gender());
        };

        return salutation + " " + person.name();
    }
}
