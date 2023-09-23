package Exercitii.Ex6SuperSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words1 = new ArrayList<>();
        words1.add("ana");
        words1.add("are");
        words1.add("mere");
        List<String> words2 = new ArrayList<>();
        words2.add("ana");
        words2.add("are");
        List<String> words3 = new ArrayList<>();
        words3.add("ana");
        words3.add("are");
        words3.add("mere");
        System.out.println(words1);
        System.out.println(words2);
        System.out.println(words3);

        System.out.println(SuperSet.isSuperSet(words1,words2));
        System.out.println(SuperSet.isSuperSet2(words1,words3));
    }
}
