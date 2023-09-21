package Exercitii.Ex2SquareNumbers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        numbers.add(5.0);
//        System.out.println(numbers);

        List<Double> squareNumbers;

        squareNumbers = SquareNumbers.getSquareNumbers(numbers);

//        System.out.println(squareNumbers);

    }
}
