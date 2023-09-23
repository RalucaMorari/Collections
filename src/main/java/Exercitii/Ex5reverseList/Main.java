package Exercitii.Ex5reverseList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        5. Scrie o metoda care:
//Primeste ca si parametru o lista de cuvinte
// si returneaza lista de cuvinte inversata,
// cu mentiunea ca lista inversata nu va include cuvintele care au lungimea mai mica decat 3
//Exemplu:
//Input: {“ana”, “nu”, “are”, “mere”}
//Output: {“mere”, “are”, “ana”}
        List<String> words = new ArrayList<>();
        words.add("ana");
        words.add("nu");
        words.add("are");
        words.add("mere");
//        System.out.println(words);
        System.out.println(getReverseList(words));

//        String [] words = {"ana", "are", "nu", "mere"};
    }

    public static List<String> getReverseList(List<String> words) {
        List<String> reverseList = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= 3) {
                reverseList.add(word);
                Collections.reverse(reverseList);
            }
        }
        return reverseList;
    }
}







