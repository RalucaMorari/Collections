package Functional;

import java.sql.SQLOutput;
import java.util.function.Supplier;

public class Ex3 {
    public static void main(String[] args) {
        Supplier<String> textSupplier = () -> "Imi place Java";
        System.out.println(textSupplier.get());
    }
}
