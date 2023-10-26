package Exercitii.Ex11;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("122");
        numbers.add("222");
        numbers.add("122");
        numbers.add("223");
//        System.out.println(numbers);
        System.out.println(getDuplicateNumber(numbers));
    }

    public static String getDuplicateNumber(List<String> numbers) {
//        List<String> uniqueNumbers = new ArrayList<>();
//        String duplicateNumber = "";
//        for (String number : numbers) {
//            if (uniqueNumbers.contains(number)) {
//                duplicateNumber = number;
//            } else {
//                uniqueNumbers.add(number);
//            }
//        }
//        return duplicateNumber;

        Set<String> uniqueNumbers = new HashSet<>();
        String duplicateNumber = "";
        for (String number : numbers) {
            if (uniqueNumbers.contains(number)) {
                duplicateNumber = number;
                break;
            } else {
                uniqueNumbers.add(number);
            }
        }
        return duplicateNumber;
    }
}





//        11. Scrie o metoda care:
//Primeste ca parametru o lista de numere, care are un element duplicat
//Returneaza elementul duplicat
//HINT: (alt mod de rezolvare decat cel clasic):
// metoda add din interfata Set returneaza false,
// daca nu poate adauga elementul primit ca parametru in set




