package de.claudioaltamura.java.java17.sealed.classes;

class GreetService {

    String greet(Person person) {
        if(person.gender() instanceof Male) {
            return "Mr. " + person.name();
        } else if (person.gender() instanceof Female) {
            return "Mrs. " + person.name();
        } else {
            throw new RuntimeException("unknown instance of " + person.gender());
        }
    }
}
