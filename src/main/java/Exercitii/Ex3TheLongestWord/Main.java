package Exercitii.Ex3TheLongestWord;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("ana");
        words.add("are");
        words.add("mere");
        System.out.println(words);


        System.out.println( TheLongestWord.getTheLongestWord(words));
    }
}
