package Functional.Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//2. Sorteaza o lista de persoane dupa nume, utilizand un comparator
//Comparatorul nu va fi definit printr-o clasa care sa implementeze interfata Comparator
public class Ex2 {
    public static void main(String[] args) {
        Person person2 = new Person("Georgica", 15);
        Person person3 = new Person("Marioara", 25);
        Person person4 = new Person("Mirel", 30);
        Person person1 = new Person("Ionica", 12);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        List<String> namesList = persons.stream()
                .map(person -> person.getName())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(persons);
        System.out.println(namesList);

    }
}
