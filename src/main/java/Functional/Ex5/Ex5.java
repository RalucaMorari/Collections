package Functional.Ex5;

import Functional.Ex2.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//5. Sterge persoanele care nu pot vota
//Avand o lista de persoane, sterge din lista persoanele care au varsta mai mica decat 18 ani, folosind expresii lambda.
public class Ex5 {
    public static void main(String[] args) {
        Functional.Ex2.Person person2 = new Functional.Ex2.Person("Georgica", 15);
        Functional.Ex2.Person person3 = new Functional.Ex2.Person("Marioara", 25);
        Functional.Ex2.Person person4 = new Functional.Ex2.Person("Mirel", 18);
        Functional.Ex2.Person person1 = new Functional.Ex2.Person("Ionica", 12);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        List<Person> PersonsThatCanVote = persons.stream()
                .filter(person -> person.getAge()>=18)
                .collect(Collectors.toList());

        System.out.println(PersonsThatCanVote);

    }
}
