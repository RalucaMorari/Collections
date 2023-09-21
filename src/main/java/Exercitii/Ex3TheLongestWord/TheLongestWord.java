package Exercitii.Ex3TheLongestWord;

import java.util.List;

public class TheLongestWord {
//    Gaseste cuvantul cel mai lung dintr-o lista de cuvinte (primita ca parametru), si il returneaza
//Exemplu:
//Input: {“ana”, “are”, “mere”}
//Output: “mere”

    public static String getTheLongestWord(List<String> words) {
        String theLongestWord = "";
        for (String word : words) {
            if (word.length() > theLongestWord.length()) {
                theLongestWord = word;
            }
        }
        return theLongestWord;
    }
}








