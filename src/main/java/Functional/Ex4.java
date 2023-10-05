package Functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Scrie codul astfel incat sa sortezi lista si astfel incat fiecare nume sa inceapa cu litera mare.
//
//De exemplu, numele "harry" va deveni "Harry" si va fi intre "Emily" si "Isla".
//
//List<String> topNames2015 = Arrays.asList(
//                "Amelia",
//                "Olivia",
//                "emily",
//                "Isla",
//                "Ava",
//                "oliver",
//                "Jack",
//                "Charlie",
//                "harry",
//                "Jacob"
//        );
//Apoi, in loc sa sortezi lista, afla de cate nume care incep cu 'A' sunt in lista.
public class Ex4 {
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList("Amelia","Olivia", "emily","Isla","Ava", "oliver", "Jack", "Charlie", "harry", "Jacob");

        List <String> sortedNames = topNames2015.stream()
                .map(name ->{return Character.toUpperCase(name.charAt(0))+name.substring(1);})
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames);

       Long NumberOfNamesStartWithA = topNames2015.stream()
                // luam doar numele care incep cu A
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println(NumberOfNamesStartWithA);


    }
}
