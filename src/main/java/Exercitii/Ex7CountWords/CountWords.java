package Exercitii.Ex7CountWords;

import java.util.*;

public class CountWords {

//    7. Scrie o metoda care:
//Primeste ca parametru o lista de cuvinte si returneaza de cate ori apare fiecare cuvant in lista
//Exemplu:
//Input: {“ana”, “are”, “mere”, “are”}
//Output: {ana=1, are=2, mere=1}

    public static void main(String[] args) {
        List<String > words = Arrays.asList("ana","are","mere","are");
        System.out.println(groupWordsByFrequency(words));

    }

    public static Map<String, Integer> groupWordsByFrequency (List<String> words){
        Map<String, Integer> wordsByFrequency = new HashMap<>();
        //parcurg lista si pentru fiecare element:
          //daca este deja acea cheie in mapa
               //cresc valoarea de la acea cheie cu 1
          //daca nu este, adaug cheia cu valoarea 1 in mapa

        for (String word: words) {
            if (wordsByFrequency.containsKey(word)){
                wordsByFrequency.put(word, wordsByFrequency.get(word)+1);
            }
            else{
                wordsByFrequency.put(word,1);
            }
        }
        return wordsByFrequency;

    }
}
