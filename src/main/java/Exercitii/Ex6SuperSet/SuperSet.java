package Exercitii.Ex6SuperSet;

import java.util.List;

public class SuperSet {
//    6. Scrie o metoda care:
//Primeste ca parametru doua set-uri si
// returneaza true
// daca primul set primit ca parametru
// este superset al celui de-al doilea set
//Un set “set1” este superset al altui set “set2”,
// daca “set1” contine toate elementele din “set2”,
// dar seturile nu sunt egale - containsAll()
//Exemple:
//Input1: {“ana”, “are”, “mere”}, {“ana”, “are”}
//Output1: true
//Input2: {“ana”, “are”, “mere”}, {“ana”, “are”, “mere”}
//Output2: false

    public static List<String> words1;
    public static List<String> words2;
    public static List<String> words3;

public static boolean isSuperSet(List<String> words1, List<String> words2){
    if(words1.equals(words2)){
        return false;
    } else
        if((words1.containsAll(words2))) {
        }
    return true;
    }

    public static boolean isSuperSet2(List<String> words1, List<String> words3){
        if(words1.equals(words3)){
            return false;
        } else
        if((words1.containsAll(words3))) {
        }
        return true;
    }
}
