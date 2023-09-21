package Exercitii.Ex2SquareNumbers;

import java.util.ArrayList;
import java.util.List;

public class SquareNumbers {

//    2. Scrie o metoda care:
//primeste ca si parametru o lista de numere si
// returneaza o alta lista de numere formata din numerele din lista primita ca parametru,
// ridicate la patrat (puteti folosi Math.pow(2) pentru a ridica la patrat)
//Exemplu:
//Input: {2,3,4,5}
//Output: {4,9,16,25}

    public static List<Double> getSquareNumbers(List<Double> numbers) {
        List<Double> squareNumbers = new ArrayList<>();
        for (Double number : numbers) {
            squareNumbers.add(Math.pow(number, 2));
        }
        return squareNumbers;
    }
}
