package Exercitii.Ex4PositiveNumbers;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
///Input: {1, -2, 3, 4, 4, -5}, {1, -7, 2}
//

        numbers1.add(1);
        numbers1.add(-2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(4);
        numbers1.add(-5);
        System.out.println(numbers1);

        numbers2.add(1);
        numbers2.add(-7);
        numbers2.add(2);
        System.out.println(numbers2);

        System.out.println(extractPositiveNumbers(numbers1,numbers2));

    }

    public static Set<Integer> extractPositiveNumbers(List<Integer> numbers1, List<Integer> numbers2){
        Set<Integer> result = new HashSet<>();
        for(Integer number: numbers1){
            if (number >=0){
                result.add(number);
            }
        }
        for (Integer number: numbers2){
            if (number>=0){
                result.add(number);
            }
        }
        return result;
    }
}
