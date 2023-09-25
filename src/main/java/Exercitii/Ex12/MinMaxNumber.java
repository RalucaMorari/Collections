package Exercitii.Ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MinMaxNumber {
    public static void main(String[] args) {
//        12. Scrie o metoda care:
//Primeste ca parametru o lista de numere
//Afiseaza cel mai mic si cel mai mare element din lista
//HINT: (alt mod de rezolvare decat cel clasic):
// adauga toate elementele din lista intr-un treeset,
// apoi apeleaza metodele first() si last() pe acel treeset
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        System.out.println(numbers);
        printMinMaxNumbers(numbers);
    }
    public static void printMinMaxNumbers(List<Integer> numbers){
        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.addAll(numbers);
        int min = numbers2.first();
        int max = numbers2.last();
        System.out.println(min);
        System.out.println(max);
    }
}
