package Exercitii.Ex10Gestiune;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        10. Gestiunea produselor dintr-un magazin
//Într-un magazin există produse, caracterizate de nume, preț, categorie.
// Categoria este un enum, care are valorile LACTATE, MEZELURI, LEGUME&FRUCTE.
// Task-ul este să grupăm produsele după categorii.
//
//Astfel, avem:
//Clasa Product
//Enum-ul Category
//Într-o clasă Shop, avem atributul products,
// care este o mapă având cheia Category (care este un enum) și valoarea o listă de produse (din acea categorie).
//
//Metode:
//Add product
//Adaugă un produs nou în mapa.
//Dacă categoria produsului există deja, se va adăuga produsul la acea categorie în mapa,
// altfel se va crea o nouă categorie în care va fi inițial produsul adăugat.
//getProductByCategory
//Va returna toate produsele dintr-o anumită categorie.
//getAllCategories
//Va returna toate categoriile din mapa.
//deleteProduct
//Va șterge un produs din mapa.

        Product product1 = new Product("salam", 15, Category.MEZELURI);
        Product product2 = new Product("cabanos", 12, Category.MEZELURI);
        Product product3 = new Product("lapte", 5, Category.LACTATE);
        Product product4 = new Product("telemea", 13, Category.LACTATE);
        Product product5 = new Product("morcovi", 1, Category.LEGUME);
        Product product6 = new Product("salata", 2, Category.LEGUME);
        Product product7 = new Product("mere", 3, Category.FRUCTE);
        Product product8 = new Product("prune", 4, Category.FRUCTE);
        List<Product> productsByCategory = new ArrayList<>();
        productsByCategory.add(product1);
        productsByCategory.add(product2);
        productsByCategory.add(product3);
        productsByCategory.add(product4);
        productsByCategory.add(product5);
        productsByCategory.add(product6);
        productsByCategory.add(product7);

       System.out.println(productsByCategory);

        Shop shop = new Shop();

        shop.addProduct(product8);
        System.out.println("Categoria");
        System.out.println(shop.getProductsByCategory(Category.MEZELURI));
        System.out.println("Toate categoriile");
        System.out.println(shop.getAllCategories());
        shop.deleteProduct(product1);
    }
}
